public class Aluno {
    String nome;
    String serie;
    double[] notas;

    public Aluno(String nome, String serie, double[] notas) {
        this.nome = nome;
        this.serie = serie;
        this.notas = notas;
    }

    public double calcMedia() {
        double total = 0;

        for (double nota : notas) {
            total += nota;
        }
        return total / 4;
    }

    public String status() {
        if (calcMedia() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
