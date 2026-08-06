import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor incorreto.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Correto");
    }
}