import java.util.Scanner;

public class MaquinaDeBebida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Máquina de bebidas acordar ---");
        System.out.println("Escolha sua bebida:\n1 - Café \n2 - Chá");
        int escolha = sc.nextInt();
        Bebida bebidaSelecionada = null;

        if (escolha == 1) {
            bebidaSelecionada = new Cafe();
        } else if (escolha == 2) {
            bebidaSelecionada = new Cha();
        } else {
            System.out.println("Opção inválida.");
        }
        if (bebidaSelecionada != null) {
            System.out.println("\nIniciando preparo...");
            bebidaSelecionada.preparar();
        }
        sc.close();
    }
}