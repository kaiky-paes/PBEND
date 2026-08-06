import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = -1;

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        ProdutoFisico produtoFisico = new ProdutoFisico();
        ProdutoDigital produtoDigital = new ProdutoDigital();

        System.out.println("Sistema de E-commerce");
        while (escolha != 0) {
            System.out.println("\n[1] - Cadastrar produto físico");
            System.out.println("[2] - Cadastrar produto digital");
            System.out.println("[3] - Carrinho");
            System.out.println("[0] - Finalizar compra");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    carrinho.addProduto(produtoFisico.criarProdutoFisico());
                    break;

                case 2:
                    carrinho.addProduto(produtoDigital.criarProdutoDigital());
                    break;

                case 3:
                    carrinho.listarCarrinho();
                    break;

                case 0:
                    System.out.println("Finalizando compra...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}