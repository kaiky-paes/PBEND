import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        float n1, n2, res = 0;
        int op = 0;

        System.out.println("Digite o primeiro número: ");
        n1 = calc.nextFloat(); // nextFloat: tipo de dados númerico decimal

        System.out.println("Digite o segundo número: ");
        n2 = calc.nextFloat();

        System.out.println("Escolha a operação:");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        op = calc.nextInt();

        switch (op) { // escolha
            case 1: // caso
                res = n1 + n2;
                break;

            case 2:
                res = n1 - n2;
                break;

            case 3:
                res = n1 * n2;
                break;

            case 4:
                res = n1 / n2;
                break;

            default: // outrocaso
                System.out.println("Opção inválida.");
        }
        System.out.println("O resultado da operação é: " + res + ".");
    }
}