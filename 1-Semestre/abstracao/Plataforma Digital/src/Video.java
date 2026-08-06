public class Video extends ConteudoDigital {
    private int duracaoSegundos;

    public Video(String titulo, Usuario autor, int duracaoSegundos) {
        super(titulo, autor);
        this.duracaoSegundos = duracaoSegundos;
    }

    @Override
    public void exibir() {
        System.out.println("VÍDEO: " + this.titulo + " [" + this.duracaoSegundos + "s]");
    }

    @Override
    public String getTipo() {
        return "Vídeo";
    }
}