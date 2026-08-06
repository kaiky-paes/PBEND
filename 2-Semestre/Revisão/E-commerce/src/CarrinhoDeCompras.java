import java.util.ArrayList;

public class CarrinhoDeCompras {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarCarrinho() {
        double total = 0;

        for (Produto produto : produtos) {
            System.out.println("\nTipo: " + produto.getTipo() + "\nNome: " + produto.nome + "\nR$ " + produto.valor);
            total += produto.getValor();
        }
        System.out.printf("\nTotal: R$ %.2f", total);
    }
}