package br.ucsal.cliente.model;

public class Produto {

	private long id;
	private String nome;
	private String conteudo;
	private String gramas;
	private String preco;

	public Produto() {

	}

	public Produto(long id, String nome, String conteudo, String gramas, String preco) {
		this.id = id;
		this.nome = nome;
		this.conteudo = conteudo;
		this.gramas = gramas;
		this.preco = preco;
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

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getGramas() {
		return gramas;
	}

	public void setGramas(String gramas) {
		this.gramas = gramas;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

}
