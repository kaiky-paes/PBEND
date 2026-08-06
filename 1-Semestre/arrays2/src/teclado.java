public class teclado {
    public static void main(String[] args) {
        int[][] teclado = {
                {1, 2, 3}, //Linha 0
                {4, 5, 6}, //Linha 1
                {7, 8, 9} //Linha 2
        };

        System.out.println("=== Acessando um valor específico ===");
        System.out.println("O valor no centro do teclado é: " + teclado[1][1]);
        System.out.println("\n=== Imprimindo a Matriz Completa ===");

        for (int linha = 0; linha < teclado.length; linha++) {
            for (int coluna = 0; coluna < teclado[linha].length; coluna++) {
                System.out.println(teclado[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
