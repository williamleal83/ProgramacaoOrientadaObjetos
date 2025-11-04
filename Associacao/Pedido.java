import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Pedido {
    private int idPedido;
    private Date data;
    private double valorDesconto;
    private List<ItemPedido> itens; // Composição - os itens estão contidos no pedido - um pedido pode ter muitos
                                    // itens, por isso é uma lista
    private Cliente cliente; // Agregação - um pedido "tem" um cliente

    public Pedido(int idPedido, Date data, double valorDesconto, Cliente cliente) {
        this.idPedido = idPedido;
        this.data = data;
        this.valorDesconto = valorDesconto;
        this.itens = new ArrayList<>(); // Inicializa a lista de itens do pedido, onde serão armazenados os itens
        this.cliente = cliente; // Agregação: o pedido referencia um cliente
    }

    public void adicionarItem(int idItem, String descricao, int quantidade, double valorUnitario) {
        // Cria o item dentro do pedido (composição)
        ItemPedido item = new ItemPedido(idItem, descricao, quantidade, valorUnitario);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularTotal();
        }

        return total - valorDesconto;
    }

    @Override
    public String toString() {
        return "-- Pedido --{" +
                "\n idPedido: " + idPedido +
                "\n data: " + data +
                "\n valorDesconto: " + valorDesconto +
                "\n total: " + calcularTotal() +
                "\n cliente: " + cliente.getIdCliente() + " - " + cliente.getNome() +
                "\n--- itens: ---\n" + itens + "}";
    }
}