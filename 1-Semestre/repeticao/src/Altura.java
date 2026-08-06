import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        float alt;
        int i = 1;

        do {
            System.out.println("Digite a altura do atleta: ");
            alt = sc.nextFloat();
            if (alt < 1.80) {
                cont++;
            }
            i++;
        } while (i < 10);

        System.out.println("A quantidade de atletas com altura inferior a 1,80m: " + cont + ".");
    }
}