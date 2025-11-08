package Principal;

import java.io.BufferedReader;
import java.io.IOException;


public class HiloCliente extends Thread{
	
	private BufferedReader br = null;
	
	
//..............................................................................................	
	public HiloCliente(BufferedReader br) {
		
		this.br = br;
				
	}
//..............................................................................................	

	
	
	
	public void run() {
		
		while(true) {
			
			try {
				
				System.out.println(br.readLine());
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
