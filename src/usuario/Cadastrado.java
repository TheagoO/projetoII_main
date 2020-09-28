package usuario;

public class Cadastrado {
	
	private int pontos;
	private int posi_rank;
	private int num_vit;
	private int num_derro;
	private int num_emp;
	
	void cadastrado() {
		
	}
	
	public Cadastrado(int pontos, int posi_rank, int num_vit, int num_derro, int num_emp) {
		super();
		this.pontos = pontos;
		this.posi_rank = posi_rank;
		this.num_vit = num_vit;
		this.num_derro = num_derro;
		this.num_emp = num_emp;
	}


	public int getPontos() {
		return pontos;
	}


	public void setPontos(int pontos) {
		this.pontos = pontos;
	}


	public int getPosi_rank() {
		return posi_rank;
	}


	public void setPosi_rank(int posi_rank) {
		this.posi_rank = posi_rank;
	}


	public int getNum_vit() {
		return num_vit;
	}


	public void setNum_vit(int num_vit) {
		this.num_vit = num_vit;
	}


	public int getNum_derro() {
		return num_derro;
	}


	public void setNum_derro(int num_derro) {
		this.num_derro = num_derro;
	}


	public int getNum_emp() {
		return num_emp;
	}


	public void setNum_emp(int num_emp) {
		this.num_emp = num_emp;
	}
	
	
	
	
	
}
