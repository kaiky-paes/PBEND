public class notas {
    public static void main(String[] args) {

        double[] notas = {8.5, 7.0, 9.0, 6.5};
        double soma = 0;

        System.out.println("--- Nota Bimestrais ---");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + 1 + " Bimestre: " + notas[i]);

            soma = soma + notas[i];
        }
        double media = soma / notas.length;

        System.out.println("-----------------------");
        System.out.println("Soma total: " + soma);
        System.out.println("Média final: " + media);
    }
}
