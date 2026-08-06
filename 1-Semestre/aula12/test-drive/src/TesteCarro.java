public class TesteCarro {
    public static void main(String[] args) {
        System.out.println("--- Criando e interagindo com o meu Fusca ---");
        // 1. Criamos uma instância (um objeto real) da classe Carro
        Carro meuFusca = new Carro();

        // 2. Tentamos acelerar com o carro desligado
        System.out.println("\nTentando acelerar desligado...");
        meuFusca.acelerar(20); // A regra de encapsulamento vai impedir
        System.out.println("Velocidade atual do Fusca: " + meuFusca.getVelocidade() + " km/h");

        // 3. Ligamos o carro usando o metodo público
        System.out.println("\nAgora vamos ligar o carro...");
        meuFusca.ligar();

        // 4. Tentamos ligar de novo
        meuFusca.ligar(); // A lógica interna vai avisar que já está ligado

        // 5. Agora aceleramos
        System.out.println("\nAcelerando...");
        meuFusca.acelerar(15); // Aumenta para 15. A marcha vai para 1.
        meuFusca.acelerar(20); // Aumenta para 35. A marcha vai para 2.

        System.out.println("Velocidade atual do Fusca: " + meuFusca.getVelocidade() + " km/h");

        // 6. Vamos frear
        System.out.println("\nFreando um pouco...");
        meuFusca.frear(10); // Reduz para 25. A marcha volta para 2.

        System.out.println("Velocidade final do Fusca: " + meuFusca.getVelocidade() + " km/h");
    }
}