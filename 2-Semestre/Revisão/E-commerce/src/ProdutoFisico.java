import java.util.Scanner;

public class ProdutoFisico extends Produto {
    public ProdutoFisico criarProdutoFisico() {
        Scanner scanner = new Scanner(System.in);

        ProdutoFisico produto = new ProdutoFisico();

        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Digite o valor do produto: ");
        produto.valor = scanner.nextDouble();
        scanner.nextLine();

        return produto;
    }

    public String getTipo() {
        return "Físico";
    }
}