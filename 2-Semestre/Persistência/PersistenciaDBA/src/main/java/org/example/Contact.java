package org.example;

public class Contact {
    private int id;
    private String name;
    private String phone;

    //Construtor usado para ADICIONAR (o ID será gerado pelo banco)
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    //Construtor usado para LISTAR/ATUALIZAR (o ID vem do banco)
    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return String.format("ID: %d | Nome: %-20s | Telefone: %s",
                id, name, phone);
    }
}
