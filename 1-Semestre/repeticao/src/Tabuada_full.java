import java.util.Scanner;

public class Tabuada_full {
    public static void main(String[] args) {
        System.out.println("|-------Sistemas de Tabuada SENAI Anchieta-------|");
        System.out.println("|-------Vamos aprender de uma vez por todas a tabuada?-------|");

        Scanner sc = new Scanner(System.in);

        int x = 0;
        char resposta;

        do {
            System.out.println("Digite um número para saber a tabuada: ");
            x = sc.nextInt();
            System.out.println("Você está vendo a tabuada do " + x + ".");

            for (int i = 1; i <= 10; i++) {
                System.out.println(x + " x " + i + " = " + x * i);
            }
            System.out.println("Deseja saber outra tabuada [s/n]: ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        System.out.println("|-------Espero que tenha aprendido a tabuada.-------|");
        System.out.println("|-------Sistemas de Tabuada SENAI Anchieta-------|");
    }
}