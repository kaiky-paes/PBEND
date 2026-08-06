import java.util.Scanner;

public class Acionadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int btn, btncor = 0;

        String menu = """
                Equipamento ligado com sucesso.
                Escolha a lâmpada que deseja ligar:
                [1] Lâmpada Azul
                [2] Lâmpada Verde
                [3] Lâmpada Amarela
                [4] Lâmpada Vermelha""";

        System.out.println(menu);
        btncor = sc.nextInt();

        switch (btncor) {
            case 1:
                System.out.println("Lâmpada Azul ligada");
                break;

            case 2:
                System.out.println("Lâmpada Verde ligada");
                break;

            case 3:
                System.out.println("Lâmpada Amarela ligada");
                break;

            case 4:
                System.out.println("Lâmpada Vermelha ligada");
                break;

            default:
                System.out.println("Botão de emergência acionado");
        }
        System.out.println("Desligue o equipamento [0]: ");
        btn = sc.nextInt();
    }
}