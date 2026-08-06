public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println("O dev " + this.nome + " está programando em " + this.linguagem + ".");
    }
}