package ejercicio1.poo;

public class MesaDibujo extends Mesa{
	Integer inclinacion;

	public MesaDibujo(Integer numero_patas, String material, Integer inclinacion) {
		super(numero_patas, material);
		this.inclinacion = inclinacion;
	}
	
	public void setInclinacion(Integer inclinacion) {
		this.inclinacion = inclinacion;
	}
	
	public Integer getInclinacion() {
		return inclinacion;
	}

}
