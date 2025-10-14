package Clase2JavaDad1;

/*
 * El hilo se puede ejecutar pasando una instancia de la clase al 
 * Thread constructor de un objeto y luego llamando al start()método del hilo
 */


/*
 * La principal diferencia es que cuando una clase 'extiende' la clase "Thread", 
 * no se puede extender ninguna otra clase, pero al 'implementar' la interfaz "Runnable", 
 * es posible extender desde otra clase también
 */


public class Clase2JavaDad1 implements Runnable{

	
	@Override
	public void run() { //Este metodo es obligatorio colocarlo
		
		System.out.println("Hilo ejecutandose....");
		
	}
	
	
	public static void main(String[] args) {

		Clase2JavaDad1 proceso = new Clase2JavaDad1(); // Define que es lo que va a hacer.
		
		Thread h = new Thread(proceso); // Define quien lo hace.
		
		System.out.println("Codigo fuera del hilo...");
		
		h.start(); // "h" comienza a trabajar el "proceso".
		
		
		
		
		
	}

	


}
