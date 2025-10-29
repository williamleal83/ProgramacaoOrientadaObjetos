public class ProgramaPessoa {
    public static void main(String[] args) {
        // Criando uma pessoa física
        PessoaFisica pf = new PessoaFisica("Maria Silva", "123.456.789-00");
        pf.exibirDados();

        // Criando uma pessoa jurídica
        PessoaJuridica pj = new PessoaJuridica("Faminas", "12.345.678/0001-99");
        pj.exibirDados();

        // Testando com documentos inválidos
        PessoaFisica pfInvalida = new PessoaFisica("João", "123");
        pfInvalida.exibirDados();

        PessoaJuridica pjInvalida = new PessoaJuridica("Economart", "123");
        pjInvalida.exibirDados();

        // Futuro: usar uma lista
        // List<Pessoa> pessoas = new ArrayList<>();
        // pessoas.add(pf);
        // pessoas.add(pj);
        // for (Pessoa p : pessoas)
        // p.exibirDados();
    }
}