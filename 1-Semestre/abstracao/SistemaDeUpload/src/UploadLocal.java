public class UploadLocal implements Armazenavel {
    @Override
    public void salvar(String nomeArquivo) {
        System.out.println("Verificando permissões de escrita no disco...");
        System.out.println("Salvando o arquivo " + nomeArquivo + " em C:\\Uploads\\");
        System.out.println("Arquivo salvo no disco local com sucesso.");
    }
}