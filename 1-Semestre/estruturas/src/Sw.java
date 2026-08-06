import java.util.Scanner;

public class Sw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dim;
        float val = 0;

        String menu = """
                -----------------------------
                ======Criança Esperança======
                -----------------------------
                Muito obrigado por ajudar!
                [1] Para doar R$ 10
                [2] Para doar R$ 20
                [3] Para doar R$ 50
                [4] Para doar outros valores
                [5] Para cancelar""";
        System.out.println(menu);
        dim = sc.nextInt();

        switch (dim) {
            case 1:
                val = 10;
                break;

            case 2:
                val = 20;
                break;

            case 3:
                val = 50;
                break;

            case 4:
                System.out.println("Digite o valor de sua doação: ");
                val = sc.nextFloat(); // Tipo de dados com números decimais
                break;

            case 5:
                System.out.println("Agradecemos mesmo assim.");
        }
        String fim = """
                -----------------------------
                Obrigado por doar R$ %.2f
                -----------------------------
                """.formatted(val);
        System.out.println(fim);
    }
}