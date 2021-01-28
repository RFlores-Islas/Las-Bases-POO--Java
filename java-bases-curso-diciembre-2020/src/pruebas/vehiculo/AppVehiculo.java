package pruebas.vehiculo;

public class AppVehiculo {
	
	public static void main(String []args) {
		Vehiculo v1 = new Vehiculo();
		
		v1.abrirPuertas();
		if(v1.introducirOcupantes(5)) System.out.println("Se han introducido");
		
		v1.cerrarPuertas();
		if(v1.desplazar(50)) System.out.println("Nos hemos movido");;
		System.out.println(v1);
		
	}

}
