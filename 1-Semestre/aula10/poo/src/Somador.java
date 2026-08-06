public class Somador {
    // classe para realizar cálculos

    private int[] numeros;
    // atributo numeros: é uma característica da classe
    // private: proteção do atributo

    // Metodo construtor: "mesmo nome da classe" ajuda as outras classes a trabalhar com os atributos private
    public Somador(int[] numeros) {
        this.numeros = numeros;
        // this: informa a utilização do atributo
    }

    // Metodo: ações e comportamentos
    public int calcularSoma() {
        int soma = 0;

        for (int n : numeros) {
            // for(foreach: repetição mais moderna)
            soma += n;
        }
        return soma;
    }
}
