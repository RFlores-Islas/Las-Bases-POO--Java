package com.rafael.prueba.metodoEstatico;

public class MetodoEstatico {
	public static int contador;
	private String nombre;
	
	public MetodoEstatico(String nombre){
		this.nombre = nombre;
		contador ++;
	}
	
	public static void main(String []args) {
	MetodoEstatico m = new MetodoEstatico("Objeto 1");
	MetodoEstatico m1 = new MetodoEstatico("Objeto 2");
	MetodoEstatico m2 = new MetodoEstatico("Objeto 3");
	
	System.out.println(MetodoEstatico.contador);
	
		
	}
	
	
	
}
