import java.util.Scanner;

public class entrada_de_dados {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leia.nextLine(); /* nextline entrada de dados tipo texto */
        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.println(nome + " você tem " + idade + " anos");
    }
}