import javax.swing.*;
import java.io.*;

public class janela {
    public static void main(String[] args) {
        String caminho = "exemplo.txt";
        String[] opcoes = {"Escrever", "Ler", "Sair"}; //Vetor com dados fixos

        int escolha;

        do {
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção",
                    "Menu do arquivo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0 -> escrita(caminho);
                case 1 -> leitura(caminho);
                default -> JOptionPane.showMessageDialog(null, "Encerrando o programa.");
            }
        } while (escolha == 0 || escolha == 1);
    }
    public static void escrita(String caminho) {
        String texto = JOptionPane.showInputDialog("Digite o texto para salvar: ");

        if (texto != null && !texto.isBlank()) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))) {
                escritor.write(texto);
                escritor.newLine();
                JOptionPane.showMessageDialog(null, "Texto salvo com sucesso.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro? " + e.getMessage());
            }
        }
    }
    public static void leitura(String caminho) {
        StringBuilder conteudo = new StringBuilder();

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(null, conteudo.length() > 0 ? conteudo.toString() : "Arquivo vazio.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}