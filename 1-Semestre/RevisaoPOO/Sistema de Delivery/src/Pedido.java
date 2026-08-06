import java.util.ArrayList;

public class Pedido {
    ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirResumo() {
        double total = 0;

        System.out.println("------------- RESUMO DO PEDIDO -------------");
        for (Produto produto : produtos) {
            System.out.println(produto.nome + "| R$ " + produto.valor);
            total += produto.valor;
        }
        System.out.printf("\nTotal: R$ %.2f", total);
    }
}