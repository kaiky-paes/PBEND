import java.util.Scanner;

public class CaixaEletrônico extends Conta {
    Scanner scanner = new Scanner(System.in);

    int escolha = -1;
    double valor;

    public void deposito() {
        System.out.println("Digite o valor a ser depositado:");
        valor = scanner.nextDouble();

        System.out.printf("\nValor do Depósito: R$ %.2f", valor);
        System.out.println("\n[1] - Confirmar Depósito");
        System.out.println("[0] - Cancelar Depósito");
        escolha = scanner.nextInt();

        while (escolha != 0) {
            if (escolha == 1) {
                if (valor > 0) {
                    saldo += valor;
                    System.out.printf("\nDepósito no valor de R$ %.2f ", valor, " realizado com sucesso.");
                    System.out.printf("\nSaldo atual: R$ %.2f", saldo, "%.2f");
                    escolha = 0;
                } else {
                    System.out.println("Valor inválido.");
                    escolha = 0;
                }
            } else if (escolha == 0) {
                System.out.println();
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void saque() {
        System.out.println("Digite o valor a ser sacado: ");
        valor = scanner.nextDouble();

        System.out.printf("\nValor do Saque: R$ %.2f", valor);
        System.out.println("\n[1] - Confirmar Saque");
        System.out.println("[0] - Cancelar Saque");
        escolha = scanner.nextInt();

        while (escolha != 0) {
            if (escolha == 1) {
                if (valor > 0 && valor <= saldo) {
                    saldo -= valor;
                    System.out.printf("\nSaque no valor de R$ %.2f", valor, " realizado.");
                    System.out.printf("\nSaldo atual: R$ %.2f", saldo, "%.2f");
                    escolha = 0;
                } else if (valor > saldo) {
                    System.out.println("Saldo insuficiente.");
                    escolha = 0;
                } else {
                    System.out.println("Valor inválido.");
                    escolha = 0;
                }
            } else if (escolha == 0) {
                System.out.println();
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}