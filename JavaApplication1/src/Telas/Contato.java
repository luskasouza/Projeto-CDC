package Telas;

public class Contato {
	private String nome;
	private String email;
	private String celulcar;
	
	public Contato() {
		
	}
	
	public Contato(String nome, String email, String celulcar) {
		this.nome = nome;
		this.email = email;
		this.celulcar = celulcar;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelulcar() {
		return celulcar;
	}
	public void setCelulcar(String celulcar) {
		this.celulcar = celulcar;
	}
	
	
}
