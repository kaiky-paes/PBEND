import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        System.out.println("Digite seu e-mail: ");
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        System.out.println("Digite sua sua senha: ");
        String senha = input.nextLine();
        System.out.println("Login efetuado com sucesso.");
    }
}