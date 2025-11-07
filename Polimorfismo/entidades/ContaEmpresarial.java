package entidades;

public class ContaEmpresarial extends Conta { // 1 - extends: Indica que ContaEmpresarial está herdando Conta 
	
	private double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();// 2 - Chama o método construtor padrão da classe pai
	}
	
	// 3- Adiciona os mesmos parâmetros do construtor customizado da classe pai 
	// mais o parametro do construtor customizado da classe filha
	public ContaEmpresarial(int numero, String titular, double saldo, double limiteEmprestimo) { 
		super(numero, titular, saldo);              // 4 - Chama o método construtor customizado da classe pai
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestar(double valorEmprestimo) {
		if (valorEmprestimo <= limiteEmprestimo) {
			saldo -= valorEmprestimo;
		}
	}
	
	@Override
	public void sacar(double valorSaque) {
		super.sacar(valorSaque);
		saldo -= 2.0;
	}
	
	@Override
	public double calcularCashBack() {
		return valorFatura * 0.03;
	}
}
