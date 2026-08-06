// Super classe ou classe mãe
public abstract class Documento {
    protected String nome;

    public Documento(String nome) {
        this.nome = nome;
    }

    public abstract void imprimir();
}