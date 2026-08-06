import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Escola escola = new Escola();
        int escolha = -1;

        while (escolha != 0) {
            System.out.println("\n--- Bem-vindo(a) ao Sistema Escolar ---");
            System.out.println("---------- Escolha uma opção ----------");
            System.out.println("--- [1] - Cadastrar aluno -------------");
            System.out.println("--- [2] - Lista de alunos -------------");
            System.out.println("--- [0] - Sair do sistema -------------");
            System.out.println("---------------------------------------");
            escolha = scanner.nextInt();
            switch (escolha) {
                case (1):
                    System.out.println("--- Acessando cadastro de alunos... ---\n");
                    escola.cadastrarAluno();
                    break;

                case (2):
                    escola.listarAlunos();
                    break;

                case (0):
                    System.out.println("-------- Saindo do sistema... --------");
                    break;

                default:
                    System.out.println("----------- Opção inválida. -----------");
            }
        }
        scanner.close();
    }
}