public class RadioAutomotivo extends DispositivoDeMidia {

    private double estacaoAtualFM;

    public RadioAutomotivo(String nome, double estacao) {
        // Chamando o construtor da classe mãe
        super(nome);
        this.estacaoAtualFM = estacao;
    }

    @Override
    public void reproduzir() {
        System.out.println("O " + this.nomeDoDispositivo + " está sintonizado na estação de rádio FM " + this.estacaoAtualFM + ".");
    }
}