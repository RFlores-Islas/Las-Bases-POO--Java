package com.rafael.prueba.vehiculo;

public class Vehiculo {
	// La hacemos final porque será constante 
		// en la vida del vehículo
		// No importa que sea pública porque no se podrá cambiar
		// después de crear el vehículo
		public final int MAX_OCUP;
		private int numActualOcup;
		
		private boolean puertasAbiertas = false;
		
		// Constructor vacío: nº máx. de ocupantes por defecto = 5
		
		public Vehiculo(){
			MAX_OCUP = 5;
			numActualOcup = 0;
		}
		
		// Constructor que admite el nº máx de ocupantes
		public Vehiculo(int max){
			MAX_OCUP = max;
			numActualOcup = 0;
		}
		
		// Método para introducir ocupantes
		// Devuelve true si se han podido introducir los ocupantes
		// y false si no han cabido
		public boolean introducirOcupantes(int num){
			
			if (!puertasAbiertas) {
				// Esto se haría mejor con una excepción, 
				// pues no sabemos cuál es la interfaz de usuario
				System.out.println("Las puertas no están abiertas");
				return false;
			}
			
			if ((num + numActualOcup) > MAX_OCUP) return false;
			else {
				numActualOcup += num;
				return true;
			}
		}
		
		// Método para sacar ocupantes
		public boolean sacarOcupantes(int num){
			if (!puertasAbiertas) {
				// Esto se haría mejor con una excepción, 
				// pues no sabemos cuál es la interfaz de usuario
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
			
			// Operaciones de desplazamiento
			return true;
		}

		// Método para imprimir los objetos: devuelve una 
		// representación en forma de String del objeto
		public String toString(){
			return "Vehiculo:: "+MAX_OCUP+" ("+numActualOcup+")";
		}

		/******************** main *********************/

		public static void main(String args[]){
			
			Vehiculo v1;
			v1 = new Vehiculo();
			System.out.println(v1);
			
			Vehiculo v2 = new Vehiculo(9);
			
			v1.introducirOcupantes(3);
			System.out.println(v1);
			
			v1.abrirPuertas();

			boolean introducido = v1.introducirOcupantes(3);
			
			if (introducido){
				System.out.println("Se han introducido los ocupantes");
			}
			System.out.println(v1);
			
			v1.desplazar(50);
			
			v1.cerrarPuertas();
			
			if (v1.desplazar(50)) System.out.println("Nos hemos movido");
			
			ColorVehiculo cv1 = new ColorVehiculo("Negro", "Gris", "Grises");
			System.out.println(cv1);
			
			Turismo t1 = new Turismo("3532132", true, 5);
			System.out.println(t1);
			if(t1.getAireAcondicionado()== true) {
				System.out.println("Cuenta con aire acondicionado");
			}else {
				System.out.println("No cuenta con aire acondicionado");
			}
			
			
			
			//v1.MAX_OCUP = 6;
	/*
			Turismo t = new Turismo();
			System.out.println(t);
			
			t.introducirOcupantes(3);
			System.out.println(t);
	*/		
		}

}
