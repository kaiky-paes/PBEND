public class Main {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int n = 0; n <= numeros.length; n++) {
            soma += n;
        }
        System.out.println("Soma: " + soma);
    }
}