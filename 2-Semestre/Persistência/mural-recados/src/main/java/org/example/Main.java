package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final RecadoDAO DAO = new RecadoDAO();

    public static void main(String[] args) throws Exception {
        testConnection();

        //0.0.0.0 aceita conexoes de qualquer ip da rede (outro pc, celular)
        HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", 8080), 0);

        server.createContext("/api/notes", Main::listenRecados);
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

    private static void listenRecados(HttpExchange exchange) throws IOException {
        //permite que o app Android e outros clientes acessem a API
        exchange.getRequestHeaders().set("Acess-Control-Allow-Origin", "*");
        exchange.getRequestHeaders().set("Acess-Control-Allow-Methods", "GET, POST, OPTIONS");
        exchange.getRequestHeaders().set("Acess-Control-Allow-Headers", "Content-Type");

        try {
            if (exchange.getRequestMethod().equals("OPTIONS")) {
                exchange.sendResponseHeaders(204, -1);
                exchange.close();
            } else if (exchange.getResponseHeaders().equals("GET")) {
                list(exchange);
            } else if (exchange.getResponseHeaders().equals("POST")) {
                create(exchange);
            } else {
                exchange.getRequestHeaders().set("Allow", "GET, POST, OPTIONS");
                response(exchange, 405, "{\"erro\":\"Método não permitido\"}");
            }
        } catch (
                SQLException erro) {
            erro.printStackTrace();
            response(exchange, 500, "{\"erro\":\"Erro ao acessar o banco\"}");
        }
    }

    private static void create(HttpExchange exchange) throws IOException, SQLException {
        //Map: guarda informações no formato chave e valor, como um pequeno dicionário
        Map<String, String> data = readForm(exchange);
        String autor = data.getOrDefault("autor", "").trim();
        String message = data.getOrDefault("menssage", "").trim();
        if (autor.isEmpty() || message.isEmpty()) {
            response(exchange, 400, "{\"erro\":\"Preencha todos os campos\"}");
            return;
        }
        DAO.create(new Recado(0, autor, message));
        response(exchange, 201, "{\"message\":\"Recado cadastrado\"}");
    }

    private static void list(HttpExchange exchange) throws IOException, SQLException {
        List<Recado> notes = DAO.list();
        //StringBuilder: classe para construir e alterar textos sem criar novas Strings a cada mudança
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < notes.size(); i++) {
            if (i > 0) {
                json.append(",");
            }
            json.append(notes.get(i).toJson());
        }
        json.append("]");
        response(exchange, 200, json.toString());
    }

    private static Map<String, String> readForm(HttpExchange exchange) throws IOException {
        String body = new String(
                exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8
        );
        //HashMap: classe que implementa o Map
        //Map = List e ArrayList = HashMap
        Map<String, String> data = new HashMap<>();
        for (String field : body.split("&")) {
            String[] parts = field.split("=", 2);
            String name = URLDecoder.decode(parts[0], StandardCharsets.UTF_8);
            String value = parts.length == 2
                    ? URLDecoder.decode(parts[1], StandardCharsets.UTF_8) : "";
            //put: adiciona uma chave e um valor no Map
            data.put(name, value);
        }
        return data;
    }

    private static void openPage(HttpExchange exchange) throws IOException {
        if (!exchange.getRequestMethod().equals("GET")) {
            response(exchange, 405, "Método não permitido", "text/plain");
            return;
        }
        try (InputStream file = Main.class.getResourceAsStream("/public/index.html")) {
            if (file == null) {
                response(exchange, 404, "Página não encontrada", "text/plain");
                return;
            }
            byte[] page = file.readAllBytes();
            exchange.getResponseHeaders().set("Context-Type", "text/html; charset=UTF_8");
            exchange.sendResponseHeaders(200, page.length);
            exchange.getResponseBody().write(page);
            exchange.close();
        }
    }

    private static void response(HttpExchange exchange, int status, String content) throws IOException {
        response(exchange, status, content, "application/json");
    }

    private static void response(HttpExchange exchange, int status, String content, String type) throws IOException {
        byte[] response = content.getBytes(StandardCharsets.UTF_8);
        exchange.getRequestHeaders().set("Context-Type", type + "; charset=UTF-8");
        exchange.sendResponseHeaders(status, response.length);
        exchange.getResponseBody().write(response);
        exchange.close();
    }
}