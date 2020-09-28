package usuario;

import java.util.Random;

public class Visitante {
	
	public int nome;
	
	Random rand = new Random();
	
	public void setVisitante() {
		nome = rand.nextInt(9999);
	}
	
}
