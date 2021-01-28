package com.rafael.prueba.matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizSuma {
	
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		Integer matriz [][];
		Integer nFilas, nCol, sumFilas, sumCol;
		
		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de filas"));
		nCol = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de columnas"));
		matriz = new Integer [nFilas][nCol];
		
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCol; j++) {
				System.out.print("Matriz: ["+i+"]["+j+"]");
				matriz [i][j] = entrada.nextInt();
			}
			System.out.println("");
		}
		
		
		System.out.println("La matriz digitada fue: ");
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCol; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		for(int i=0; i<nFilas; i++) {
			sumFilas = 0;
			for(int j=0; j<nCol; j++) {
				sumFilas += matriz[i][j];
			}
			System.out.println("La suma de la fila ["+i+"] es: "+ sumFilas);
		}
		
		for(int j=0; j<nCol; j++) {
			sumCol = 0;
			for(int i=0; i<nFilas; i++) {
				sumCol += matriz [i][j];
			}
			System.out.println("La suma de la columna ["+j+"] es: "+sumCol);
		}
		
	}

}
