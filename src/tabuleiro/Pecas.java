package tabuleiro;

public class Pecas {
	
	private int[] play_one = new int[12];
	private int[] play_two = new int[12];
	private int[][] pecas = new int[8][8];
	
	
	public Pecas() {
		
	}

	public Pecas(int[][] pecas) {
		super();
		this.pecas = pecas;
		
			
	}
	
	public void passaID() {
		for(int i = 0; i < 12; i++) {
			play_one[i] = i+1;
		}
		for(int i = 12; i < 24; i++) {
			play_two[i] = i+1;
		}		
	}
		
	public int[][] getPecas() {
		return pecas;
	}

	public int[] getPlay_one() {
		return play_one;
	}

	public int[] getPlay_two() {
		return play_two;
	}
	
}
