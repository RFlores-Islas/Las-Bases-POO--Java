package com.rafael.prueba.cestaFruta;

public class CestaFruta {
	
	String fruta;
	Integer pesoFruta;
	Integer numeroFrutas;
	
	public CestaFruta(String fru, Integer numeroFrut, Integer pesoFrut) {
		this.fruta = fru;
		this.pesoFruta = pesoFrut;
		this.numeroFrutas = numeroFrut;
	}
	
	void vaciarCesta() {
		 fruta = "";
		 pesoFruta = 0;
		 numeroFrutas = 0;
	}
	
	Integer pesoCesta() {
		return pesoFruta * numeroFrutas;
	}
	
	 public boolean equals(Object obj) {
		 if(obj instanceof CestaFruta) {
			 CestaFruta cesta = (CestaFruta) obj;
			 if(cesta.fruta.equals(this.fruta) && cesta.numeroFrutas == this.numeroFrutas 
			&& cesta.pesoFruta == this.pesoFruta) return true;
		 }
		
		return false;
	}
	
	 public String toString(){
       return "Cesta de " + numeroFrutas + " " + fruta + "s. Peso: " + pesoCesta();
  }

}
