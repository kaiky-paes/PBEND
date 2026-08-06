import java.util.Scanner;

public class numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Os números digitados foram: " + n[i] + ".");
        }
    }
}
