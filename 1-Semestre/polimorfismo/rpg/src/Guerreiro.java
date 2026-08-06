public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120, 50);
    } // Mais vida, menos energia

    @Override
    public void usarHabilidade(Personagem alvo) {
        int custoEnergia = 20;
        if (this.energia >= custoEnergia) {
            this.energia -= custoEnergia;
            System.out.println(this.nome + " usa GOLPE FULMINANTE em " + alvo.nome + "!");
            alvo.receberDano(35); // Dano alto e direto
        } else {
            System.out.println(this.nome + " está sem energia para o Golpe Fulminante!");
        }
    }
}