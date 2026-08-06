public class Carro extends Veiculo {
    public Carro(String modelo, String velomax) {
        super(modelo, velomax);
    }

    @Override
    public void buzina() {
        System.out.println("Buzina: Pan, pan!");
    }
}