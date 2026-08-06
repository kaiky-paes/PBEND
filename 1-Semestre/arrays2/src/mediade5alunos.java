import java.util.Scanner;

public class mediade5alunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]nomes = new String[5];
        float[][] notas = new float[5][4];
        float[] medias = new float[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do aluno(a) ");
            nomes[i] = sc.nextLine();

            float soma = 0;

            for (float j = 0; j < 4; j++) {
                System.out.println("Digite a nota do aluno(a) " + nomes[i] + ":");
                notas[i][1] = sc.nextFloat();
            }
            sc.nextLine();

            medias[i] = soma / 4;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " média: " + medias[i]);
        }
    }
}