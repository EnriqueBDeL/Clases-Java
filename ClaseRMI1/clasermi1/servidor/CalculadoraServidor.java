package clasermi1.servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServidor {
	
	
	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		System.out.println("=================================");
        System.out.println("    SERVIDOR CALCULADORA RMI     ");
        System.out.println("=================================");
		
		LocateRegistry.createRegistry(1010); 	//Inicia el "Listín Telefónico" (RMI Registry) en el puerto 1010.
		
		CalculadoraInt calculadora = new CalculadoraImpl();
		
		Naming.rebind("rmi://localhost:1010/ServicioCalculadora", calculadora); 	//Le asignamos un nombre público ("ServicioCalculadora") a nuestro objeto.
																					
		//Estructura URL: Protocolo :// Máquina : Puerto / Nombre
		
		System.out.println("Servidor listo y esperando...");
		
	}

	
	
}
