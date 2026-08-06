import java.util.Scanner;

public class quantidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        System.out.println("Qual a quantidade de linhas da matriz? ");
        m = sc.nextInt();

        System.out.println("Qual a quantidade de colunas da matriz? ");
        n = sc.nextInt();

        int matriz[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    System.out.printf("%d\n", matriz[i][j]);
                }
            }
        }
        sc.close();
    }
}