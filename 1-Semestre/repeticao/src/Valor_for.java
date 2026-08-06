import java.util.Scanner;

public class Valor_for {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");

        int valor = sc.nextInt();

        for (int i = 1; i <= valor; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}