package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Hashtable;

import domain.Canal;

public class Servidor {
	
	public static final int PUERTO = 4444;
	
	private Hashtable<String, HiloServidor> hilos = new Hashtable<String, HiloServidor>();
	//Almacena el hilo de conexión (HiloServidor) de cada cliente, usando el nick (String) del cliente como clave para poder enviarle mensajes privados.
	
	private Hashtable<String, Canal> canales = new Hashtable<String, Canal>();
	//Almacena todos los canales de chat (Canal) que se han creado, usando el nombre (String) del canal como clave para encontrarlos.
	
	public void ejecutar() {
		
		
		ServerSocket serverSocket = null;
		
		try {
			
			
			serverSocket = new ServerSocket(Servidor.PUERTO);
			
			
			
			while(true) {
			
				
				
				System.out.println("Esperando conexión...");
				Socket socket = serverSocket.accept();
				
				
				
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				
				
				pw.println("Bienvenido al servidor de DAD1. Escribe tu nick");
				pw.flush();
				
				
				String nick = br.readLine();
				
				
				
				HiloServidor hiloServidor = new HiloServidor(br, pw, this, nick);
				hiloServidor.start();		
				
				hilos.put(nick, hiloServidor); //Registra el hilo (hiloServidor) que maneja a un cliente en el mapa hilos, usando el nick de ese cliente como la clave para encontrarlo después.
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			if (serverSocket != null)
				try {
					
					serverSocket.close();
					
				} catch (IOException e) {
					
					e.printStackTrace();
					
				}
		}
		
	}
	
	
	
	public void enviarMensajeATodos(String mensaje) {
		
		for(HiloServidor hiloServidor : this.hilos.values()) {
			
			hiloServidor.enviaMensajeACliente(mensaje);
		}
	}
	
	
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||	
	public static void main(String[] args) {
		
		(new Servidor()).ejecutar();
		
	}
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	

	
	
	public void enviarMensajeA(String nick, String mensaje) {
		
		this.hilos.get(nick).enviaMensajeACliente(mensaje);	
		
	}

	
	
	public void crearCanal(String nombre) {
		
		this.canales.put(nombre, new Canal(nombre));
		
	}

	
	
	
	public void addHiloToCanal(String canal, HiloServidor hiloServidor) {
		
		this.canales.get(canal).addHiloServidor(hiloServidor);		
		
	}

	
	
	
	public void enviarMensajeACanal(String canal, String mensaje) {
		
		this.canales.get(canal).enviarMensajeAMiembrosCanal(mensaje);
		
		
	}
	


}
