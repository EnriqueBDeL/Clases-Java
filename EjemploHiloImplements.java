package EjemploHiloImplements;

public class EjemploHiloImplements implements Runnable {

	
	
    @Override
    public void run() {
    	
        System.out.println("El hilo secundario ha comenzado su tarea.");

        
        // Simulamos un trabajo que dura 5 segundos, mostrando su progreso.
        for (int i = 1; i <= 5; i++) {
           
        	System.out.println("   -> El hilo secundario está trabajando... Paso " + i + " de 5.");
            
            
            try {
            	
            	
                Thread.sleep(1000); // El hilo se detiene por 1 segundo en cada paso.

                
                
            } catch (InterruptedException e) {
            	
                e.printStackTrace();
                
            }
            
        }
        
        System.out.println("El hilo secundario ha terminado su tarea.");
    }

    
	
//---------------------------------------------------------------------------------------------------------------
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| 
//---------------------------------------------------------------------------------------------------------------
	  

    public static void main(String[] args) {

    	
        EjemploHiloImplements miTarea = new EjemploHiloImplements();


        Thread proceso = new Thread(miTarea);

        
        System.out.println("1. El hilo principal (main) está a punto de iniciar el hilo secundario.");


        proceso.start();

        System.out.println("2. El hilo principal (main) ya terminó sus instrucciones y no espera a nadie.");
        System.out.println("   (Ahora observa cómo el otro hilo sigue trabajando por su cuenta)");
    }
}