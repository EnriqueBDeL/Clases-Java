package domain;


import java.util.ArrayList;

import Principal.HiloServidor;


public class Canal {
	
	
	private ArrayList<HiloServidor> hilos = new ArrayList<HiloServidor>(); //Almacena todos los objetos HiloServidor (los usuarios) que están suscritos a ese canal.
	
	private String nombre;
	

	
//...................................	
	public Canal(String nombre) {
		
		this.nombre = nombre;
		
	}
//...................................	


	
	
	public void addHiloServidor(HiloServidor hiloServidor) {
		
		this.hilos.add(hiloServidor);
		
		
	}

	
	

	public void enviarMensajeAMiembrosCanal(String mensaje) {
		
		for(HiloServidor hiloServidor : this.hilos) {
			
			hiloServidor.enviaMensajeACliente(mensaje);
			
		}
		
	}
}
