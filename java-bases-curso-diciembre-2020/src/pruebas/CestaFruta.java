package pruebas;

public class CestaFruta {
	private Integer pesoFruta;
	private Integer numeroFrutas;
	private String nombreFruta;
	
	public CestaFruta(String nombreFruta, Integer pesoFruta, Integer numeroFrutas){
		this.pesoFruta = pesoFruta;
		this.numeroFrutas = numeroFrutas;
		this.nombreFruta = nombreFruta;
	}
	
	
	Integer pesoTotal(){
	 return pesoFruta*numeroFrutas;
	}
	
	boolean comparaFruta(Object obj) {
		if(obj instanceof CestaFruta) {
			CestaFruta fruta = (CestaFruta) obj;
			if(fruta.nombreFruta.equals(this.nombreFruta) && fruta.pesoFruta == this.pesoFruta &&
					fruta.numeroFrutas == this.numeroFrutas) {
				return true;
			}
		}
	return false;	
	}
	
	public String toString() {
		return "La Cesta de mayor peso contiene: "+numeroFrutas+" "+nombreFruta+"s. y tiene un peso de: "+pesoTotal()+" Gramos";
	}
	

}
