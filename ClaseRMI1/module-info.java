/**
 * 
 */
/**
 * 
 */
module ClaseRMI1 {	//Establece una frontera de encapsulamiento fuerte. A diferencia de los JARs tradicionales (donde todo era visible para todos en el classpath), 
					//en un módulo, todo el código interno es privado por defecto. Ninguna clase dentro de este módulo puede ser accedida desde fuera a menos que se autorice explícitamente.
	
	requires java.rmi;	//Establece una dependencia de lectura hacia otro módulo. En este caso permite que las clases dentro de ClaseRMI1 importen y utilicen tipos públicos exportados por el módulo java.rmi, 
						//como: java.rmi.Remote, java.rmi.server.UnicastRemoteObject y java.rmi.registry.LocateRegistry
	
	exports clasermi1.servidor to java.rmi;
	
	/*
	 
	 "exports clasermi1.servidor": Rompe el encapsulamiento fuerte para el paquete "clasermi1.servidor". Hace que los tipos públicos (como tu clase CalculadoraImpl) dentro de este paquete sean visibles y accesibles para otros módulos.
	 
	 "to java.rmi": Convierte la exportación en una Exportación Cualificada.Solo permito que el módulo java.rmi acceda a este paquete. Para cualquier otro módulo del sistema, el paquete "clasermi1.servidor" sigue siendo invisible y privado.
	 
	 */
	
}