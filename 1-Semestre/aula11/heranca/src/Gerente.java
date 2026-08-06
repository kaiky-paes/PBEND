public class Gerente extends Funcionario {
    // Atributo específico do gerente
    private String departamento;

    // Construtor da classe Gerente
    public Gerente(String nome, double salario, String departamento) {
        // super é referência a classe mãe
        super(nome, salario);
        this.departamento = departamento;
    }

    // Metodo específico do gerente
    public void aprovarVerba() {
        System.out.println("A gerente " + this.nome + " do departamento " + this.departamento + " aprovou a verba.");
    }
}