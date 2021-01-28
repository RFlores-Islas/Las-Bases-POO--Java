package com.rafael.prueba.rectangulo;

public class Cambio {
	
	void cambiarDatos(Integer a, Integer b) {
		Integer temporal = a;
		a = b;
		b = temporal;
	}
	
	void  cambiarDatos(Rectangulo r2) {
		r2.cambiarTamaño(40, 20);
	}
	
	
	void cambiarReferencia(Rectangulo r2) {
		r2 = new Rectangulo(20, 30);
	}

}
