package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class HiloServidor extends Thread{

	
	private BufferedReader br = null;
	private PrintWriter pw = null;
	private Servidor servidor = null;
	private String nick = "";
	
	
//..............................................................................................	
	public HiloServidor(BufferedReader br, PrintWriter pw, Servidor servidor, String nick) {
		this.br = br;
		this.pw = pw;
		this.servidor = servidor;
		this.nick = nick;
	}
//..............................................................................................	

	
	
	
	
	public void run() {

		String lineaDeCliente = "";
		
		
		try {
			
			String partes[];
			
			while(!"SALIR".equalsIgnoreCase(lineaDeCliente)) {

				lineaDeCliente = br.readLine();
				
				partes = lineaDeCliente.split(" "); //".split()" divide una cadena de texto en un array (o lista) de sub-cadenas, usando un separador que le indiques (como un espacio " " o una coma ",")
						

				
				
				switch (partes[0]) {
				
				case "MSG": //estructura del comando "MSG NICK MENSAJE"
					
					
					this.servidor.enviarMensajeA(partes[1],this.nick + "*" + lineaDeCliente.substring(partes[1].length() + 5)); 
															//".substring()" es una herramienta de las cadenas de texto (String) que te permite "recortar" y obtener una parte de esa cadena.			
															//"partes[1].length() + 5" es lo mismo que: MSG_NICK_.Por lo que empieza a eliminar desde el ultimo espacio.
					break;
			////////////////////////////////////////////////////////////////////////////////////////////
				case "ADDCANAL": //estructura del comando "ADDCANAL NOMBRE"
					
					
					this.servidor.crearCanal(partes[1]);
					this.servidor.addHiloToCanal(partes[1], this);
					
					
					break;
			////////////////////////////////////////////////////////////////////////////////////////////
				case "SUSCRIBIR": //estructura del comando "SUSCRIBIR NOMBRE"
					
					this.servidor.addHiloToCanal(partes[1], null);
					
					break;
			////////////////////////////////////////////////////////////////////////////////////////////	
				case "MSG2CANAL": //estructura del comando "MSG2CANAL CANAL MENSAJE"
					
					this.servidor.enviarMensajeACanal( partes[1],this.nick + "*" + lineaDeCliente.substring(partes[1].length() + 11));
					break;
			////////////////////////////////////////////////////////////////////////////////////////////
				default:
					
					this.servidor.enviarMensajeATodos(this.nick + "> " + lineaDeCliente);
					
				}
			}	
		}catch(Exception e) {
			
		}
	}
	
	
	
	public void enviaMensajeACliente(String lineaDeCliente) {

		pw.println(lineaDeCliente); //Envío al cliente la cadena recibida
		pw.flush();
		
	}
		


}
