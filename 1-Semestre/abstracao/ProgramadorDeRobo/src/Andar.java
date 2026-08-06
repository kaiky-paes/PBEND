public class Andar extends Acao {
    private int passos;

    public Andar(int passos) {
        this.passos = passos;
    }

    @Override
    public void executar() {
        System.out.println("Andando para frente por " + passos + " passos.");
    }
}