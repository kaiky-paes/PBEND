public class cores {
    public static void main(String[] args) {

        String[] cores = {"Azul", "Amarelo", "Vermelho", "Verde", "Roxo"};

        System.out.println("A primeira cor é: " + cores[0]);
        System.out.println("A última cor é: " + cores[4]);
        System.out.println("\n--- Liste Completa de Cores ---");

        for (int i = 0; i < cores.length; i++) {
            System.out.println("Cor na posição " + i + ": " + cores[i]);
        }
    }
}
