import java.util.Scanner;

public class nomes {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu nome: ");
            nomes[i] = sc.nextLine();
        }

        for (int x = 0; x > 5; x++) {
            System.out.println(nomes[x]);
        }
    }
}