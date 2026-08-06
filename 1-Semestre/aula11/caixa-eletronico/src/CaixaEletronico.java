import java.sql.SQLOutput;
import java.util.InputMismatchException; // Classe para verificação de erros de entrada
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- DADOS DO BANCO ---
        // Agora criamos instâncias das classes específicas.
        Cliente cliente1 = new Cliente("Clark Kent", "111.222.333-44");
        Conta conta1 = new ContaCorrente(cliente1); // Clark tem uma Conta Corrente
        conta1.depositar(1500.0);

        Cliente cliente2 = new Cliente("Bruce Wayne", "888.999.000-11");
        Conta conta2 = new ContaPoupanca(cliente2); // Bruce tem uma Conta Poupança
        conta2.depositar(100000.0);

        // Colocamos as conta em um array do tipo de superclasse (Conta).
        // Isso é Polimorfismo: o array pode guardar qualquer objeto que SEJA UMA Conta.
        Conta[] contasDoBanco = {conta1, conta2};
        Conta contaAtiva = contasDoBanco[0];

        int opcao = 0;

        while (opcao != 8) {
            System.out.println("\n --- CAIXA ELETRÔNICO ZZ BANK ---");
            System.out.println("Bem-vindo(a). " + contaAtiva.getNomeTitular() + " | Conta: " + contaAtiva.getClass().getSimpleName());
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Trocar de Conta (Login)");

            // --- OPÇÕES ESPECÍFICAS DE CADA CONTA
            // O operador 'instanceof' verifica o tipo real do objeto.
            if (contaAtiva instanceof ContaCorrente) {
                System.out.println("6 - Cobrar Taxa de Manutenção");
            }
            if (contaAtiva instanceof ContaPoupanca) {
                System.out.println("7 - Fazer Render Juros");
            }
            System.out.println("8 - Sair");
            System.out.println("Escolha uma opção: ");

            try { // Verificação de erros com o catch
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1: contaAtiva.exibirDados();
                    break;

                    case 2:
                        System.out.println("Digite o valor para depositar: ");
                        contaAtiva.depositar(scanner.nextDouble());
                        break;

                    case 3:
                        System.out.println("Digite o valor para sacar: ");
                        contaAtiva.sacar(scanner.nextDouble());
                        break;

                    case 4:
                        System.out.println("Digite o número da conta destino: ");
                        int numContaDestino = scanner.nextInt();
                        Conta contaDestino = null;
                        for(Conta c : contasDoBanco) if(c.getNumero() == numContaDestino) contaDestino = c;

                        if (contaDestino != null && contaDestino != contaAtiva) {
                            System.out.println("Digite o valor para transferir: ");
                            contaAtiva.transferir(contaDestino, scanner.nextDouble());
                        } else {
                            System.out.println("Conta destino inválida ou igual à origem.");
                        }
                        break;

                    case 5:
                        System.out.println("\n--- CONTAS DISPONÍVEIS ---");

                        for (Conta c : contasDoBanco) {
                            System.out.println("");
                        }
                }
        }
    }
}