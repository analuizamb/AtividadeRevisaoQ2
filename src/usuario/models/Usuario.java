package usuario.models;

import java.io.Serializable;

//import javax.persistence.Entity;

@Entity
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private String nivelPermissao;
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNivelPermissao() {
		return nivelPermissao;
	}
	public void setNivelPermissao(String nivelPermissao) {
		this.nivelPermissao = nivelPermissao;
	}

}