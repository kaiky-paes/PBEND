import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Locadora sistemaLocadora = new Locadora();

        int escolha = -1;

        System.out.println("Bem-vindo(a) ao Sistema de Locadora");

        while (escolha != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("[1] - Cadastrar filme");
            System.out.println("[2] - Pesquisar filme");
            System.out.println("[3] - Exibir catálogo completo");
            System.out.println("[0] - Sair do sistema");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    sistemaLocadora.cadastrarFilme();
                    break;
                case 2:
                    sistemaLocadora.pesquisarFilme();
                    break;
                case 3:
                    sistemaLocadora.exibirCatalogo();
                    break;
                case 0:
                    System.out.println("\nSaindo do sistema...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }
    }
}