import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int codigo = 0;
        String nome = "";
        double preco = 0;
        int quantidade = 0;

        String escolha = "";

        Scanner scanner = new Scanner(System.in);

        String nomeArquivoEstoque = "estoque.txt";
        EstoqueManager manager = new EstoqueManager(nomeArquivoEstoque);
        System.out.println("--- Tentando carregar o estoque do arquivo... ---");
        List<Produto> estoque = manager.carregarProdutos();
        System.out.println("Estoque carregado com " + estoque.size() + " produto(s).");
        System.out.println("\nEstado atual do estoque: ");
        estoque.forEach(System.out::println);
        System.out.println("\n--- Realizando operações no sistema... ---");

        if (estoque.isEmpty()) {
            System.out.println("Adicionando produtos iniciais...");
            estoque.add(new Produto(101, "Teclado Mecânico", 350.50, 10));
            estoque.add(new Produto(102, "Mouse Gamer", 150.75, 25));
        } else {
            System.out.println("Adicionando um novo produto e atualizando um existente...");
            estoque.add(new Produto(103, "Monitor 24 polegadas", 899.99, 8));
            if (!estoque.isEmpty()) {
                Produto primeiroProduto = estoque.get(0);
                primeiroProduto.setQuantidade(primeiroProduto.getQuantidade() + 5);
                System.out.println("Estoque do produto '" + primeiroProduto.getNome() + "'atualizando.");
            }
        }
        while (escolha != "n") {
            System.out.println("Deseja adicionar um novo produto? [s/n]");
            escolha = scanner.nextLine();

            if (escolha == "s") {
                System.out.println("Código: ");
                codigo = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Nome: ");
                nome = scanner.nextLine();

                System.out.println("Preço: ");
                preco = scanner.nextDouble();

                System.out.println("Quantidade: ");
                quantidade = scanner.nextInt();
                scanner.nextLine();

                Produto novoProduto = new Produto(codigo, nome, preco, quantidade);
                estoque.add(novoProduto);
            }
        }
        System.out.println("\nEstoque após as operações");
        estoque.forEach(System.out::println);
        System.out.println("--- Salvando o estado atual do estoque no arquivo... ---");
        manager.salvarProdutos(estoque);
        System.out.println("Estoque salvo com sucesso em '" + nomeArquivoEstoque + "'!");
    }
}