package pruebas.vehiculo;

public class Vehiculo {
	
	public final int MAX_OCUP;
	private int numActualOcup;
	
	private boolean puertasAbiertas = false;
	
	public Vehiculo(){
		MAX_OCUP = 5;
		numActualOcup = 0;
	}
	
	public Vehiculo(int max){
		MAX_OCUP = max;
		numActualOcup = 0;
	}
	
	public boolean introducirOcupantes(int num){
		
		if (!puertasAbiertas) {
			System.out.println("Las puertas no están abiertas");
			return false;
		}
		
		if ((num + numActualOcup) > MAX_OCUP) return false;
		else {
			numActualOcup += num;
			return true;
		}
	}
	
	public boolean sacarOcupantes(int num){
		if (!puertasAbiertas) {
			System.out.println("Las puertas no están abiertas");
			return false;
		}
		
		if ((numActualOcup - num) < 0) return false;
		else {
			numActualOcup -= num;
			return true;
		}
	}
	
	public int getNumActualOcup(){
		return numActualOcup;
	}
	
	public void abrirPuertas(){
		puertasAbiertas = true;
	}

	public void cerrarPuertas(){
		puertasAbiertas = false;
	}
	
	public boolean isPuertasAbiertas(){
		return puertasAbiertas;
	}
	
	public boolean desplazar(int metros){
		if (puertasAbiertas){
			System.out.println("El vehículo no se mueve si las puertas están abiertas");
			return false;
		}
		return true;
	}
	
	public String toString(){
		return "Vehiculo:: "+MAX_OCUP+" ("+numActualOcup+")";
	}

	
	

}
