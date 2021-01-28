package com.rafael.prueba.cicloFor;

public class MathMax {

	public static void main(String []args) {
		int b = 7;
		int c = 5;
		int a = (Math.max(b,c) < 10) ? 10 : Math.max(b,c);
		System.out.println(a);
	}
	
}
