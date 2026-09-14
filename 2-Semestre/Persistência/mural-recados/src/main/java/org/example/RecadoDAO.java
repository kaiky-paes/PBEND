package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecadoDAO {
    public void cadastrar(Recado note) throws SQLException {
        String sql = "INSERT INTO recado (actor, message) VALUES(?,?)";

        try (Connection connection = Conexao.open();
             PreparedStatement command = connection.prepareStatement(sql)) {
            command.setString(1, note.getActor());
            command.setString(2, note.getMessage());
            command.executeUpdate();
        }
    }

    public List<Recado> listar() throws SQLException {
        String sql = "SELECT id, actor, message FROM recado ORDER BY id DESC";
        List<Recado> notes = new ArrayList<>();

        try (Connection connection = Conexao.open();
        PreparedStatement command = connection.prepareStatement(sql);
             ResultSet result = command.executeQuery()) {

            while (result.next()) {
                Recado note = new Recado(
                        result.getInt("id"),
                        result.getString("actor"),
                        result.getString("message")
                );
                notes.add(note);
            }
        }
        return notes;
    }
}