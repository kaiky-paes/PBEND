import java.util.Random;

public class Conta {
    protected double saldo;

    public Conta() {
        Random random = new Random();
        saldo = random.nextInt(1000, 6000);
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f", saldo);
    }
}