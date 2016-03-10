package br.unipe.mlpIII.fita.modelo;

public abstract class Fita {

	protected String titulo;
	protected double preco;
	protected Autor autor;
	protected categoria genero;

	public enum categoria {
		aventura, comedia, drama, ficcao, infantil, suspense, terror;
	}

	public Fita() {

	}

	public Fita(double preco) {
		this.preco = preco;
	}

	public double precoLocacao() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public categoria getGenero() {
		return genero;
	}

	public void setGenero(categoria genero) {
		this.genero = genero;
	}

	public Autor getNomeAutor() {
		return autor;
	}

	public void setNomeAutor(Autor autor) {
		this.autor = autor;
	}

}