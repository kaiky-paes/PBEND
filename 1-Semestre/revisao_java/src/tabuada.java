import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;

        float n, r;

        System.out.println("Digite um número para a tabuada: ");
        n = sc.nextFloat();

        while (i < 10) {
            i++;
            r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }
    }
}