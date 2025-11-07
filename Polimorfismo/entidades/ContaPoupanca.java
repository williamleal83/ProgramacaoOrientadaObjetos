package entidades;

public final class ContaPoupanca extends Conta {
	
	private double taxaJuros;

	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += (taxaJuros / 100) * saldo;
	}
	
	@Override
	public void sacar(double valorSaque)	{
		saldo -= valorSaque;
	}
	
	@Override
	public double calcularCashBack() {
		return valorFatura * 0.02;
	}

}
