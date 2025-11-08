package claseSocket;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;





public class Servidor {
	
	
	
	public static final int PUERTO = 4444;
	
	
	
	
	public void ejecutar() {
		
		ServerSocket serverSocket = null;
		
		try {
			
			
			serverSocket = new ServerSocket(Servidor.PUERTO);
			
			
			while(true) {
			
				
				System.out.println("Esperando conexión...");
				Socket socket = serverSocket.accept();
				
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				
				pw.println("Bienvenido al servidor de DAD1"); 
				pw.flush();
				
				
				
				HiloServidor hiloServidor = new HiloServidor(br, pw); // Crean un nuevo hilo (HiloServidor) para manejar la comunicación (br, pw) de un cliente específico.
				hiloServidor.start();	// Inicia para que se ejecute en paralelo.
				
				
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

	
	
	
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||	
	
	public static void main(String[] args) {
		
		(new Servidor()).ejecutar();
		
	}

}