package ClaseJavaDad1;


/*
 * 
 * Los hilos son una herramienta en Java que permiten que un programa funcione de manera más eficiente
 * al realizar varias cosas al mismo tiempo.
 * 
 * Se pueden utilizar para realizar tareas complicadas en segundo plano sin interrumpir el programa principal.
 * 
 */



public class ClaseJavaDAD1 extends Thread{

/*
 * 
 * "extends Thread" nos presta todos los metodos de la clase "Thread".
 * 	
 */
	

	
	public void run() { //Es un método que contiene el código que quieres que ese hilo ejecute.
		
		System.out.println("Hilo ejecutandose....");
		
	}
	
	
	
	public static void main(String[] args) {

		
		ClaseJavaDAD1 proceso = new ClaseJavaDAD1();
		
		// hilo1.run(); [ERROR] No crea un nuevo hilo. Simplemente ejecuta el código del método run() 
		//              como si fuera un método normal, dentro del hilo principal de tu programa
		
		System.out.println("Codigo fuera del hilo...");

		
		proceso.start(); //Inicia un nuevo hilo de ejecución y llama a run() dentro de él.
		
	}

}
