package com.rafael.prueba.cicloFor;

public class cicloFor {
	
	public static void main(String []rgs) {
		
		for(int i=0; i<10; i++) {
			//System.out.println(i);
			for(int j=1; j<=10; j++) {
				System.out.print((10*i+j)+" ");
			}
			System.out.println(" ");
		}
	}

}
