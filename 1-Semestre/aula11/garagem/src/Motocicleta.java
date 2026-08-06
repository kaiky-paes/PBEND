// Motocicleta é um Veiculo
public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int cilindradas) {
        // Chamando o construtor de Veiculo
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void empinar() {
        System.out.println("A moto " + modelo + " de " + cilindradas + "cc está empinando! (Com segurança)");
    }
}