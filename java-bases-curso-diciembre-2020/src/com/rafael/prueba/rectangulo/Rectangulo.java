package com.rafael.prueba.rectangulo;

public class Rectangulo {
	Integer alto;
	Integer ancho;
	
	public Rectangulo(Integer alto, Integer ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	void mostrarDatos() {
		System.out.println("Alto "+alto+" Ancho "+ancho);
	}
	
	void cambiarTamaño(Integer alt, Integer anch) {
		this.alto = alt;
		this.ancho = anch;
	}
}
