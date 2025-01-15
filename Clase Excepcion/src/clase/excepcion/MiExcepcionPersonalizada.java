
package clase.excepcion;


public class MiExcepcionPersonalizada extends Exception { // Al usar "extends Exception" requiere que los métodos declaren que lanzan esta excepción (usando throw). 
    
    public MiExcepcionPersonalizada(String mensaje) {
        super(mensaje); // Llama al constructor de la clase base
    }
    
}
