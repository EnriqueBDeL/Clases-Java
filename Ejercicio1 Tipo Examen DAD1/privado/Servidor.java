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
	
	
	public static final int PUERTO = 4444;
	
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%		
	private Hashtable<String, HiloServidor> listaHilos = new Hashtable<String, HiloServidor>(); 
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
	
	
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
	private Hashtable<String,Videojuego> listaVideojuegos = new Hashtable<String,Videojuego>();
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
	
	
	
	
	
	public void ejecutar() {
		
		ServerSocket serverSocket = null;
		
		try {
			
			
			serverSocket = new ServerSocket(Servidor.PUERTO);
			System.out.println("SERVIDOR escuchando en el puerto " + PUERTO + "...");
			
			while(true){
				
				System.out.println("Esperando conexión...");
				Socket socket = serverSocket.accept();
				
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter( new OutputStreamWriter(socket.getOutputStream()));

				
				pw.println("Bienvenido al servidor EB. Introduce tu nombre de usuario:");
				pw.flush();
				
		
				String nombreUsuario = br.readLine();
				
				System.out.println("Cliente '" + nombreUsuario + "' conectado.");
				
				pw.println(" Hola " + nombreUsuario + ". Escribe comandos como (ej: ADD ...). Escribe 'EXIT' para salir.");
				pw.flush();
				
				
				
			//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
				
				HiloServidor hiloServidor = new HiloServidor(br, pw, this, nombreUsuario);
				hiloServidor.start();
				
				listaHilos.put(nombreUsuario, hiloServidor);
				
			//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
				
				
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
	
	
	
	
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
	public String agregarVideojuego(String nombre, String empresa, double precio) {
	
		
		if (listaVideojuegos.containsKey(nombre)) {
			
			return "ERROR: El videojuego '" + nombre + "' ya existe.";
			
		} else {
			
			Videojuego nuevoJuego = new Videojuego(nombre, empresa, precio);
			
			listaVideojuegos.put(nombre, nuevoJuego);
			
			System.out.println("SERVIDOR: Juego añadido -> " + nombre);
			
			return "OK: Videojuego '" + nombre + "' añadido correctamente.";
		}
	}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

	
	
	
	
	
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$		
	public String obtenerVideojuego(String nombre) {
		
		Videojuego juego = listaVideojuegos.get(nombre);
		
		
		if (juego != null) {
			
			return juego.toString(); 
			
		} else {
			
			return "ERROR: Videojuego no encontrado.";
			
		}
	}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	
	

	
	

//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$		
	public String eliminarVideojuego(String nombre) {
		
		
		
		if (listaVideojuegos.remove(nombre) != null) {
			
			
			System.out.println("SERVIDOR: Juego eliminado -> " + nombre);
			
			return "OK: Videojuego eliminado.";
			
			
		} else {
			
			return "ERROR: Videojuego no encontrado.";
		}
	}
//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$	

	
	
	
	
	

	
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
	public void eliminarCliente(String nombreUsuario) {
		
		if (listaHilos.remove(nombreUsuario) != null) {
			
			System.out.println("SERVIDOR: Cliente '" + nombreUsuario + "' desconectado y eliminado de la lista.");
		
		}
	}
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%	
	
	
	
	
	
	
// ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	
	public static void main(String[] args) {
		(new Servidor()).ejecutar();
	}

}
