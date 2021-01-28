package ejercicio1.poo;

public class MesaCocina extends Mesa{
	String forma;
	
	public MesaCocina(Integer numeroPatas, String material, String forma) {
		super(numeroPatas, material);
		this.forma = forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	public String getForma() {
		return forma;
	}
}
