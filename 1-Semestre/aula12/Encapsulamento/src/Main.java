public class Main {
    public static void main(String[] args) {
        // ContaBancaria: classe e com o new, instâncio o objeto (deixa usual)
        // classe                       objeto
        ContaBancaria minhaConta = new ContaBancaria(100.0);

        minhaConta.saldo = -500;

        minhaConta.depositar(50.0);
        minhaConta.sacar(30.0);
        minhaConta.sacar(200.0);

        System.out.println("Saldo final: " + minhaConta.getSaldo());
    }
}