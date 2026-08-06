import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaixaEletrônico contaUsuario = new CaixaEletrônico();
        int escolha = -1;

        System.out.println("--- Bem-vindo(a) ao Caixa Eletrônico ---");
        while (escolha != 0) {
            System.out.println("\n--- Selecione uma Opção -----");
            System.out.println("--- [1] Consultar Saldo -----");
            System.out.println("--- [2] Realizar Depósito ---");
            System.out.println("--- [3] Realizar Saque ------");
            System.out.println("--- [0] Sair do Sistema -----");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    contaUsuario.exibirSaldo();
                    break;

                case 2:
                    contaUsuario.deposito();
                    break;

                case 3:
                    contaUsuario.saque();
                    break;

                case 0:
                    System.out.println("--- Saindo do Sistema... ---");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}