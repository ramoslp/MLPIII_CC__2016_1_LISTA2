package br.unipe.mlpIII.veiculo.modelo;

public final class VeiculoDeCarga extends Veiculo {
	
	private double capacidadeCarga;
	
	public VeiculoDeCarga(){
		
	}
	
	public VeiculoDeCarga(double valorKmRodado, int kmInicial, int kmFinal) {
		super(valorKmRodado, kmInicial, kmFinal);
	}

	public void setCapacidadeCarga(double capacidadeCarga){
		this.capacidadeCarga = capacidadeCarga;
	}
}