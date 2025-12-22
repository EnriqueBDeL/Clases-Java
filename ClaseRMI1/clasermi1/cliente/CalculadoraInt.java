package clasermi1.cliente;

import java.rmi.RemoteException;

public interface CalculadoraInt extends java.rmi.Remote{

	public int suma(int operando1, int operando2) throws RemoteException;
	
}
