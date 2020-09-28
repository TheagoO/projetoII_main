package classes_exemplos_exercicios;

public class Cliente {
	
	private int NumeroConta;
	private String nomeCorrentista;
	private double saldo;
	
	public Cliente(int NumeroConta, String nomeCorrentista) {
		super();
		this.NumeroConta = NumeroConta;
		this.nomeCorrentista = nomeCorrentista;
		
	}
	
	public Cliente(double saldo) {
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
