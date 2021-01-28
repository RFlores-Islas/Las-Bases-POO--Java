package com.rafael.prueba.lenguaje;

public class Persona {
	public static void main (String []args) {
		Registro p1 = new Registro();
		p1.nombre = "Rafael";
		p1.telefono= 565453364;
		
		Registro p2 = p1;
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("Telefono: "+p1.telefono);
		System.out.println("Nombre: "+p2.nombre);
		System.out.println("Telefono: "+p2.telefono);
		
		p2.nombre = "Carolina";
		p2.telefono = 343532136;
		System.out.println("============================");
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("Telefono: "+p1.telefono);
		System.out.println("Nombre: "+p2.nombre);
		System.out.println("Telefono: "+p2.telefono);
		
		p1.cambiarRegistro("Liliana", 656536132);
		System.out.println("============================");
		System.out.println("Nombre: "+p1.nombre);
		System.out.println("Telefono: "+p1.telefono);
		System.out.println("Nombre: "+p2.nombre);
		System.out.println("Telefono: "+p2.telefono);
	}
}

class Registro{
	
	String nombre;
	Integer telefono;
	
	void cambiarRegistro(String nombre, Integer telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
			
	}
	

