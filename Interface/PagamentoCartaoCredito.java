// Cada classe implementa os detalhes concretos de cada forma de pagamento, mas o resto do sistema não precisa saber disso.

// Implementação do pagamento com cartão de crédito
public class PagamentoCartaoCredito implements FormaPagamento {

    @Override
    public String processarPagamento(double valor) {
        // Lógica para processar o pagamento com cartão de crédito
        return "Pagamento concluído com sucesso - cartão de crédito - Valor R$:" + valor; // Simula que o pagamento foi
                                                                                          // processado com sucesso
    }
}
