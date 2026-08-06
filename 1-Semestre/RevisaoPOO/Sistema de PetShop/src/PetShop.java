import java.util.ArrayList;
import java.util.Scanner;

public class PetShop {
    private ArrayList<Animal> listaDeAnimais = new ArrayList<>();

    public void cadastrarAnimal(Animal animal) {
        listaDeAnimais.add(animal);
        System.out.println(animal.getNome() + " cadastrado com sucesso.");
    }

    public void exibirAnimais() {
        if (listaDeAnimais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        }

        for (Animal animal : listaDeAnimais) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        PetShop sistemaPetShop = new PetShop();
        Scanner scanner = new Scanner(System.in);

        int escolha = -1;

        System.out.println("Bem-vindo(a) ao Sistema de PetShop");
        while (escolha != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("[1] - Cadastrar animal");
            System.out.println("[2] - Exibir animais cadastrados");
            System.out.println("[0] - Sair do sistema");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Escolha o tipo de animal:");
                    System.out.println("[1] - Cachorro");
                    System.out.println("[2] - Gato");
                    System.out.println("[3] - Passáro");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o nome do animal: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade do animal: ");
                    int idade = scanner.nextInt();

                    Animal addAnimal = switch (tipo) {
                        case 1 -> new Cachorro(nome, idade);
                        case 2 -> new Gato(nome, idade);
                        case 3 -> new Passaro(nome, idade);
                        default -> null;
                    };

                    if (addAnimal != null) {
                        sistemaPetShop.cadastrarAnimal(addAnimal);
                    } else {
                        System.out.println("Tipo de animal inválido!");
                    }
                    break;

                case 2:
                    sistemaPetShop.exibirAnimais();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}