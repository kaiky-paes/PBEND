import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int cont = 0, n, m;

        System.out.println("Digite um número: ");
        n = t.nextInt();

        while (cont < 10) {
            cont++;
            m = cont * n;
            System.out.println(n + " x " + cont + " = " + m);
        }
        System.out.println("Esta é a tabuada do: " + n);
    }
}