package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendaDAO dao = new VendaDAO();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA DE VENDAS E EXPORTAÇAO ===");
            System.out.println("1. Cadastrar venda");
            System.out.println("2. Listar vendas");
            System.out.println("3. Exportar para CSV");
            System.out.println("4. Exportar para JSON");
            System.out.println("0. Sair");
            System.out.println("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Nome do Produto ");
                    String produto = scanner.nextLine();
                    System.out.println("Categoria (ex: Eletronicos, Livros, Roupas: ");
                    String categoria = scanner.nextLine();
                    System.out.println("Valor Unitario (ex 49,90: ");
                    double valor = scanner.nextDouble();
                    System.out.println("Quantidade: ");
                    int qtd = scanner.nextInt();
                    dao.salvar(new Venda(produto, categoria, valor, qtd));
                }
                case 2 -> {
                    List<Venda> vendas = dao.listartodos();
                    System.out.println("\n--- Vendas Registradas ---");
                    vendas.forEach(v -> System.out.printf("[%d] %s (%s) - Qtd: %d - " + "Preço: R$ %.2f - Total: R$ %.2f\n", v.getId(), v.getProduto(), v.getCategoria(),
                            v.getQuantidade(), v.getValorUnitario(), v.getValorTotal()));
                }
                case 3 -> {
                    List<Venda> vendas = dao.listartodos();
                    ExportadorCSV.exportar(vendas, "vendas.CSV");
                }
                case 4 -> {
                    List<Venda> vendas = dao.listartodos();
                    ExportadorJSON.exportar(vendas, "vendas.JSON");
                }
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opçao invalida");
            }
        }
        scanner.close();
    }
}
