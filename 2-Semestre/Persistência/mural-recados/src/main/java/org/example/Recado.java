package org.example;

public class Recado {
    private final int id;
    private final String actor;
    private final String message;

    public Recado(int id, String actor, String message) {
        this.id = id;
        this.actor = actor;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getActor() {
        return actor;
    }

    public String getMessage() {
        return message;
    }

    public String toJson() {
        return "{\"id\":" + id
                + ",\"actor\":\"" + escapar(actor)
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