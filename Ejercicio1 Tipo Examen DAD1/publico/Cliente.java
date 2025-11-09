package publico;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Cliente {

   
	public static final int PUERTO_SERVER = 4444;
   
	private static String IP_SERVIDOR = "localhost";


    private Socket socket;
    
    private HiloCliente hiloCliente;

    
    
    
    public void ejecutar() {

        try {
            
        	System.out.println("Abrir conexión con el servidor...");
            socket = new Socket(IP_SERVIDOR, PUERTO_SERVER);

            hiloCliente = new HiloCliente(socket, this);
            hiloCliente.start();

            String mensaje;
            Scanner s = new Scanner(System.in);

       
            while (!(mensaje = s.nextLine()).equalsIgnoreCase("exit")) {
            	
                hiloCliente.enviar(mensaje);
                
            }

            hiloCliente.enviar("EXIT");

            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (hiloCliente != null) {
                hiloCliente.detener();
            }
            try {
                if (socket != null && !socket.isClosed()) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Conexión con el servidor cerrada.");
        }
    }

    
    
    
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&    
    public void gestionarMensaje(String mensaje) {
    	
        System.out.println("SERVIDOR: " + mensaje);
        
    }
 //&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&    

    
    
    
    
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    
    public static void main(String[] args) {
    	
        (new Cliente()).ejecutar();
        
    }
}