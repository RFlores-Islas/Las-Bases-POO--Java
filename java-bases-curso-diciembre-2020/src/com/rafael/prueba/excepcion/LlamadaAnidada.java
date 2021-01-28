package com.rafael.prueba.excepcion;

public class LlamadaAnidada {
	public static void main(String []args) {
		llamada1();
	}
	
	public static void llamada1(){
		llamada2();
	}
	
	public static void llamada2() {
		indice();
	}
	
	public static void indice() {
		
		int a = 3;
		int b = 7;
		
		int c[] = new int [a];
		c[b] = 6;
		
		System.out.println("Mensaje");
		
	}
	

}
