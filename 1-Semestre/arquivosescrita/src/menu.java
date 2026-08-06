import java.io.*;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        String caminhoArquivo = "outro.txt";

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Escrever no arquivo");
            System.out.println("2 - Ler o arquivo");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o texto para adicionar ao arquivo: ");
                    String texto = sc.nextLine();
                    escrita(caminhoArquivo, texto);
                    break;

                case 2:
                    leitura(caminhoArquivo);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    public static void escrita(String caminho, String texto) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))) {
            escritor.write(texto);
            escritor.newLine();
            System.out.println("Texto gravado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public static void leitura(String caminho) {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;

            System.out.println("\n--- Conteúdo do arquivo ---");

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("---------------------------");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}