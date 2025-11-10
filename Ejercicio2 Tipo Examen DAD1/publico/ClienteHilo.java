package publico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteHilo extends Thread {

	private BufferedReader br;
	private PrintWriter pw;
	private Cliente cliente;
	private Socket socket;
	private boolean running = true;
	

	

	
//....................................................................................................    	
	public ClienteHilo(Cliente cliente, Socket socket) {

		
		this.cliente = cliente;
		this.socket = socket;
		
		try {
		this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		this.pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

		 } catch (IOException e) {
			 
	            System.err.println("Error al crear streams en HiloCliente");
	            e.printStackTrace();
	            running = false;
	        }
		
	}
//....................................................................................................    
	
	
	  public void run() {
	    	
	        String mensaje;
	        
	        try {
	        	
	        	
	            while (running && (mensaje = br.readLine()) != null) {
	            	
	                cliente.gestionarMensaje(mensaje);
	                
	            }
	            
	            
	        } catch (IOException e) {
	        	
	            if (running) {
	            	
	                System.out.println("Error de E/S en HiloCliente: " + e.getMessage());
	                
	            }
	            
	        } finally {
	        	
	            running = false;
	            cerrar();
	        }
	    }
	  
	   
	  
	  
	  
	    private void cerrar() {
	    	
	        try {
	        	
	            if (br != null) br.close();
	            if (pw != null) pw.close();
	            
	        } catch (IOException e) {
	        	
	            System.err.println("Error al cerrar streams en HiloCliente");
	            
	        }
	    }

	    
	    
	    public void detener() {
	    	
	        running = false;
	        
	    }
	    
	    
	    
	    public void enviar(String mensaje) {
	    	
	    	
	        if (pw != null) {
	        	
	            pw.println(mensaje);
	            pw.flush();
	        }
	    }
	    

	    
	    
	
}
