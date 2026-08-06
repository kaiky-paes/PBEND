import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Vendas {
    public static void main(String[] args) {
        // Caminhos dos arquivos (na raiz do projeto)
        String arquivoEntrada = "vendas.csv";
        String arquivoSaida = "relatorio_final.txt";

        double totalGeral = 0.0;

        // Usando try-with-resources (fecha os arquivos sozinho)
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))) {

            // Lendo a primeira linha e ignorando (pois é só o cabeçalho)
            String linha = leitor.readLine();

            escritor.write("========== RELATÓRIO DE VENDAS ==========\n\n");
            System.out.println("Processamento arquivo...\n");

            // Laço para ler as próximas linhas até o fim do arquivo (null)
            while ((linha = leitor.readLine()) != null) {
                // Quebrando  a linha do ponto e vírgula
                String[] colunas = linha.split(";");
                // Regex: sequência de caracteres que define um padrão de busca de texto

                // Resgatando os dados pelo indice do Array
                String produto = colunas[0];

                int quantidade = Integer.parseInt(colunas[1]);
                double preco = Double.parseDouble(colunas[2]);
                // parse: conversão de tipo de dados (string para inteiro p/ ex.)

                double totalProduto = quantidade * preco;
                totalGeral += totalProduto;


                // Montando a linha que será escrita no txt
                String registro = String.format("Produto: %s | Qtd: %d | Total: R$ %.2f\n",
                        produto, quantidade, totalProduto);

                // Escreve no arquivo e mostra no console
                escritor.write(registro);
                System.out.println(registro);
            }
            // Fechamento do relatório
            String rodape = "\n-----------------------------------------\n";
            rodape += String.format("TOTAL GERAL ARRECADADO: R$ %.2f\n", totalGeral);
            rodape += "=========================================\n";

            escritor.write(rodape);
            System.out.println(rodape);

            System.out.println("\nSucesso! Arquivo 'relatorio _final.txt' gerado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler ou escrever o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro nos dados! O CSV contém letras onde deveriam ter números: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro na estrutura! O CSV está faltando colunas em alguma linha.");
        }
    }
}