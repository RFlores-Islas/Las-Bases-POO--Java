package com.rafael.prueba.figuras;

public class Rectangulo {

	// Propiedades básicas para definir el objeto
	private Punto puntoInferiorIzquierdo;
	private Punto puntoSuperiorDerecho;
	
	// Propiedades auxiliares para almacenar otros datos
	private Punto puntoSuperiorIzquierdo;
	private Punto puntoInferiorDerecho;

	// Constructores	
	Rectangulo(){
		this(new Punto(), new Punto());
	}
	
	Rectangulo(Punto puntoInferiorIzquierdo, Punto puntoSuperiorDerecho){
		this.puntoInferiorIzquierdo = puntoInferiorIzquierdo;
		this.puntoSuperiorDerecho = puntoSuperiorDerecho;
		calculaPuntos();
	}
	
	Rectangulo(int xInferiorIzquierdo, int yInferiorIzquierdo, int xSuperiorDerecho, int ySuperiorDerecho){
		this(new Punto(xInferiorIzquierdo, yInferiorIzquierdo), new Punto(xSuperiorDerecho, ySuperiorDerecho));
	}
	
	Rectangulo(Punto pInferiorIzquierdo, int xSuperiorDerecho, int ySuperiorDerecho){
		this(pInferiorIzquierdo, new Punto(xSuperiorDerecho, ySuperiorDerecho));
	}

	Rectangulo(int xInferiorIzquierdo, int yInferiorIzquierdo, Punto pSuperiorDerecho){
		this(new Punto(xInferiorIzquierdo, yInferiorIzquierdo), pSuperiorDerecho);
	}

	Rectangulo(int ancho, Punto pInferiorIzquierdo, int alto){
		this(pInferiorIzquierdo, new Punto(pInferiorIzquierdo.getX()+ancho, pInferiorIzquierdo.getY()+alto));
	}
	
	Rectangulo(Recta r1, Recta r2, int ancho, int alto){
		if (r1.getPunto1().getX() == r1.getPunto2().getX() && r2.getPunto1().getY() == r2.getPunto2().getY()){
		    puntoInferiorIzquierdo = new Punto(r1.getPunto1().getX(), r2.getPunto1().getY());
		    puntoSuperiorDerecho = new Punto(puntoInferiorIzquierdo.getX()+ancho, puntoInferiorIzquierdo.getY()+alto);
		    calculaPuntos();
		} else {
			puntoInferiorIzquierdo = new Punto();
			puntoSuperiorDerecho = new Punto();
			System.out.println("Error: las rectas no son perpendiculares");
		}
	}
	
	// Métodos set y get
	void setPii(Punto p){
		puntoInferiorIzquierdo = p;
		calculaPuntos();
	}

	void setPsd(Punto p){
		puntoSuperiorDerecho = p;
		calculaPuntos();
	}
	
	Punto getPii(){
		return puntoInferiorIzquierdo;
	}

	Punto getPsd(){
		return puntoSuperiorDerecho;
	}

	Punto getPsi(){
		return puntoSuperiorIzquierdo;
	}

	Punto getPid(){
		return puntoInferiorDerecho;
	}
	
	int getAncho(){
		return puntoInferiorDerecho.getX() - puntoInferiorIzquierdo.getX();
	}

	int getAlto(){
		return puntoSuperiorIzquierdo.getY() - puntoInferiorIzquierdo.getY();
	}

	// Métodos auxiliares
	private void calculaPuntos(){
		puntoSuperiorIzquierdo = new Punto(puntoInferiorIzquierdo.getX(), puntoSuperiorDerecho.getY());
		puntoInferiorDerecho = new Punto(puntoSuperiorDerecho.getX(), puntoInferiorIzquierdo.getY());
	}
	
	// toString
	public String toString(){
		return "<"+puntoInferiorIzquierdo+","+puntoSuperiorIzquierdo+","+puntoSuperiorDerecho+","+puntoInferiorDerecho+">";
	}
}

