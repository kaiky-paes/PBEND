import java.util.Scanner;

public class SistemaDeUpload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo para upload (ex: relatorio.pdf): ");
        String arquivo = sc.nextLine();
        System.out.println("Onde você deseja salvar? (1 - Nuvem, 2 - Disco Local)");
        int escolha = sc.nextInt();
        // A variável 'servicoDeUpload' pode assumir a forma de qualquer
        // classe que cumpra o contrato 'Armazenavel'.
        Armazenavel servicoDeUpload = null;
        if (escolha == 1) {
            servicoDeUpload = new UploadNuvem();
        } else if (escolha == 2) {
            servicoDeUpload = new UploadLocal();
        }
        if (servicoDeUpload != null) {
            // *** ABSTRAÇÃO E POLIMORFISMO EM AÇÃO ***
            // O sistema principal não se importa com os detalhes de conexão ou permissões.
            // Ele apenas confia que o objeto 'servicoDeUpload' sabe como 'salvar'.
            servicoDeUpload.salvar(arquivo);
        } else {
            System.out.println("Serviço de upload inválido.");
        }
        sc.close();
    }
}