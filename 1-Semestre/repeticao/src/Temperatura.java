import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = (C * 1.8) + 32;
            System.out.println("Temperatura em Fahrenheit: " + F);
            System.out.println("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}