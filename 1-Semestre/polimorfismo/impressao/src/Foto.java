// Sub classe ou classe filha
public class Foto extends Documento {
    public Foto(String nome) {
        super(nome);
    }

    @Override

    public void imprimir() {
        System.out.println("Imprimindo FOTO: " + nome + " em alta resolução e papel fotográfico.");
    }
}