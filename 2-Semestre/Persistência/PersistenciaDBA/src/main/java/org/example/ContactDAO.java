package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAO {
    //CREATE (Criar)
    public void add(Contact contact) {
        //O "?" é um placeholder, para evitar SQL Injection
        String sql = "INSERT INTO contacts(name, phone) VALUES(?, ?)";
        try (Connection conn = Database.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            //Define os valores dos placeholders
            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getPhone());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }

    //READ (Ler) - Listar contatos do banco
    public List<Contact> list() {
        List<Contact> contacts = new ArrayList<>();
        String sql = "SELECT * FROM contatos";
        try (Connection conn = Database.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                //Cria um objeto Contact e adiciona na lista
                contacts.add(new Contact(id, name, phone));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar contatos: " + e.getMessage());
        }
        return contacts;
    }

    //UPDATE
    public void update(Contact contact) {
        String sql = "UPDATE contacts SET name = ?, phone = ? WHERE id = ?";
        try (Connection conn = Database.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getPhone());
            pstmt.setInt(3, contact.getId());
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar contato: " + e.getMessage());
        }
    }

    //DELETE - Remove um contato do banco ppelo ID
    public void delete(int id) {
        String sql = "DELETE FROM contacts WHERE id = ?";
        try (Connection conn = Database.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao remover contato: " + e.getMessage());
        }
    }
}