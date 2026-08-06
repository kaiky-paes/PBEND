public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 100);
    } // Menos vida, mais energia

    @Override
    public void usarHabilidade(Personagem alvo) {
        int custoEnergia = 30;
        if (this.energia >= custoEnergia) {
            this.energia -= custoEnergia;
            System.out.println(this.nome + " lança BOLA DE FOGO em " + alvo.nome + "!");
            alvo.receberDano(25); // Dano mágico
        } else {
            System.out.println(this.nome + " está sem mana para a Bola de Fogo!");
        }
    }
}