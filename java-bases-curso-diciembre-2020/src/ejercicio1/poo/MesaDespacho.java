package ejercicio1.poo;

public class MesaDespacho extends Mesa {
	Integer numeroCajones;

	public MesaDespacho(Integer numero_patas, String material, Integer numeroCajones) {
		super(numero_patas, material);
		this.numeroCajones = numeroCajones;
	}
	
	public void setNumeroCajones(Integer numeroCajones) {
		this.numeroCajones = numeroCajones;
	}
	
	public Integer getNumeroCajones() {
		return numeroCajones;
	}

}
