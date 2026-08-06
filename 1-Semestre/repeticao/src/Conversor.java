import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int cont = 1, qtd;
        float reais, dolar, valor;

        System.out.println("----Sistema de Conversão de Moedas Local----");
        System.out.println("Quantas conversões deseja fazer no momento?");
        qtd = t.nextInt();

        while (cont <= qtd) {
            System.out.println("Qual o valor em reais que deseja converter? R$");
            reais = t.nextFloat();
            System.out.println("Qual o valor do dólar hoje? US$");
            dolar = t.nextFloat();
            valor = reais / dolar;
            System.out.println("R$ " + reais + " em dólar é US$ " + valor);
            cont++;
        }
        System.out.println("----------O SCML agradece!----------");
    }
}