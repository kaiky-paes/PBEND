import java.util.Scanner;

public class Calcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int modelo = 0;

        System.out.println("Digite o Modelo do Calçado:");
        System.out.println("Opções para Modelo:");
        System.out.println("[1] Mocassim ou [2] Rasteirinha");
        modelo = sc.nextInt();

        switch (modelo) {
            case 1:
                System.out.println("O Modelo do Calçado é Masculino.");
                break;

            case 2:
                System.out.println("O Modelo do Calçado é Feminino.");
                break;

            default:
                System.out.println("O Modelo pode ser Infantil.");
        }
    }
}