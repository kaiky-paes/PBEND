import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();
        int escolha = -1;

        System.out.println("--- Bem-vindo(a) ao Sistema de Delivery ---");
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();
        Cliente usuario = new Cliente(nomeCliente, endereco);

        System.out.println("Bem-vindo(a) " + usuario.getNomeCliente() + ".");

        while (escolha != 0) {
            System.out.println("\n---------------- Cardápio ----------------");
            System.out.println("[1] Pizza Marguerita - Broto | R$ 30,00");
            System.out.println("[2] Pizza Calabresa - Broto | R$ 35,00");
            System.out.println("[3] Coca-Cola - 1L | R$ 8,00");
            System.out.println("[4] Guaraná Antártica - 1L | R$ 7,00");
            System.out.println("[9] Exibir Carrinho");
            System.out.println("[0] Finalizar Pedido");
            System.out.println("-------------------------------------------");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                pedido.addProduto(new Produto("Pizza Marguerita - Broto ", 30.00));
            } else if (escolha == 2) {
                pedido.addProduto(new Produto("Pizza Calabresa - Broto ", 35.00));
            } else if (escolha == 3) {
                pedido.addProduto(new Produto("Coca-Cola - 1L ", 8.00));
            } else if (escolha == 4) {
                pedido.addProduto(new Produto("Guaraná Antártica - 1L ", 7.00));
            } else if (escolha == 9) {
                pedido.exibirResumo();
            } else if (escolha == 0) {
                System.out.println("Pedido finalizado.");
                pedido.exibirResumo();
            } else {
                System.out.println("Produto inválido.");
            }
        }
        scanner.close();
    }
}