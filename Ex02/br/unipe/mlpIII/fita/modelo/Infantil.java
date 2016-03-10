package br.unipe.mlpIII.fita.modelo;

public final class Infantil extends Fita {
	
	public Infantil(){
		
	}
	
	public Infantil(double preco) {
		super(preco);
	}

	public double precoLocacao(){
		return this.preco*(0.6);
	}
	
	public String toString(){
		return getTitulo()+", por "+getNomeAutor()+" - "+getGenero()+" = R$ "+precoLocacao();
	}

}