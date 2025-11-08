
package claseSocket;


//-----------------------------|
import java.io.BufferedReader;	//Lee texto de un flujo de caracteres (como un InputStreamReader) de forma eficiente, almacenando datos en un búfer para leer líneas enteras a la vez (con readLine()).
//-----------------------------|
import java.io.IOException;
//---------------------------------|
import java.io.InputStreamReader;	//Lee bytes de un flujo (como un archivo) y los decodifica en caracteres.
//---------------------------------|
//---------------------------------|
import java.io.OutputStreamWriter;	//Toma caracteres (texto) y los codifica en bytes para escribirlos en un flujo.
//---------------------------------|
//---------------------------|
import java.io.PrintWriter;	//Añade métodos útiles (como println y printf) para escribir texto formateado fácilmente.
//---------------------------|
//----------------------------|
import java.net.ServerSocket;	//Se usa en un servidor para escuchar y aceptar conexiones entrantes de clientes en un puerto.
//----------------------------|
//---------------------|
import java.net.Socket;	//Representa el extremo de una conexión de red (TCP) entre un cliente y un servidor para enviar datos.
//---------------------|
import java.util.Scanner;






public class Cliente {	
	
	
	
	public void ejecutar() {
		
		
		try {
			
			
			System.out.println("Abrir conexión con el servidor...");
			Socket socket = new Socket("127.0.0.1", 4444); //crea un Socket de cliente e intenta conectarse a un servidor en la dirección "IP 127.0.0.1" (localhost) y en el número de puerto definido por "Servidor.PUERTO"
			

			
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Crea un lector (br) optimizado para recibir y leer texto (línea por línea) que llega desde el socket.
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));//Crea un escritor (pw) fácil de usar para enviar texto hacia el socket.
			

		
			
			System.out.println("Recibido: " + br.readLine()); //Leemos el mensaje de bienvenida del servidor

			
			Scanner teclado = new Scanner(System.in);
			String lineaTeclado = "";
			
			
			do{

				System.out.print("Introduce texto:" ); 
				lineaTeclado = teclado.nextLine();
				
				
				pw.println(lineaTeclado); //Envío al servidor la cadena que me han pasado por teclado.
				pw.flush(); //limpia(vacía) el búfer enviando todo lo que tenga pendiente al destino (el socket) en ese preciso momento.

				
				System.out.println("Respuesta servidor: " + br.readLine()); //Muestro por consola la cadena/texto que me envía el servidor.

				
			}while(!"SALIR".equalsIgnoreCase(lineaTeclado));
			
			System.out.println("Fin de cliente");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
		
		}
		
	}

	
	
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||	
	
	public static void main(String[] args) {
		
		(new Cliente()).ejecutar();
		
	}

}
