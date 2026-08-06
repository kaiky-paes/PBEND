import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};

        int soma = Arrays.stream(numeros).sum();
        // Função stream e sum: serve para realizar cálculos
        System.out.println("Soma: " + soma);
    }
}