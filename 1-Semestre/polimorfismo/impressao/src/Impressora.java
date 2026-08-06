public class Impressora {
    public static void main(String[] args) {
        Documento[] filaDeImpressao = {
                new Relatorio("Vendas_Setembro.pdf"),
                new Foto("ferias_na_praia.jpg"),
                new Relatorio("Balancete_Anual.docx")
        };

        System.out.println("--- Iniciando Fila de Impressão ---");

        // *** O POLIMORFISMO ACONTECE AQUI ***
        // Para a impressora, tudo é apena um 'Documento'. Ela envia
        // o comando 'imprimir()' e o próprio objeto (Relatorio ou Foto)
        // se encarrega de executar a impressão da maneira correta.
        for(Documento doc : filaDeImpressao) {
            doc.imprimir();
        }
    }
}