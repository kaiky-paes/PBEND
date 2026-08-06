import java.util.Scanner;

public class media_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] notas = new float[4];

        float m = 0;

        System.out.println("Bem-vindo(a). Digite o nome do aluno: ");
        String nome = sc.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota do aluno: ");
            notas[i] = sc.nextInt();

            m += notas[i];
        }
        m = m / 4;

        if (m >= 6) {
            System.out.println("A média do aluno " + nome + " é " + m + ", e ele está APROVADO.");
        } else {
            System.out.println("A média do aluno " + nome + " é " + m + ", e ele está REPROVADO.");
        }
    }
}