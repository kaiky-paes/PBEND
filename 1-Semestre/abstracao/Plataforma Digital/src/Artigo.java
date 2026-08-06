public class Artigo extends ConteudoDigital {
    private int numeroDePalavras;

    public Artigo(String titulo, Usuario autor, int numeroDePalavras) {
        super(titulo, autor);
        this.numeroDePalavras = numeroDePalavras;
    }

    @Override
    public void exibir() {
        System.out.println("ARTIGO: " + this.titulo + " (" + this.numeroDePalavras + " palavras");
    }

    @Override
    public String getTipo() {
        return "Artigo";
    }
}