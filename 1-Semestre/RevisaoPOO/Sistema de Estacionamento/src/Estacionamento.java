import java.util.Scanner;

public class Estacionamento {
    Scanner scanner = new Scanner(System.in);

    Veiculo[] veiculos = new Veiculo[10];
    int cadastrados = 0;

    public void cadastrarVeiculo() {
        if (cadastrados < 10) {
            System.out.println("Digite o modelo do veículo: ");
            String modelo = scanner.nextLine();

            System.out.println("Digite a placa do veículo: ");
            String placa = scanner.nextLine();

            veiculos[cadastrados] = new Veiculo(modelo, placa);
            cadastrados++;
        } else {
            System.out.println("Nenhuma vaga disponível no momento.");
        }
    }

    public void quantidadeVeiculos() {
        System.out.println("\nQuantidade de veículos cadastrados: " + cadastrados + "/10");
        int vagas = 10 - cadastrados;
        System.out.println("Vagas disponíveis: " + vagas);
    }

    public void exibirVeiculos() {
        System.out.println("\nLista dos Veículos Cadastrados");
        for (int i = 0; i < cadastrados; i++) {
            System.out.println("\nModelo: " + veiculos[i].modelo);
            System.out.println("Placa: " + veiculos[i].placa);
        }
    }
}