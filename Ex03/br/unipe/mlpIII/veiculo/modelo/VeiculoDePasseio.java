package br.unipe.mlpIII.veiculo.modelo;

public final class VeiculoDePasseio extends Veiculo {
	
	private boolean possuiAr;
	private int qtdPortas;
	
	public VeiculoDePasseio(){
		
	}
	
	public VeiculoDePasseio(double valorKmRodado, int kmInicial, int kmFinal) {
		super(valorKmRodado, kmInicial, kmFinal);
	}
	
	public void setPossuiAr(boolean possuiAr){
		this.possuiAr = possuiAr;
	}
	
	public void setQtdPortas(int qtdPortas){
		this.qtdPortas = qtdPortas;
	}
}