public class Pessoa {
    // Atributos: Características
    private String nome;
    private int idade;

    // Metodo: ações e comportamentos
    // Metodo Construtor: incializa os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Metodo para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Metodo para verificar se é maior de idade
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}
