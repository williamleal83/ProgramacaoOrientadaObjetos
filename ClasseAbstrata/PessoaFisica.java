public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
        this.cpf = cpf;
    }

    @Override
    public boolean validarDocumento() {
        // Validação simples: CPF tem 11 dígitos
        String apenasNumeros = cpf.replaceAll("[^0-9]", "");
        return apenasNumeros.length() == 11;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== PESSOA FÍSICA ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Documento válido? " + (validarDocumento() ? "SIM" : "NÃO"));
        System.out.println("------------------------\n");
    }
}