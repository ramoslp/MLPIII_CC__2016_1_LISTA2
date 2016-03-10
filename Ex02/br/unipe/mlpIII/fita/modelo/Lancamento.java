package br.unipe.mlpIII.fita.modelo;

public final class Lancamento extends Fita {
	
	public Lancamento(){
		
	}
	
	public Lancamento(double preco) {
		super(preco);
	}

	public double precoLocacao(){
		return this.preco*(1.2);
	}
	
	public String toString(){
		return getTitulo()+", por "+getNomeAutor()+" - "+getGenero()+" = R$ "+precoLocacao();
	}

}