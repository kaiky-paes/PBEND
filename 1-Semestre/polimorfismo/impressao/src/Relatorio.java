// Sub classe ou classe filha
public class Relatorio extends Documento {
    public Relatorio(String nome) {
        super(nome);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo RELATÓRIO: " + nome + " com cabeçalho e rodapé.");
    }
}
