import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramadorDeRobo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lista polimórfica que pode guardar qualquer tipo de Ação
        List<Acao> programa = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- Programador de Robô ---");
            System.out.println("1 - Adicionar Ação: Andar");
            System.out.println("2 - Adicionar Ação: Girar");
            System.out.println("3 - Ver Programa");
            System.out.println("4 - Executar Programa e Sair");
            opcao = sc.nextInt();

            if (opcao == 1) programa.add(new Andar(10)); // if reduzido
            if (opcao == 2) programa.add(new Girar("direita"));
            if (opcao == 3) System.out.println("Programa tem " + programa.size() + " ações.");
        }

        System.out.println("\n--- EXECUTANDO PROGRAMA DO ROBÔ ---");
        // *** ABSTRAÇÃO E POLIMORFISMO EM AÇÃO ***
        // O executor não sabe o que cada ação faz. Ele apenas confia no contrato e manda cada uma se 'executar()'.
        for (Acao acao : programa) {
            acao.executar();
        }
        System.out.println("--- FIM DA EXECUÇÃO ---");
        sc.close();
    }
}