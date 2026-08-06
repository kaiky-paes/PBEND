import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = -1;

        while (option != 0) {
            System.out.println("--- DICE ROLLER ---");
            System.out.println("[1] - D6");
            System.out.println("[2] - D20");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    break;

                case 2:
                    break;

                case 0:
                    break;

                default:
                    break;
            }
        }
    }
}