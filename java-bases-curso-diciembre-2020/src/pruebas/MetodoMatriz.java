package pruebas;

import java.util.Scanner;

public class MetodoMatriz {
	Scanner entrada = new Scanner(System.in);
	Integer matriz [][];
	Integer nFilas;
	Integer nCol;
	Integer sumFilas;
	Integer sumCol;
	
	void tamañoMatriz(Integer nFilas, Integer nCol){
		this.nFilas = nFilas;
		this.nCol = nCol;
		matriz = new Integer [nFilas][nCol];
		
	}
	
	void digitaMatriz() {
		for(int i=0; i<nFilas; i++ ) {
			for(int j=0; j<nCol; j++) {
				System.out.print("matriz ["+i+"] ["+j+"]");
				matriz [i][j] = entrada.nextInt();
			}
			System.out.println("");
		}
	}
	
	void mostrarMatriz() {
		System.out.println("La matriz digitida fue:");
		for(int i=0; i<nFilas; i++) {
			for(int j=0; j<nCol; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	void sumaFilas() {
		for(int i=0; i<nFilas; i++) {
			sumFilas =0;
			for(int j=0; j<nCol; j++) {
				sumFilas += matriz[i][j];
			}
			System.out.println("La suma de la Fila ["+i+"] es: "+sumFilas);
		}
	}
	
	void sumaColumnas() {
		for(int j=0; j<nCol; j++) {
			sumCol =0;
			for(int i=0; i<nFilas; i++) {
				sumCol += matriz[i][j];
			}
			System.out.println("La suma de la Columna ["+j+"] es: "+sumCol);
		}
	}
	
}
