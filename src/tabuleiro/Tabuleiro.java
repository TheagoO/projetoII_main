package tabuleiro;

public class Tabuleiro {
	final int L = 8;
	final int C = 8;
		
	private char[][] tabuleiro = new char[L][C];
	private int posicao;
	
	public Tabuleiro() {
		
	}
	
	public Tabuleiro(char[][] tabuleiro, int posicao) {
		super();
		this.tabuleiro = tabuleiro;
		this.posicao = posicao;
		
		
	}


	public char[][] getTabuleiro() {
		return tabuleiro;
	}


	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}


	public int getPosicao() {
		return posicao;
	}


	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	
	
	
	
	
}
