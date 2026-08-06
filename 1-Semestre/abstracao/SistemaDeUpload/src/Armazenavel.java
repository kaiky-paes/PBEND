// *** ABSTRAÇÃO AQUI ***
// Uma interface é um contrato 100% abstrato
// Ela define a AÇÃO de 'salvar', mas nenhuma classe sabe como fazer iso ainda
public interface Armazenavel {
    void salvar(String nomeArquivo);
}