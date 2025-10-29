public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
        this.cnpj = cnpj;
    }

    @Override
    public boolean validarDocumento() {
        // Validação simples: CNPJ tem 14 dígitos
        String apenasNumeros = cnpj.replaceAll("[^0-9]", "");
        return apenasNumeros.length() == 14;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== PESSOA JURÍDICA ===");
        System.out.println("Razão Social: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Documento válido? " + (validarDocumento() ? "SIM" : "NÃO"));
        System.out.println("------------------------\n");
    }
}