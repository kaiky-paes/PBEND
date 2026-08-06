import java.util.Scanner;

// Classe Mãe: tem atributos e metodos
class Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação...");
    }
}

// Classe filha: aproveita os atributos e metodos padrões da classe mãe
class NotificacaoSMS extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[SMS] Enviando Torpedo...");
        System.out.println("CONTEÚDO: " + mensagem);
    }
}

class NotificacaoEmail extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[E-MAIL] Servidor SMTP conectado...");
        System.out.println("ASSUNTO: Alerta de Segurança.");
        System.out.println("CORPO: " + mensagem);
    }
}

class NotificacaoWhatsApp extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[WHATSAPP] Abrindo conversa...");
        System.out.println("MENSAGEM: " + mensagem);
        System.out.println("STATUS [Entregue]");
    }
}

class NotificacaoPush extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[PUSH NOTIFICATION] Banner exibido no topo da tela");
        System.out.println(">> " + mensagem);
    }
}

class NotificacaoDiscord extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[DISCORD] Acessando conversa...");
        System.out.println("- " + mensagem);
    }
}

class NotificacaoTeams extends Notificacao {
    public void enviar(String mensagem) {
        System.out.println("\n[TEAMS] Acessando conversa...");
        System.out.println("- " + mensagem);
        System.out.println("STATUS [Entregue]");
    }
}

public class SistemaNotificacoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Notificacao canal = null;

        System.out.println("================================================");
        System.out.println("        CENTRAL DE SEGURANÇA MULTICANAL         ");
        System.out.println("Como deseja receber o alerta?");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - WhatsApp");
        System.out.println("4 - Push Mobile");
        System.out.println("\nEscolha uma opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                canal = new NotificacaoSMS();
                break;

            case 2:
                canal = new NotificacaoEmail();
                break;

            case 3:
                canal = new NotificacaoWhatsApp();
                break;

            case 4:
                canal = new NotificacaoPush();
                break;

            case 5:
                canal = new NotificacaoDiscord();
                break;

            case 6:
                canal = new NotificacaoTeams();
                break;

            default:
                System.out.println("\nOpção inválida.");
        }
        if (canal != null) {
            String alerta = "Atenção: Um novo login foi detectado em um navegador desconhecido.";
            canal.enviar(alerta);
        }
        System.out.println("\n================================================");
        System.out.println("Sistema finalizado com sucesso.");

        leitor.close();
    }
}