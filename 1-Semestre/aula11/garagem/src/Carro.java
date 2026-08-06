public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    public void abrirPortaMala() {
        System.out.println("O carro " + modelo + " de " + portas + " portas, está com o porta malas aberto.");
    }
}