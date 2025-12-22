package clasermi1.cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;



public class Cliente {
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
	
		System.out.println("=================================");
        System.out.println("    CLIENTE CALCULADORA RMI     ");
        System.out.println("=================================");
		
		
		CalculadoraInt calculadora = (CalculadoraInt)Naming.lookup("rmi://localhost:1010/ServicioCalculadora");
	
		/*
		 
		 	Llamamos al registro (localhost:1010) y preguntamos por "ServicioCalculadora".
        	RMI nos devuelve un "Stub" (un proxy o mando a distancia), NO el objeto real.
        	Hacemos cast (CalculadoraInt) porque 'lookup' devuelve un tipo genérico 'Remote'.
		 
		 */
		
		
		int resultado = calculadora.suma(1, 20);
		
		System.out.println("Resultado:" + resultado);
	}

}
