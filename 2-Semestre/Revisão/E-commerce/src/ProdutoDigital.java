import java.util.Scanner;

public class ProdutoDigital extends Produto {
    public ProdutoDigital criarProdutoDigital() {
        Scanner scanner = new Scanner(System.in);

        ProdutoDigital produto = new ProdutoDigital();

        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Digite o valor do produto: ");
        produto.valor = scanner.nextDouble();
        scanner.nextLine();

        return produto;
    }

    public String getTipo() {
        return "Digital";
    }
}