public class Caminhão extends Veiculo {
    public Caminhão(String modelo, String velomax) {
        super(modelo, velomax);
    }

    @Override
    public void buzina() {
        System.out.println("Buzina: Foon, foon!");
    }
}