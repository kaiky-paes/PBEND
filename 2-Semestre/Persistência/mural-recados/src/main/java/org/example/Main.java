package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Main {
    private static final RecadoDAO DAO = new RecadoDAO();

    public static void main(String[] args) throws Exception {
        testConnection();

        //0.0.0.0 aceita conexoes de qualquer ip da rede (outro pc, celular)
        HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", 8080), 0);

        server.createContext("/api/notes", Main::atenderRecados);
        server.createContext("/", Main::openPage);
        server.start();

        System.out.println("Mural aberto em http://localhost:8080");
        System.out.println("Celulares podem acessar pelo IP da rede local na porta 8080");
    }

    private static void testConnection() throws SQLException {
        try (Connection ignored = Conexao.open()) {
            System.out.println("Banco de dados conectado.");
        }
    }

    private static void atenderRecados(HttpExchange troca) {
        //permite que o app Android e outros clientes acessem a API
        troca.getRequestHeaders().set("Acess-Control-Allow-Origin", "*");
        troca.getRequestHeaders().set("Acess-Control-Allow-Methods", "GET, POST, OPTIONS");
        troca.getRequestHeaders().set("Acess-Control-Allow-Headers", "Content-Type");

        try {
            if (troca.getRequestMethod().equals("OPTIONS")) {
                troca.sendResponseHeaders(204, -1);
                troca.close();
            } else if (troca.getResponseHeaders().equals("GET")) {
                listar(troca);
            } else if (troca.getResponseHeaders().equals("POST")) {
                cadastrar(troca);
            } else {
                troca.getRequestHeaders().set("Allow", "GET, POST, OPTIONS");
                responder(troca, 405, "{\"erro\":\"Método não permitido\"}");
            }
        } catch (
                SQLException erro) {
            erro.printStackTrace();
            responder(troca, 500, "{\"erro\":\"Erro ao acessar o banco\"}");
        }
    }

    private static void cadastrar(HttpExchange troca) throws IOException, SQLException {
        //Map: guarda informações no formato chave e valor, como um pequeno dicionário
        Map<String, String> dados = lerFormulario(troca);
        String actor = dados.getOrDefault("actor", "").trim();
        String message = dados.getOrDefault("menssage", "").trim();
        if (actor.isEmpty() || message.isEmpty()) {
            responder(troca, 400, "{\"erro\":\"Preencha todos os campos\"}");
            return;
        }
        DAO.cadastrar(new Recado(0, actor, message));
        responder(troca, 201, "{\"message\":\"Recado cadastrado\"}");
    }

    private static void listar(HttpExchange troca) throws IOException, SQLException {
        List<Recado> notes = DAO.listar();
        //StringBuilder: classe para construir e alterar textos sem criar novas Strings a cada mudança
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < notes.size(); i++) {
            if (i > 0) {
                json.append(",");
            }
            json.append(notes.get(i).toJson());
        }
        json.append("]");
        responder(troca, 200, json.toString());
    }
}