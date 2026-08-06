import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PlataformaDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- BEM-VINDO À PLATAFORMA DIGITAL ---");
        System.out.println("Para começar, digite seu nome de usuário:");
        String nomeUsuario = sc.nextLine();
        System.out.println("Digite seu e-mail: ");
        String emailUsuario = sc.nextLine();

        Usuario autor = new Usuario(nomeUsuario, emailUsuario);
        System.out.println("\nUsuário " + autor.getNomeDeUsuario() + " criado com sucesso.");

        List<ConteudoDigital> feed = new ArrayList<>();
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("\n--- MENU DE CRIAÇÃO ---");
            System.out.println("O que você deseja criar agora?");
            System.out.println("1 - Criar um novo Vídeo");
            System.out.println("2 - Criar um novo Artigo");
            System.out.println("3 - Ver o feed e sair");
            System.out.println("Sua opção: ");

            try {
                escolha = sc.nextInt();
                sc.nextLine();

                if (escolha == 1) {
                    System.out.println("Digite o título do vídeo: ");
                    String tituloVideo = sc.nextLine();
                    System.out.println("Digite a duração em segundos: ");
                    int duracao = sc.nextInt();

                    ConteudoDigital novoVideo = new Video(tituloVideo, autor, duracao);
                    feed.add(novoVideo);
                    System.out.println("Video adicionado ao feed com sucesso.");
                } else if (escolha == 2) {
                    System.out.println("Digite o título do artigo: ");
                    String tituloArtigo = sc.nextLine();
                    System.out.println("Digite o número de palavras: ");
                    int palavras = sc.nextInt();

                    ConteudoDigital novoArtigo = new Artigo(tituloArtigo, autor, palavras);
                    feed.add(novoArtigo);
                    System.out.println("Artigo adicionado ao feed com sucesso.");
                } else if (escolha != 3) {
                    System.out.println("Opção inválida, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para a opção.");
                sc.next();
            }
        }
        System.out.println("\n======================================");
        System.out.println("--- FEED FINAL DA PLATAFORMA ---");
        System.out.println("======================================");
        if (feed.isEmpty()) {
            System.out.println("Você não criou nenhum conteúdo.");
        } else {
            for (ConteudoDigital conteudo : feed) {
                conteudo.exibir();
                System.out.println("   " + conteudo.getInformacoesAutor() + "\n");
            }
        }
        sc.close();
        System.out.println("Programa finalizado.");
    }
}