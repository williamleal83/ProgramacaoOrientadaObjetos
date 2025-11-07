package entidades;

import interfaces.ContaPadrao;

public abstract class Conta implements ContaPadrao{
	
	private int numero;
	private String titular;
	protected double saldo;
	protected double valorFatura;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String titular, double saldo) {
		this.numero  = numero;
		this.titular = titular;
		this.saldo   = saldo;	
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	public void sacar(double valorSaque) {
		saldo -= valorSaque + 5.0;
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito; 
	}
	
	public double calcularCashBack() {
		return valorFatura * 0.01;
	}
}
