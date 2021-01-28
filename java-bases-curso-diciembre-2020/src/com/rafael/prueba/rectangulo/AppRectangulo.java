package com.rafael.prueba.rectangulo;

public class AppRectangulo {
	public static void main(String args[]){
		Cambio cambio = new Cambio();
		
		Integer n1 = 5;
		Integer n2 = 10;

		cambio.cambiarDatos(n1, n2);
		System.out.println("n1= "+n1+", n2= "+n2);
		
		Rectangulo rectangulo = new Rectangulo(10,10);
		rectangulo.mostrarDatos(); 
		cambio.cambiarDatos(rectangulo);
		rectangulo.mostrarDatos();
		
		cambio.cambiarReferencia(rectangulo);
		rectangulo.mostrarDatos();
		
		System.out.println(rectangulo instanceof Rectangulo);
	}

}
