package org.example;

public class Recado {
    private final int id;
    private final String autor;
    private final String message;

    public Recado(int id, String autor, String message) {
        this.id = id;
        this.autor = autor;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getMessage() {
        return message;
    }

    public String toJson() {
        return "{\"id\":" + id
                + ",\"autor\":\"" + escapar(autor)
                + "\",\"message\":\"" + escapar(message) + "\"}";
    }
    //metodo para tratar o texto recebido para o formato correto do JSON
    private String escapar(String text) {
        // \\ representam \ e \\\\ representam \\
        return text.replace("\\", "\\\\")
                // \" representam " e \\\" representam \"
                .replace("\"", "\\\"")
                // \n quebra de linha \r: inicio da linha
                .replace("\r", "")
                .replace("\n", "\\n");
    }
}