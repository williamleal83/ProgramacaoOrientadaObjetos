class ItemPedido {
    private int idItem;
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(int idItem, String descricao, int quantidade, double valorUnitario) {
        this.idItem = idItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public double calcularTotal() {
        return quantidade * valorUnitario;
    }

    @Override
    public String toString() {
        return "\nItemPedido{" +
                "\n - idItem: " + idItem +
                "\n - descricao: " + descricao +
                "\n - quantidade: " + quantidade +
                "\n - valorUnitario: " + valorUnitario +
                "\n - total=" + calcularTotal() + "}\n";
    }
}