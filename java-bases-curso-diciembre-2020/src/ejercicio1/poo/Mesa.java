package ejercicio1.poo;

public class Mesa {
	Integer numeroPatas;
	String material;
	
	public Mesa(Integer numero_patas, String material) {
	super();
	this.numeroPatas = numero_patas;
	this.material = material;
	}
	
	public void setNumero_patas(Integer numero_patas) {
		this.numeroPatas = numero_patas;
	}
	
	public Integer getNumero_patas() {
		return numeroPatas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
