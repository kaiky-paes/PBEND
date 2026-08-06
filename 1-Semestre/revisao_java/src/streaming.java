import java.util.Scanner;

public class streaming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        System.out.println("--------------------- CATÁLOGO ---------------------");
        System.out.println("[1] Invencivel");
        System.out.println("[2] Chaves");
        System.out.println("[3] Ben 10");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A série tem o tema de super heróis e o dilema entre uma raça extraterrestre dentro" +
                      " do planeta Terra.");
                System.out.println("Notas: Boa série para ver o protagonista apanhar.");
                break;

            case 2:
                System.out.println("Uma série de comédia.");
                System.out.println("Notas: Um clássico da comédia que passava nas TVs, atemporal no humor.");
                break;

            case 3:
                System.out.println("Desenho animado de uma criança que encontrou um relógio esquisito, grudou no pulso " +
                        "dele vindo lá do infinito e agora tem poderes e com eles faz bonito,é o Ben 10!");
                System.out.println("Notas: Um clássico dos desenhos animados de heróis");
        }
    }
}