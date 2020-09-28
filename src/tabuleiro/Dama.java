package tabuleiro;

public class Dama {
	
	private int[] damas = new int[12];
	
	void damas() {
		
	}
	
	public void defineDamas() {
		for(int i = 24; i < 36; i++) {
			damas[i] = i+1;
		}		
	}

	public int[] getDamas() {
		return damas;
	}
		
}
