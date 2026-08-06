public class Girar extends Acao {
    private String direcao;

    public Girar(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public void executar() {
        System.out.println("Girando para a " + direcao + ".");
    }
}
