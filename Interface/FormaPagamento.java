/*
    - A interface define o conceito genérico de um pagamento.
    - Mas não mostra os detalhes concretos, como o QR Code é gerado, como a transação é autorizada, etc.
 */

//Definição da interface de Pagamento
public interface FormaPagamento {
    String processarPagamento(double valor);
}
