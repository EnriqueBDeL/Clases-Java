package claseSocket;


import java.io.BufferedReader;
import java.io.PrintWriter;


public class HiloServidor extends Thread{

	
	private BufferedReader br = null;
	
	private PrintWriter pw = null;
	

	
	
//................................................................
	public HiloServidor(BufferedReader br, PrintWriter pw) {
		this.br = br;
		this.pw = pw;
	}
//................................................................
	
	
	
	public void run() {

		String lineaDeCliente = "";
		
		try {
			
			while(!"SALIR".equalsIgnoreCase(lineaDeCliente)) {

				lineaDeCliente = br.readLine();
				System.out.println("Línea recibida de cliente: " + lineaDeCliente ); 
				
				pw.println(lineaDeCliente); 
				pw.flush();
				
			}
			
		}catch(Exception e) {
			
		}
	}

	
	
	
}
