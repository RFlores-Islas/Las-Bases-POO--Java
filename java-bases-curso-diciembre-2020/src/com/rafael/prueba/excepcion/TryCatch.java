package com.rafael.prueba.excepcion;

public class TryCatch {

	private static Integer a = 2;
	private static Integer b = 4;
	
	public static void main(String [] aargs) {
		
		Integer c [] = new Integer[a];
		try {
			c [b]= 6;
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Sin problema");
	}
}
