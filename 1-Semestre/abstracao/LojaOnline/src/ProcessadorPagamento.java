// *** ABSTRAÇÃO AQUI ***
// Nosso contrato. Tod0 processador DEVE saber
// como 'iniciarPagamento' e 'verificarStatus'.
public interface ProcessadorPagamento {
    // Inicia o processador de pagamento e retorna um ID da da transação.
    String iniciarPagamento(Pedido pedido);

    // Verifica o status de uma transação existente.
    StatusPagamento verificarStatus(String idTransacao);
}