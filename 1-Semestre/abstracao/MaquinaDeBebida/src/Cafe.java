public class Cafe extends Bebida {
    @Override
    public void preparar() {
        System.out.println("Moendo os grãos de café...");
        System.out.println("Passando a água quente...");
        System.out.println("Café pronto.");
    }
}