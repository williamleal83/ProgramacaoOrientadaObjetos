package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;
import entidades.ControleCashBack;

public class Programa {

	public static void main(String[] args) {
		
		ControleCashBack controle = new ControleCashBack();
		
		//Conta conta1 = new Conta(1020, "João", 1000.00);
		//conta1.setValorFatura(1000.00);
		
		Conta conta2 = new ContaPoupanca(1021, "Ana", 1000.00, 1);
		conta2.setValorFatura(2000.00);
		
		Conta conta3 = new ContaEmpresarial(1022, "Maria", 2500.00, 1000.00);
		conta3.setValorFatura(3000.00);
	
		//conta1.sacar(100.00);
		conta2.sacar(100.00);
		conta2.sacar(100.00);
		
		System.out.println("-------------------------------------" );
		
		//System.out.println("Saldo Conta1: " + conta1.getSaldo());
		System.out.println("Saldo Conta2: " + conta2.getSaldo());
		System.out.println("Saldo Conta3: " + conta3.getSaldo());
		
		System.out.println("-------------------------------------" );
		
		//System.out.println("CashBack Conta1: " + conta1.calcularCashBack());
		System.out.println("CashBack Conta2: " + conta2.calcularCashBack());
		System.out.println("CashBack Conta3: " + conta3.calcularCashBack());
		
		//controle.registrarCashBackPago(conta1);
		controle.registrarCashBackPago(conta2);
		controle.registrarCashBackPago(conta3);
		
		System.out.println("-------------------------------------" );
		
		System.out.println("Total de CashBack Pago: " + controle.getTotalCashBack());
	}

}
