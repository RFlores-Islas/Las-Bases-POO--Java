package com.rafael.prueba.cicloFor;

import java.util.Arrays;

public class cicloOrdenacion {
	public static void main(String []args) {
		int arrayNum[] = {1,5,3,9,4,6,87,5,6,10};
		
		for(int i=0; i<arrayNum.length; i++) {
			for(int j=i+1; j<arrayNum.length; j++) {
				if(arrayNum[i]>arrayNum[j]) {
					int temporal = arrayNum[i];
					arrayNum[i] = arrayNum[j];
					arrayNum[j] = temporal;
				}
			}
		}
		System.out.println(Arrays.toString(arrayNum));
		
		int arrayNum2[] = {10,52,2,9,4,6,87,5,6,11};
		Arrays.sort(arrayNum2);
		System.out.println(Arrays.toString(arrayNum2));
	}

}
