
package clase.excepcion;


public class MiRuntimeException extends RuntimeException{ // Al usar "extends RuntimeException" no necesita ser declarada con throws.
     
    public MiRuntimeException(String mensaje) {
        super(mensaje);
    }
}
