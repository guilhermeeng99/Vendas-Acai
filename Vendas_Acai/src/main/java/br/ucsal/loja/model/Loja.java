package br.ucsal.loja.model;

public class Loja {

	private long id;
	private String nome;
	private String email;
	private String login;
	private String senha;
	private String bairro;
	private String respostaComentario;
	
	private Papel papel;

	public Loja() {

	}

	public Loja(long id, String nome, String email, String login, String senha, String bairro,
			String respostaComentario) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.login = login;
		this.senha = senha;
		this.bairro = bairro;
		this.respostaComentario = respostaComentario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRespostaComentario() {
		return respostaComentario;
	}

	public void setRespostaComentario(String respostaComentario) {
		this.respostaComentario = respostaComentario;
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

	
}