public class Funcionario {
    //Classe Funcionario é a classe mãe
    // Atributos comuns entre as classes
    protected String nome;
    protected double salario;

    // Metodo construtor inicializa os atributos da classe mãe
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //Metodos comuns entre as classes
    public void trabalhar() {
        System.out.println(this.nome + " está trabalhando!");
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}