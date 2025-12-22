package clasermi1.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalculadoraImpl extends UnicastRemoteObject implements CalculadoraInt {
	//"extends UnicastRemoteObject" Convierte esta clase normal en un objeto que puede escuchar peticiones de red (TCP)

	
	protected CalculadoraImpl() throws RemoteException {
		super();
	}


	private static final long serialVersionUID = 12323234234L;

	
	
	@Override
	public int suma(int operando1, int operando2) throws RemoteException {
		return operando1 + operando2;
	}
	
}
