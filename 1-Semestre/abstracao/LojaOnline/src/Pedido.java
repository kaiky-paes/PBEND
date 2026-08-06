// Representa o pedido de compra do cliente.
public class Pedido {
    private final int id;
    private final double valorTotal;
    private StatusPagamento status;

    public Pedido(int id, double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.status = StatusPagamento.PENDENTE; // Tod0 pedido começa como pendente.
    }

    // Getters e Setters para controlar o acesso aos dados.
    public double getValorTotal() { // o get lê os valores
        return valorTotal;

    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) { // O set altera o valor do atributo privado
        this.status = status;
    }

    public int getId() {
        return id;
    }
}