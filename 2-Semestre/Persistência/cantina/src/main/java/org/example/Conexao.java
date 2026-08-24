package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexao {
    //SSL: criptografia
    private static final String URL = "jdbc:mysql://localhost:8080/cantina_senai_db" + "?useSSL=false" +
            "&allowpublicKeyRetrieval=true" + "&serverTimezone=America/Sao_Paulo";
    //allowpublicKeyRetrieval: permite que o driver JDBC solicite ao mysql uma chave publica
    //serverTimezone: informa ao JDBC o fuso horario para trabalhar

    private static final String USUARIO = "cantina";
    private static final String SENHA = "cantina123";

    private Conexao() {}

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public static void testar() throws SQLException {
        try (Connection conexao = conectar()) {
            if (!conexao.isValid(2)) {
                throw new SQLException("0 MySQL não confirmou a conexão!");
            }
        }
    }
}
