public abstract class Pessoa {
    protected String nome;
    protected String documento;  // CPF ou CNPJ

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    // MÉTODO ABSTRATO 1 – Cada tipo de pessoa valida de forma diferente
    public abstract boolean validarDocumento();

    // MÉTODO ABSTRATO 2 – Cada tipo exibe seus dados de forma personalizada
    public abstract void exibirDados();

    // MÉTODO CONCRETO (comum a todos)
    public String getNome() {
        return nome;
    }
}