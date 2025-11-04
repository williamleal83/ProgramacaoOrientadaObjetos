import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Cria clientes para associar aos pedidos (agregação)
        Cliente cliente1 = new Cliente(101, "Nicolas Cretton");
        Cliente cliente2 = new Cliente(202, "Nilton Abreu");

        // Cria pedidos associados ao cliente 1 (agregação)
        Pedido pedido1 = new Pedido(1001, new Date(), 10.0, cliente1);

        // Adiciona itens ao pedido 1 (composição)
        pedido1.adicionarItem(1, "Notebook", 1, 3500.00);
        pedido1.adicionarItem(2, "Mouse", 2, 80.00);

        // Cria pedidos associados ao cliente 2 (agregação)
        Pedido pedido2 = new Pedido(2002, new Date(), 0.0, cliente2);

        // Adiciona itens ao pedido 2 (composição)
        pedido2.adicionarItem(1, "Caderno", 5, 15.00);
        pedido2.adicionarItem(2, "Caneta", 5, 7.50);
        pedido2.adicionarItem(3, "Lapis", 5, 1.80);

        // ATENÇÃO AQUI:
        // Note que os clientes existem independentemente dos pedidos (agregação)
        // Mesmo que eu "apague" os pedidos, os clientes continuam existindo
        // Se e apagar os pedidos, os itens serão apagados junto (composição)

        // Imprime dados do pedido 1 e seu cliente
        System.out.println(pedido1);

        // Imprime dados do pedido 2 e seu cliente
        System.out.println(pedido2);
    }
}