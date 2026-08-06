public class Passaro extends Animal {
    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Piu, piu!";
    }
}