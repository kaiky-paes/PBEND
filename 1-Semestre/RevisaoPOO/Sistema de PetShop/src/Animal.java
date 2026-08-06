public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("\nAnimal: %s\nNome: %s\nIdade: %d anos\nSom: %s",
                this.getClass().getSimpleName(), nome, idade, emitirSom());
    }
}