public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int energia;

    public Personagem(String nome, int vida, int energia) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
    }

    public abstract void usarHabilidade(Personagem alvo);

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vida);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}
