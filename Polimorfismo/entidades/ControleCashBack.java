package entidades;

public class ControleCashBack {
	
	private double totalCashBack;
	
	public double getTotalCashBack() {
		return totalCashBack;
	}
	
	public void registrarCashBackPago(Conta conta) {
		this.totalCashBack += conta.calcularCashBack();
	}
}
