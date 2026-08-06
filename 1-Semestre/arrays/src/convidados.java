import java.util.Scanner;

public class convidados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] convidados = new String[5];

        int opcao;

        do {
            System.out.println("\n=== MENU VIP ===");
            System.out.println("1 - Cadastrar Convidado");
            System.out.println("2 - Listar Convidados");
            System.out.println("3 - Remover Convidado");
            System.out.println("0 - Sair do Sistema");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); //Limpar o "Enter" que sobra após digitar o número

            switch (opcao) {
                case 1:
                    boolean cadastrou = false;
                    for (int i = 0; i < convidados.length; i++) {
                        //Se a posição for null, significa que está vazia
                        if (convidados[i] == null) {
                            System.out.println("Digite o nome do convidado: ");
                            convidados[i] = sc.nextLine();
                            System.out.println("Convidado adicionado com sucesso.");
                            cadastrou = true;
                            break;
                        }
                    }
                    if (!cadastrou) {
                        System.out.println("A lista está cheia! Não há mais vagas.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista Atual ---");
                    boolean temGente = false;
                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] != null) {
                            System.out.println("- " + convidados[i]);
                            temGente = true;
                        }
                    }
                    if (!temGente) {
                        System.out.println("A lista está completamente vazia.");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome exato para remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean removeu = false;

                    for (int i = 0; i < convidados.length; i++) {
                        if (convidados[i] != null && convidados[i].equalsIgnoreCase(nomeRemover)) {
                            convidados[i] = null; //Esvazia a posição no vetor
                            System.out.println("Convidado removido. Vaga liberada.");
                            removeu = true;
                            break;
                        }
                    }
                    if (!removeu) {
                        System.out.println("Convidado não encontrado na lista.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até a próxima festa!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}