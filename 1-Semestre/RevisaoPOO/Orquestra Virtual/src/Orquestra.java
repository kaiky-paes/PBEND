import java.util.Scanner;

public class Orquestra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = -1;

        System.out.println("--- Orquestra Virtual ---");
        while (escolha != 0) {
            System.out.println("\nEscolha um instrumento:");
            System.out.println("[1] Violão");
            System.out.println("[2] Piano");
            System.out.println("[3] Bateria");
            System.out.println("[0] Sair da Orquestra Virtual");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> System.out.println(new Violão().som());
                case 2 -> System.out.println(new Piano().som());
                case 3 -> System.out.println(new Bateria().som());
                case 0 -> System.out.println("--- Saindo do Programa... ---");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}