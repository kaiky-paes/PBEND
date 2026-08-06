public abstract class Veiculo {
    protected String modelo;
    protected String velomax;

    public Veiculo(String modelo, String velomax) {
        this.modelo = modelo;
        this.velomax = velomax;
    }

    public void detalhes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade máxima: " + this.velomax);
    }

    public abstract void buzina();
}