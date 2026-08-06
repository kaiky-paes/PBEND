public class Main {
    // Classe principal (Main): estrutura do meu programa
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        Somador somador = new Somador(numeros);
        // Classe Somador: serve para realizar os cálculos
        // new Somador: transformando a classe em objeto

        System.out.println("Soma: " + somador.calcularSoma());
        //calcularSoma: Metodo para realizar a soma
    }
}