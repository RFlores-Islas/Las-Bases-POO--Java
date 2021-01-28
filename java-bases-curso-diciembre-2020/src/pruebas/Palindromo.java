package pruebas;
public class Palindromo {
	private String frase;
	

	   Palindromo(String frase) {
		this.frase = frase;
	}

	
	void LecturaPalindromo(){
		Integer contador = 0;
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)!= frase.charAt(frase.length()-i-1)) {
				contador =1;
			}
		}
		if(contador == 1) {
			System.out.println("No es Palindromo");
			
		}else {
		System.out.println("Es palindromo");
		}
	}
	
}

