import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] pessoa = new String[3][2];

        System.out.println("=== Cadastro de Pessoas ===");

        for (int linha = 0; linha < pessoa.length; linha++) {
            System.out.println("Digite o nome da " + (linha + 1) + " pessoa:");
            pessoa[linha][0] = sc.nextLine();
            System.out.println("Digite a idade de " + pessoa[linha][0] + ": ");
            pessoa[linha][1] = sc.nextLine();
            System.out.println("---------------------");
        }
        System.out.println("\n=== Tabela final de cadastro ===");
        System.out.println("NOME\t\tIDADE"); //\t: tabulação

        for (int linha = 0; linha < pessoa.length; linha++) {
            System.out.println(pessoa[linha][0] + "\t\t" + pessoa[linha][1] + " anos.");
        }
    }
}
