import java.util.Scanner;

// Classe principal com o metodo main
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        // Criação do objeto Pessoa
        Pessoa pessoa = new Pessoa(nome, idade);
        // Uso dos métodos
        System.out.println("\nInformações da pessoa:");
        pessoa.exibirInformacoes();

        if (pessoa.isMaiorDeIdade()) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        scan.close();
    }
}