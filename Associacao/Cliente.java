public class Cliente {
    private int idCliente;
    private String nome;
    private String email;

    public Cliente(int idCliente, String nome) {
        this.idCliente = idCliente;
        this.nome = nome;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente: " + idCliente +
                ", nome: " + nome +
                ", email: " + email +
                '}';
    }
}
