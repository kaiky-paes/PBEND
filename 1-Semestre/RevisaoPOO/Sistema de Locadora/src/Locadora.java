import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    Scanner scanner = new Scanner(System.in);

    List<Filme> listaFilmes = new ArrayList<>();

    String titulo;
    String genero;
    int ano;

    public void cadastrarFilme() {
        System.out.println("Digite o título do filme: ");
        titulo = scanner.nextLine();

        System.out.println("Digite o gênero do filme: ");
        genero = scanner.nextLine();

        System.out.println("Ano de lançamento do filme: ");
        ano = scanner.nextInt();
        scanner.nextLine();

        Filme filme = new Filme(titulo, genero, ano);
        listaFilmes.add(filme);
        System.out.println("\n" + filme.getTitulo() + " adicionado ao catálogo com sucesso.");
    }

    public void pesquisarFilme() {
        System.out.println("\nDigite o título do filme: ");
        String buscarFilme = scanner.nextLine();

        Filme filmeEncontrado = null;

        for (Filme y : listaFilmes) {
            if (y.getTitulo().equalsIgnoreCase(buscarFilme)) {
                filmeEncontrado = y;
            }
        }

        if (filmeEncontrado != null) {
            System.out.println("\n" + filmeEncontrado.getTitulo() + " encontrado.");
            System.out.println("Gênero: " + filmeEncontrado.getGenero());
            System.out.println("Ano: " + filmeEncontrado.getAno());
        } else {
            System.out.println("\nFilme não encontrado.");
        }
    }

    public void exibirCatalogo() {
        if (listaFilmes.isEmpty()) {
            System.out.println("\nCatálogo vazio.");
        }

        for (Filme filme : listaFilmes) {
            System.out.println(filme);
        }
    }
}