public class Moto extends Veiculo {
    public Moto(String modelo, String velomax) {
        super(modelo, velomax);
    }

    @Override
    public void buzina() {
        System.out.println("Buzina: Bi, Bi!");
    }
}