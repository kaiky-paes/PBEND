public class Cliente {
    private String nomeCliente;
    private String endereco;

    public Cliente(String nomeCliente, String endereco) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }
}