package classes_exemplos_exercicios;

public class Conta {

	private int NumeroConta;
	private String nomeCorrentista;
	private double saldo;
	
	public Conta(int numeroConta, String nomeCorrentista, double saldo) {
		super();
		NumeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}
	
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
		
	}
	
	public void deposito(double quantia) { 
		this.saldo += saldo;
	}
	
	public void saque(double quantia) { 
		this.saldo -= saldo+3;
	}
	
	public String getNome() {
		return nomeCorrentista;
	}

	public void setNome(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return NumeroConta;
	}
		
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return nomeCorrentista + ", N°:" + NumeroConta + ", $" + String.format("%.2f", saldo);
	}
	
	
}
