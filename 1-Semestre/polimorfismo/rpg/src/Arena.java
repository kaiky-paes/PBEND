public class Arena {
    public static void main(String[] args) {
        Personagem[] herois = {
                new Guerreiro("A"),
                new Mago("B"),
                new Arqueiro("C")
        };

        Personagem monstro = new Personagem("", 200, 0) {
            @Override
            public void usarHabilidade(Personagem alvo) {
                System.out.println("não tem habilidades especiais.");
            }
        };

        System.out.println("====== A BATALHA VAI COMEÇAR! ======\n");
        monstro.receberDano(0);
        System.out.println("");

        for (Personagem heroi : herois) {
            if (monstro.estaVivo()) {
                heroi.usarHabilidade(monstro);
                System.out.println("-----------------------------------------");
            }
        }
    }
}