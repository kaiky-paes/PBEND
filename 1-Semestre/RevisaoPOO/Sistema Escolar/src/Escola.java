import java.util.Scanner;

public class Escola {
    Scanner scanner = new Scanner(System.in);

    Aluno[] alunos = new Aluno[4];
    int cadastrados = 0;

    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a série do aluno: ");
        String serie = scanner.nextLine();

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno: ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        alunos[cadastrados] = new Aluno(nome, serie, notas);
        cadastrados++;
    }

    public void listarAlunos() {
        System.out.println("----- Lista de Alunos Cadastrados -----");
        for (int i = 0; i < cadastrados; i++) {
            System.out.println("Nome: " + alunos[i].nome);
            System.out.println("Série: " + alunos[i].serie);
            System.out.println("Média: " + alunos[i].calcMedia());
            System.out.println("Situação: " + alunos[i].status());
            if (i < cadastrados - 1) {
                System.out.println();
            }
        }
        System.out.println("---------------------------------------");
    }
}