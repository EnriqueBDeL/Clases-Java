package claseSocket;



//-----------------------------|
import java.io.BufferedReader;	//Lee texto de un flujo de caracteres de forma eficiente, permitiendo leer líneas enteras (readLine()).
//-----------------------------|
import java.io.IOException;	
//---------------------------------|
import java.io.InputStreamReader;	//Convierte un flujo de bytes (como los de red) en un flujo de caracteres (texto).
//---------------------------------|
//---------------------------------|
import java.io.OutputStreamWriter;	//Convierte un flujo de caracteres (texto) en un flujo de bytes para enviarlos (p.ej. por red).
//---------------------------------|
//---------------------------|
import java.io.PrintWriter;	//Permite escribir texto formateado (con 'println' o 'printf') fácilmente en un flujo de salida.
//---------------------------|
//----------------------------|
import java.net.ServerSocket;	//Representa un "puerto abierto" en un servidor, esperando a que los clientes se conecten.
//----------------------------|
//---------------------|
import java.net.Socket;	//Representa la conexión (el "cable" virtual) entre un cliente y un servidor.
//---------------------|



public class Servidor {
	
	
	public static final int PUERTO = 4444;
	
	
	
	public void ejecutar() {
	
		ServerSocket serverSocket = null;
	
		
		try {
		
			
			serverSocket = new ServerSocket(Servidor.PUERTO); //Crea e inicializa el ServerSocket para que empiece a escuchar conexiones de clientes en el puerto especificado por Servidor.PUERTO
			
		
			System.out.println("Esperando conexión...");
			
			
			Socket socket = serverSocket.accept(); //Pausa el programa y espera hasta que un cliente se conecte. Cuando lo hace, acepta la conexión y la devuelve como un objeto Socket
			
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			
			pw.println("Bienvenido al servidor de DAD1"); 
			pw.flush();
			

			String lineaDeCliente = "";
						
			
			
			
			while(!"SALIR".equalsIgnoreCase(lineaDeCliente)) {

			
				lineaDeCliente = br.readLine(); //Lee del socket (buffer) la cadena enviada por el cliente y la guardo en la variable anterior

			
				
				System.out.println("Línea recibida de cliente: " + lineaDeCliente ); 
				
				
				pw.println(lineaDeCliente); //Envío al cliente la cadena recibida
				pw.flush();
				
			}
			
			
			System.out.println("Fin de servidor");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			if (serverSocket != null)
				try {
					
					serverSocket.close(); // Cierra el ServerSocket, dejando de escuchar peticiones y liberando el puerto que estaba ocupando.
					
				} catch (IOException e) {	
					
					e.printStackTrace();
				}
		}
		
	}

	
	
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
	
	public static void main(String[] args) {
		
		(new Servidor()).ejecutar();
		
	}

}
