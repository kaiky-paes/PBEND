import java.util.Scanner;

public class estrutura_condicional {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int dimdim;

        System.out.println("Sistema informativo de sugestões!");
        System.out.println("Quanto de dinheiro você tem sobrando?");
        dimdim = entrada.nextInt();

        if(dimdim >= 50) {
            System.out.println("Vá ao cinema hoje!");
        }else{
        System.out.println("Fique em casa vendo TV!");
        }
    }
}