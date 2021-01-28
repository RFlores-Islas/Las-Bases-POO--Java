package com.rafael.prueba.vehiculo;

public class ColorVehiculo extends Vehiculo{
	
	private String colorExterior;
	private String colorInterior;
	private String colorRines;
	
	ColorVehiculo(String colorExterior, String colorInterior, String colorRines){
		super();
		this.colorExterior = colorExterior;
		this.colorInterior = colorInterior;
		this.colorRines = colorRines;
	}
	
	
	public void setColorExterior(String colorExterior) {
		this.colorExterior = colorExterior;
	}

	public String getColorExterior() {
		return colorExterior;
	}

	public String getColorInterior() {
		return colorInterior;
	}

	public void setColorInterior(String colorInterior) {
		this.colorInterior = colorInterior;
	}

	public String getColorRines() {
		return colorRines;
	}

	public void setColorRines(String colorRines) {
		this.colorRines = colorRines;
	}

	@Override
	public String toString() {
		return "ColorVehiculo [colorExterior=" + colorExterior + ", colorInterior=" + colorInterior + ", colorRines="
				+ colorRines + "]";
	}
	
	

}
