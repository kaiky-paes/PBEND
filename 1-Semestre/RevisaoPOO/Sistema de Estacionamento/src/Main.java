import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estacionamento acao = new Estacionamento();
        int escolha = -1;

        while (escolha != 0) {
            System.out.println("\n--- Bem-vindo(a) ao Sistema de Estacionamento ----");
            System.out.println("---------------- Escolha uma opção -----------------");
            System.out.println("--- [1] - Cadastrar veículo ------------------------");
            System.out.println("--- [2] - Exibir quantidade de veículos estacionados");
            System.out.println("--- [3] - Exibir veículos estacionados -------------");
            System.out.println("--- [0] - Sair do sistema --------------------------");
            System.out.println("----------------------------------------------------");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Acessando cadastro de veículos...");
                    acao.cadastrarVeiculo();
                    break;

                case 2:
                    System.out.println("Acessando quantidade de veículos estacionados...");
                    acao.quantidadeVeiculos();
                    break;

                case 3:
                    System.out.println("Acessando lista de veículos estacionados...");
                    acao.exibirVeiculos();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}