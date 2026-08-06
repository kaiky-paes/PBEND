public class Garagem {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", 4);
        Motocicleta minhaMoto = new Motocicleta("Honda", "CB 500", 500);

        System.out.println("--- Ações com o Carro ---");
        meuCarro.ligar();           // Metodo herdado de Veículo
        meuCarro.abrirPortaMala();  // Metodo específico de Carro
        meuCarro.desligar();         // Metodo herdado de Veículo

        System.out.println("\n--- Ações com a Motocicleta");
        minhaMoto.ligar();          // Metodo herdado de Veículo
        minhaMoto.empinar();        // Metodo específico de Motocicleta
        minhaMoto.desligar();       // Metodo herdado de Veículo
    }
}