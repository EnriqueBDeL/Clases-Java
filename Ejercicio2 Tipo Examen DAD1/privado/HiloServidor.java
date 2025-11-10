package privado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class HiloServidor extends Thread{

	private BufferedReader br;
	private PrintWriter pw;
	private Servidor servidor;
	private Socket socket;
	private String nombreUsuario;
	private boolean salir = false;
	
	
	
	public HiloServidor(BufferedReader br, PrintWriter pw, Socket socket, Servidor servidor, String nombreUsuario) {
		this.br = br;
		this.pw = pw;
		this.socket = socket; 
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
	}
	
	
	public void desconectar(String mensajeAviso) {
	
		try {
			
			if (pw != null) {
				
				pw.println(mensajeAviso);
				pw.flush();
				pw.close();
			}
			if (br != null) br.close();
			if (socket != null && !socket.isClosed()) socket.close();
		} catch (IOException e) {
			
		}
		salir = true; 
	}
	
	public void run() {
		
		String lineaRecibida;
		
		boolean salir = false;
		
		try {
			
			while(!salir && (lineaRecibida = br.readLine()) != null) {
				
				
				System.out.println("Cliente '" + nombreUsuario + "' envió: " + lineaRecibida);
	
				
				String partes[] = lineaRecibida.split("/");
				String comando = partes[0].toUpperCase();
				String respuesta = ""; 
				
				
				switch(comando) {
				
				case "ADD": // ADD/id/cantidad/descripción
					
					
					if (partes.length == 4) {
						
						try {
							
							String id = partes[1];
							int cantidad = Integer.parseInt(partes[2]);
							String descripcion = partes[3];
							
							respuesta = servidor.agregarMaterial(id, cantidad, descripcion);							

							
						} catch (NumberFormatException e) {
							respuesta = "ERROR: la cantidad debe ser un valor entero.";
						}
					} else {
						respuesta = "ERROR: Formato incorrecto. Uso: ADD/id/cantidad/descripción";
					}
					
					break;
					
		//######################################################################################################
					
				case "GET": // GET/id
					
					
					if (partes.length == 2) {
						
						String id = partes[1];

						respuesta = servidor.obtenerMaterial(id);
						
					} else {
						respuesta = "ERROR: Formato incorrecto. Uso: GET/NombreMterial";
					}
					
					break;
		//######################################################################################################
		
				case "REMOVE": // REMOVE/id
					
					if (partes.length == 2) {
					
						String id = partes[1];
						
						respuesta = servidor.eliminarMaterial(id);
					
					}else {
						respuesta = "ERROR: Formato incorrecto. Uso: REMOVE/NombreMterial";
					}
					
					
					
					break;
					
					
				case "SETCANTIDAD": // SETCANTIDAD/id/cantidad
					
					if (partes.length == 3) {
						
						String id = partes[1];
						int nuevaCantidad = Integer.parseInt(partes[2]);
						
						respuesta = servidor.modificarCantidad(id,nuevaCantidad);
					
					}else {
						respuesta = "ERROR: Formato incorrecto. Uso: SETCANTIDAD/id/cantidad";
					}
					
					break;
					
					
				case "ADDRESERVA": // ADDRESERVA/id/cantidad
					
					if (partes.length == 3) {
						
						try { 
							
							
							String id = partes[1];
							
							int cantidadAReservar = Integer.parseInt(partes[2]);
							
							
							respuesta = servidor.reservarCantidad(id, cantidadAReservar);
						
							
						} catch (NumberFormatException e) {
							
							respuesta = "ERROR: La cantidad debe ser un valor entero.";
							
						}
								
					} else {

						respuesta = "ERROR: Formato incorrecto. Uso: ADDRESERVA/id/cantidad"; 
					
					}
					
					break;
					
				
				case "EXIT": //EXIT/id
					
					if (partes.length == 2) {
						String idAExpulsar = partes[1];
						

						if (idAExpulsar.equals(this.nombreUsuario)) {
							
							respuesta = "ERROR: No puedes auto-expulsarte. Usa 'CLOSE'.";
							
						} else {
							
							respuesta = servidor.expulsarUsuario(idAExpulsar);
						}
						
					} else {
						
						respuesta = "ERROR: Formato incorrecto. Uso: EXIT/nombreUsuario";
					}
						
					
					break;
												
					case "CLOSE":
						
						respuesta = "Desconectando...";
						
						salir = true; 
						
						break;
						
					default:
						
						respuesta = "ERROR: Comando '" + comando + "' no reconocido.";
						
						break;
					}
					

				if (respuesta != null && !respuesta.isEmpty()) {
						pw.println(respuesta);
						pw.flush();
					}
				}
				
			}catch(IOException e) {
				if (!salir) {
					System.out.println("Cliente '" + nombreUsuario + "' desconectado (IOException).");
				}
			} finally {
				
				
			
				desconectar("Desconectado."); 
				
				servidor.eliminarUsuario(this.nombreUsuario);
			}
		}
}
	
	

