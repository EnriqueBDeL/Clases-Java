package privado;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class HiloServidor extends Thread {

	
	
	
	private BufferedReader br;
	private PrintWriter pw;
	private Servidor servidor; 
	private String nombreUsuario;

	
//...............................................................................................................	
	public HiloServidor(BufferedReader br, PrintWriter pw, Servidor servidor, String nombreUsuario) {
		this.br = br;
		this.pw = pw;
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
	}
//...............................................................................................................	

	
	
	@Override
	public void run() {
		
		String lineaRecibida;
		
		boolean salir = false;
		
		
		
		try {

			
			while (!salir && (lineaRecibida = br.readLine()) != null) {
				
				System.out.println("Cliente '" + nombreUsuario + "' envió: " + lineaRecibida);
				

				String[] partes = lineaRecibida.split(" ");
				String comando = partes[0].toUpperCase();
				String respuesta = ""; 


				
				
				
				switch (comando) {
					
					case "ADD": // Formato: ADD [Nombre] [Empresa] [Precio]
						if (partes.length == 4) {
							try {
								String nombre = partes[1];
								String empresa = partes[2];
								double precio = Double.parseDouble(partes[3]);
								

								respuesta = servidor.agregarVideojuego(nombre, empresa, precio);
								
							} catch (NumberFormatException e) {
								respuesta = "ERROR: El precio debe ser un valor numérico.";
							}
						} else {
							respuesta = "ERROR: Formato incorrecto. Uso: ADD NombreJuego Empresa Precio";
						}
						break;
						
					case "GET": // Formato: GET [Nombre]
						if (partes.length == 2) {
							String nombre = partes[1];

							respuesta = servidor.obtenerVideojuego(nombre);
							
						} else {
							respuesta = "ERROR: Formato incorrecto. Uso: GET NombreJuego";
						}
						break;
						
					case "REMOVE": // Formato: REMOVE [Nombre]
						if (partes.length == 2) {
							String nombre = partes[1];

							respuesta = servidor.eliminarVideojuego(nombre);
							
						} else {
							respuesta = "ERROR: Formato incorrecto. Uso: REMOVE NombreJuego";
						}
						break;
						
					case "EXIT":
						respuesta = "Desconectando...";
						salir = true;
						break;
						
					default:
						respuesta = "ERROR: Comando '" + comando + "' no reconocido.";
						break;
				}
				

				pw.println(respuesta);
				pw.flush();
			}
			
		} catch (IOException e) {
			
			System.err.println("Error de E/S con el cliente " + nombreUsuario + ": " + e.getMessage());
			
		} finally {
			
			
			servidor.eliminarCliente(nombreUsuario);
			
			try {
				
				
				if (pw != null) pw.close();
				if (br != null) br.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}