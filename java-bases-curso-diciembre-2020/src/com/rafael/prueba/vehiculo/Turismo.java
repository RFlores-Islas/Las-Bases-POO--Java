package com.rafael.prueba.vehiculo;

public class Turismo extends Vehiculo{
	private String matricula;
	private Boolean aireAcondicionado;
	private Integer numeroVelocidades;
	
	public Turismo(String matricula, Boolean aireAcondicionado, Integer numeroVelocidades) {
		super();
		this.matricula = matricula;
		this.aireAcondicionado = aireAcondicionado;
		this.numeroVelocidades = numeroVelocidades;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Boolean getAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(Boolean aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public Integer getNumeroVelocidades() {
		return numeroVelocidades;
	}

	public void setNumeroVelocidades(Integer numeroVelocidades) {
		this.numeroVelocidades = numeroVelocidades;
	}
	
	@Override
	public String toString() {
		return "Turismo [matricula=" + matricula + ", numeroVelocidades="
				+ numeroVelocidades + "]";
	}


}
