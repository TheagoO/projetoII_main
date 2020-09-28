package usuario;

public class Usuario {
				
	private String nome;
	private String senha;
	private String dataCad;
	
	void usuario() {
		
	}
	
	public Usuario(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;		
	}
	
	public String getNome() {
		return nome;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getDataCad() {
		return dataCad;
	}
	
	public boolean verificaCadastro(String nome) {
		boolean retorno = false;
		
		
		
		return retorno;
	}
	
	public boolean RegistraCadastro(String nome, String senha) {
		boolean retorno = false;
		
		
		
		return retorno;
	}
		
}
