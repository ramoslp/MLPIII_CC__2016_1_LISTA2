package br.unipe.mlpIII.data.modelo;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes){
		this(dia, mes, 2016);
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	
	private boolean isViavel (int dia, int mes, int ano){
		if (dia <= 0 || mes <= 0 || mes > 12)
			return false;
		
		int ultimoDiaDoMes = 31;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
			ultimoDiaDoMes = 30;
		}else if (mes == 2){
			if (ano % 4 == 0){
				ultimoDiaDoMes = 29;
			}else{
				ultimoDiaDoMes = 28;
			}
		}
		
		if (dia > ultimoDiaDoMes)
			return false;
		
		return true;
	}
	
	public String toString(){
		if (isViavel(dia, mes, ano)){
			if (dia < 10 && mes < 10)
				return "0"+this.dia+"/0"+this.mes+"/"+this.ano;
			else if(dia < 10 && mes > 10)
				return "0"+this.dia+"/"+this.mes+"/"+this.ano;
			else if(dia > 10 && mes < 10)
				return this.dia+"/0"+this.mes+"/"+this.ano;
			
			return this.dia+"/"+this.mes+"/"+this.ano;
		}else{
			return "DATA INVÁLIDA";
		}
	}

}