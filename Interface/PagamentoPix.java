//Implementação do pagamento com PIX
public class PagamentoPix implements FormaPagamento {

    @Override
    public String processarPagamento(double valor) {
        // Lógica para processar o pagamento com PIX
        return "Pagamento concluído com sucesso - PIX - Valor R$:" + valor; // Simula que o pagamento foi processado com
                                                        // sucesso
    }
}