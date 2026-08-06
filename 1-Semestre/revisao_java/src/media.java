import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, n4, m;

        System.out.println("Bem-vindo(a). Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        n1 = sc.nextInt();

        System.out.println("Digite a segunda nota do aluno: ");
        n2 = sc.nextInt();

        System.out.println("Digite a terceira nota do aluno: ");
        n3 = sc.nextInt();

        System.out.println("Digite a quarta nota do aluno: ");
        n4 = sc.nextInt();

        m = (n1 + n2 + n3 + n4) / 4;

        if (m >= 6) {
            System.out.println("A média do aluno " + nome + " é " + m + ", e ele está APROVADO.");
        } else {
            System.out.println("A média do aluno " + nome + " é " + m + ", e ele está REPROVADO.");
        }
    }
}