import java.util.Scanner;

public class saudacao_calorosa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Bem-vindo(a) " + nome + ", você tem " + idade + " anos.");
    }
}