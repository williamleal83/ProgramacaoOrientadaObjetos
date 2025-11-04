import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1001, new Date(), 10.0);
        pedido.adicionarItem(1, "Caderno", 2, 15.50);
        pedido.adicionarItem(2, "Caneta", 5, 2.80);
        pedido.adicionarItem(3, "Livro", 1, 20.55);

        System.out.println(pedido);
    }
}