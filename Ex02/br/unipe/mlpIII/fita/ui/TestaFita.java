package br.unipe.mlpIII.fita.ui;

import br.unipe.mlpIII.fita.modelo.Autor;
import br.unipe.mlpIII.fita.modelo.Fita.categoria;
import br.unipe.mlpIII.fita.modelo.Infantil;
import br.unipe.mlpIII.fita.modelo.Lancamento;

public class TestaFita {

	public static void main(String[] args) {

		Autor nome1 = new Autor("C. S. Lewis");
		Autor nome2 = new Autor("J. R. R. Tolkien");

		Infantil inf = new Infantil();
		inf.setTitulo("As Crônicas de Nárnia");
		inf.setPreco(30);
		inf.setGenero(categoria.infantil);
		inf.setNomeAutor(nome1);

		Lancamento lanc = new Lancamento(50);
		lanc.setTitulo("O Hobbit");
		lanc.setGenero(categoria.aventura);
		lanc.setNomeAutor(nome2);

		System.out.println(inf + "0");
		System.out.println(lanc + "0");

	}

}