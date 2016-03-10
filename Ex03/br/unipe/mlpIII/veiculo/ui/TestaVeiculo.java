package br.unipe.mlpIII.veiculo.ui;

import br.unipe.mlpIII.veiculo.modelo.Pessoa;
import br.unipe.mlpIII.veiculo.modelo.VeiculoDeCarga;
import br.unipe.mlpIII.veiculo.modelo.VeiculoDePasseio;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Pessoa proprietario1 = new Pessoa("Jo�o");
		Pessoa proprietario2 = new Pessoa("Jos�");
		
		VeiculoDeCarga vg = new VeiculoDeCarga(2, 300, 500);
		vg.setProprietario(proprietario1);
		System.out.println("Valor de loca��o (ve�culo de carga): R$ " +vg.valorLocacao());
		
		VeiculoDePasseio vp = new VeiculoDePasseio(5, 0, 120);
		System.out.println("Valor de loca��o (ve�culo de passeio): R$ " +vp.valorLocacao());
	}
}
