package EjemploHiloExtend;

public class EjemploHiloExtend extends Thread {

	 public void run() { // El trabajo que hará el nuevo hilo.
	       
		 
		 System.out.println("El hilo secundario ha comenzado su tarea.");

	       
	        
	        // Simulamos un trabajo que dura 5 segundos, mostrando su progreso.
	    
	        for (int i = 1; i <= 5; i++) {
	           
	        	System.out.println("   -> El hilo secundario está trabajando... Paso " + i + " de 5.");

	            
	            try {

	            	
	            	Thread.sleep(1000); // Hace que un hilo (o proceso) se detenga durante un tiempo determinado.
	            	
	            	//1 segundo = 1000 milisegundos (como es <=5, habrá varios sleep.)
	            	
	            	
	            	
	            } catch (InterruptedException e) {

	            	/*
	            	 * Java te obliga a manejar una posible excepción llamada InterruptedException. 
	            	 * Esto se debe a que, teóricamente, otro hilo podría "despertar" 
	            	 * al hilo que está durmiendo antes de que se cumpla el tiempo.
	            	 */
	            	
	            	e.printStackTrace();
	            	
	            	
	            }
	            
	            
	        }
	        System.out.println("El hilo secundario ha terminado su tarea.");
	    }

	 
	 
//---------------------------------------------------------------------------------------------------------------
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| 
//---------------------------------------------------------------------------------------------------------------
	
	 
	public static void main(String[] args) {

		
		EjemploHiloExtend proceso = new EjemploHiloExtend();
		
        System.out.println("1. El hilo principal (main) está a punto de iniciar el hilo secundario.");

        
        proceso.start(); // Inicia el nuevo hilo. El código de run() empieza a ejecutarse en paralelo.
        
        

        // Este mensaje se imprime INMEDIATAMENTE después de llamar a start(),
        // sin esperar a que el hilo 'proceso' termine su trabajo de 5 segundos.
        System.out.println("2. El hilo principal (main) ya terminó sus instrucciones y no espera a nadie.");
        System.out.println("   (Ahora observa cómo el otro hilo sigue trabajando por su cuenta)");
		
	}

}
