package privado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

public class Servidor {

	private static final int PUERTO = 4444;
	
	private Hashtable<String,HiloServidor> listaHilos = new Hashtable<String,HiloServidor>();
	
	private Hashtable<String,Material> listaMateriales = new Hashtable<String, Material>();
	
	
	public void ejecutar() {
		
		try {
			
			ServerSocket serverSocket = new ServerSocket(Servidor.PUERTO);
			
			System.out.println("SERVIDOR escuchando en el puerto " + PUERTO + "...");
			
			while(true) {
				
				
				System.out.println("Esperando conexión...");
				
				Socket socket = serverSocket.accept();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				pw.println("Bienvenido al servidor EB. Introduce tu nombre de usuario:");
				pw.flush();
				

				String nombreUsuario = br.readLine();
				
				System.out.println("Cliente '" + nombreUsuario + "' conectado.");
				
				pw.println(" Hola " + nombreUsuario + ". Escribe comandos como (ej: ADD ...). Escribe 'EXIT' para salir.");
				pw.flush();
				
				
				HiloServidor hiloServidor = new HiloServidor(br, pw, this, nombreUsuario);
				hiloServidor.start();
				
				
				listaHilos.put(nombreUsuario, hiloServidor);
				
				
			}
			
			
		}catch(IOException e) {
			
		}
		
		
	}
	
	
	public String agregarMaterial(String id, int cantidad, String descripcion) {
		
	if (listaMateriales.containsKey(id)) {
			
			return "ERROR: El Material '" + id + "' ya existe.";
			
		} else {
			
			Material nuevoMaterial = new Material(cantidad, descripcion);
			
			listaMateriales.put(id, nuevoMaterial);
			
			System.out.println("SERVIDOR: Material añadido -> " + id);
			
			return " Material '" + id + "' añadido correctamente.";
		}
	}
	
	
	
	public String obtenerMaterial(String id) {
		
		Material material = listaMateriales.get(id); 
		
		
		if (material != null) {
			
			return material.toString(); 
			
		} else {
			
			return "ERROR: Material no encontrado.";
			
		}
		
	}
	
	
	
	public String eliminarMaterial(String id) {
		
	if (listaMateriales.remove(id) != null) {
			
			
			System.out.println("SERVIDOR: Material eliminado -> " + id);
			
			return "OK: Material eliminado.";
			
			
		} else {
			
			return "ERROR: Material no encontrado.";
		}
	}
	
	
	
	public String modificarCantidad(String id,int nuevaCantidad) {
		
		if(listaMateriales.containsKey(id)) {
			
			Material materialExistente = listaMateriales.get(id);		
			
			materialExistente.setCantidad(nuevaCantidad);
			
			System.out.println("SERVIDOR: Cantidad de '" + id + "' actualizada a " + nuevaCantidad);
			
			return " Cantidad del material '" + id + "' actualizada.";
			
		}else {
			
			return "ERROR: Material no encontrado.";
			
		}
		
		 
	}
	
	
	public String reservarCantidad(String id,int cantidadAReservar) {
		
		if(listaMateriales.containsKey(id)) {
			
			
			Material materialExistente = listaMateriales.get(id);	
			
			int cantidadActual = materialExistente.getCantidad();
			
			
			
			if(materialExistente.getCantidad() > cantidadAReservar) {
			
				
				int cantidadFinal = cantidadActual - cantidadAReservar;
				
				materialExistente.setCantidad(cantidadFinal);
				
				
				System.out.println("SERVIDOR: Reserva de " + cantidadAReservar + " para '" + id + "'. Stock restante: " + cantidadFinal);
				

					return " Reserva realizada. Stock restante de '" + id + "': " + cantidadFinal;
			
			} else {
				
				
				return "ERROR: No hay suficiente stock de '" + id + "'. (Actual: " + cantidadActual + ", Solicitado: " + cantidadAReservar + ")";
			}
			
		} else {
			
			return "ERROR: Material no encontrado.";
			
		}
		
		 
	}
	
	
	
	public  String expulsarUsuario(String nombreUsuarioAExpulsar) {
		
		HiloServidor hiloAExpulsar = listaHilos.get(nombreUsuarioAExpulsar);
		
		if (hiloAExpulsar != null) {
			
			hiloAExpulsar.desconectar("Has sido expulsado por un administrador.");
			
			return "OK: Usuario '" + nombreUsuarioAExpulsar + "' ha sido expulsado.";
			
		} else {
			return "ERROR: Usuario '" + nombreUsuarioAExpulsar + "' no encontrado.";
		}
	}
	
	
	
	
	
	public synchronized void eliminarUsuario(String nombreUsuario) {
		
		if (nombreUsuario != null) {
			
			listaHilos.remove(nombreUsuario);
			
			System.out.println("SERVIDOR: Usuario '" + nombreUsuario + "' desconectado y eliminado de la lista.");
		
		}
	}
	
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||	
	public static void main(String[] args) {

		(new Servidor()).ejecutar();
		
	}

}
