/* 
    A classe Financeiro não sabe:
    - Se o pagamento é via Pix, Cartão ou Boleto.
    - Nem como o método funciona internamente.
    - Ela só sabe que existe um comportamento genérico: processarPagamento(valor).
*/

//Exemplo de uso das classes
public class Financeiro {

    // public String realizarPagamento(FormaPagamento metodoPagamento, double valor)
    // {
    // return metodoPagamento.processarPagamento(valor);
    // }

    public static void main(String[] args) {
        // Criando instâncias do Financeiro que irá processar os pagamentos
        // Financeiro financeiro = new Financeiro();

        // Criando instâncias das formas de pagamento
        FormaPagamento cartaoCredito = new PagamentoCartaoCredito();
        FormaPagamento pix = new PagamentoPix();

        cartaoCredito.processarPagamento(150.0);
        pix.processarPagamento(250.0);

        // Chamando o método para processar os pagamentos
        // System.out.println(financeiro.realizarPagamento(cartaoCredito, 150.0));
        // System.out.println(financeiro.realizarPagamento(pix, 200.0));
    }
}
