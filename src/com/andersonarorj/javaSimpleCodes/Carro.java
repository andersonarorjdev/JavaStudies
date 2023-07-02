package com.andersonarorj.javaSimpleCodes;

public class Carro {
	Boolean Farol;
	Boolean Vidros;
	Boolean Capo;
	Integer KMRodados;
	String Marca;
	
	
	public String carroAndar(){
		return "Carro Andando";
	}
	
	public String VidrosAbrir(Boolean paramBoolean){
		this.Vidros = paramBoolean;
		
		if(this.Vidros == false){
			return "Vidros Fechados";
		}
		else if(this.Vidros == true){
			return "Vidros Abertos";
		}
		return "Vidros Semi Abertos";
	}
	
	public String DadosDoCarro(Integer KMRodadosCarro, String marcaDoCarro){
		this.KMRodados = KMRodadosCarro;
		this.Marca = marcaDoCarro;
		
		return this.Marca + this.KMRodados.toString();
	}
}


