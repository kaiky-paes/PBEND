import java.util.Scanner;

public class FazendaVirtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        System.out.println("Inciando Fazenda Virtual...");
        System.out.println("Escolha uma ação:");
        System.out.println("[1] - Ouvir galinhas");
        System.out.println("[2] - Ouvir porcos");
        System.out.println("[3] - Ouvir ovelhas");
        System.out.println("[4] - Ouvir vacas");
        System.out.println("[0] - Sair do sistema");

        while (escolha != 0) {
            escolha = scanner.nextInt();
            Animal microfone = null;

            if (escolha == 1) {
                microfone = new Galinha();
            } else if (escolha == 2) {
                microfone = new Porco();
            } else if (escolha == 3) {
                microfone = new Ovelha();
            } else if (escolha == 4) {
                microfone = new Vaca();
            } else if (escolha == 0) {
                System.out.println("Saindo da Fazenda Virtual...");
            } else {
                System.out.println("Opção inválida!");
            }
            if (microfone != null) {
                microfone.acao();
                System.out.println("Escolha uma ação.");
            }
        }
        scanner.close();
    }
}