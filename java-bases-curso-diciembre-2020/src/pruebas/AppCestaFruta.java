package pruebas;

public class AppCestaFruta {
	public static void main(String []args) {
		CestaFruta fruta = new CestaFruta("Manzana", 330, 2);
		CestaFruta fruta1 = new CestaFruta("Piña", 530, 2);
		CestaFruta fruta2 = new CestaFruta("Pera", 200, 6);
		
		if(fruta.pesoTotal() > fruta1.pesoTotal() && fruta.pesoTotal() > fruta2.pesoTotal()) {
			System.out.println(fruta);
		}else if(fruta1.pesoTotal() > fruta2.pesoTotal()) {
			System.out.println(fruta1);
		}else {
			System.out.println(fruta2);
		}
	}

}
