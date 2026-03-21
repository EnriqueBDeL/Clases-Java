package edu.ucam.domain;

public class Habitacion {

	private String id;
	private String nombre;
	private String tipo;
	private int camas;
	private boolean reservada = false;
	
	
	public Habitacion(String id, String nombre, String tipo, int camas) {
		
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.camas = camas;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getCamas() {
		return camas;
	}


	public void setCamas(int camas) {
		this.camas = camas;
	}


	public boolean isReservada() {
		return reservada;
	}


	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
	
	
	
	
}
