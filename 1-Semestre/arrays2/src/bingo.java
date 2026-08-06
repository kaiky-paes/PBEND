import java.util.Random; // Importando o gerador de números aleatórios

public class bingo {
    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        Random sorteador = new Random();

        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                cartela[linha][coluna] = sorteador.nextInt(75) + 1;
            }
        }
        System.out.println("==========================");
        System.out.println(" B    I    N    G    O ");
        System.out.println("==========================");

        for (int linha = 0; linha < cartela.length; linha++) {
            for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
                // 0 \t serve para dar um espaço de "Tabulação" (Tab) para manter as colunas alinhadas na tela
                System.out.println(cartela[linha][coluna] + "\t");
            }
            // Pula para a próxima linha de cartela
            System.out.println();
            System.out.println("----------------------------");
        }
    }
}