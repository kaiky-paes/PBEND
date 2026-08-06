public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("O veículo " + marca + " " + modelo + " ligou.");
    }

    public void desligar() {
        System.out.println("O veículo " + marca + " " + modelo + " desligou.");
    }
}