import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        System.out.println("--- Bem-vindo ao Sistema de Veículos ---");

        while (escolha != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("[1] - Exibir Carro");
            System.out.println("[2] - Exibir Moto");
            System.out.println("[3] - Exibir Caminhão");
            System.out.println("[0] - Sair do sistema");
            escolha = scanner.nextInt();
            Veiculo exibir = null;

            if (escolha == 1) {
                exibir = new Carro("Toyota Supra MK5", "250Km/h");
            } else if (escolha == 2) {
                exibir = new Moto("Kawasaki Ninja 500", "200Km/h");
            } else if (escolha == 3) {
                exibir = new Caminhão("Mercedes-Benz Actros 2653", "120Km/h");

            } else if (escolha == 0) {
                System.out.println("--- Saindo do sistema... ---");
            } else {
                System.out.println("Opção inválida!");
            }
            if (exibir != null) {
                exibir.detalhes();
                exibir.buzina();
            }
        }
        scanner.close();
    }
}