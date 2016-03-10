package br.unipe.mlpIII.veiculo.modelo;

public abstract class Veiculo {
	
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double valorKmRodado;
	protected int kmInicial;
	protected int kmFinal;
	protected double valorLocacao;
	protected String chassi;
	protected Pessoa nome;
	
	public Veiculo(){
		
	}
	
	public Veiculo(double valorKmRodado, int kmInicial, int kmFinal){
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}
	
	public double valorLocacao(){
		return (kmFinal - kmInicial) * valorKmRodado;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public Pessoa getProprietario() {
		return nome;
	}

	public void setProprietario(Pessoa nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public String getChassi() {
		return chassi;
	}

	
}