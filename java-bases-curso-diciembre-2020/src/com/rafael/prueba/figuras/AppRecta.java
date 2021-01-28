package com.rafael.prueba.figuras;

public class AppRecta {
	public static void main(String []args) {
		
		 Punto p1 = new Punto();
	        System.out.println(p1);

	        Punto p2 = new Punto(5,3);
	        System.out.println(p2);
	        
	        Recta r1 = new Recta();
	        System.out.println(r1);
	        System.out.println(r1.getTangente());

	        Recta r2 = new Recta(p1,p2);
	        System.out.println(r2);
	        System.out.println(r2.getTangente());

	        Recta r3 = new Recta(1,2,5,6);
	        System.out.println(r3);
	        System.out.println(r3.getTangente());
	        
	        r3.setPunto1(p2);
	        System.out.println(r3.getPunto1().getX());
	        
	        Rectangulo rec1 = new Rectangulo();
	        System.out.println(rec1);
	        
	        rec1.setPii(r3.getPunto2());
	        System.out.println(rec1);
	        
	        Rectangulo rec2 = new Rectangulo(r1,r2,30,20);
	        rec2 = new Rectangulo(p1,20,25);
	        System.out.println(rec2);
	        System.out.println(rec2.getAncho());
	}

}
