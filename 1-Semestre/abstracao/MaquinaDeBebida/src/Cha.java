public class Cha extends Bebida {
    @Override
    public void preparar() {
        System.out.println("Fervendo a água...");
        System.out.println("Colocando o saquinho de chá para infusão...");
        System.out.println("Chá pronto.");
    }
}