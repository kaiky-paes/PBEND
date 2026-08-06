public class UploadNuvem implements Armazenavel {
    @Override
    public void salvar(String nomeArquivo) {
        System.out.println("Conectando ao servidor da nuvem...");
        System.out.println("Enviando o arquivo " + nomeArquivo + "...");
        System.out.println("Arquivo salvo na nuvem com sucesso!");
    }
}