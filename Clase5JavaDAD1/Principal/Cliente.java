package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {	
	
	
	
	
	public void ejecutar() {
		
		try {
			
			System.out.println("Abrir conexión con el servidor...");
			Socket socket = new Socket("127.0.0.1", Servidor.PUERTO);
			

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			
			
			HiloCliente hiloCliente = new HiloCliente(br);
			hiloCliente.start();
			

			
			System.out.println("Recibido: " + br.readLine());
			

			
			Scanner teclado = new Scanner(System.in);
			String lineaTeclado = "";
			
			
			lineaTeclado = teclado.nextLine();
			
			
			pw.println(lineaTeclado); 
			pw.flush();
			
			
			
			do{

				System.out.println(""); lineaTeclado = teclado.nextLine();
				
				
				pw.println(lineaTeclado); 
				pw.flush();
				
				//Muestro por consola la cadena/texto que me envía el servidor
				//System.out.println("Respuesta servidor: " + br.readLine());
				
				
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
