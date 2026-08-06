import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class escrita {
    public static void main(String[] args) {
        String caminhoArquivo = "escrita.txt"; //Cria o arquivo se não houver

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            //BufferedWriter: Grava dados em bloco
            //FileWriter: Cria ou abre o arquivo para escrita

            escritor.write("Primeira linha do arquivo.");
            escritor.newLine(); //Quebra de linha
            escritor.write("Segunda linha escrita no java.");
        } catch (IOException e) {
            //try/catch: tratamento de erros de entrada e saída
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}