package com.rafael.prueba.hipotenusa;

public class triangulo {
	
	public static void main(String []args) {
		Double lado1 = 3.0;
		Double lado2 = 4.0;
		
		
		System.out.println(hipotenusa(lado1, lado2));
	}
	
	static Double hipotenusa(Double cat1, Double cat2) {
		Double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
		return hip;
	}
	

}
