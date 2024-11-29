
package clase.java.pkg18;


 abstract class ClaseAbstracta { // "abstract" Se utiliza para definir comportamientos genéricos o comunes
                                 //  que pueden ser compartidos por varias subclases.

    // "abstract" ->  será accesible solo dentro del mismo paquete.
    // "public abstract" -> es accesible desde cualquier clase en cualquier paquete (siempre que la clase que lo contiene sea también pública).
     
     String nombreAnimal;


     public ClaseAbstracta(String nombre) {
        this.nombreAnimal = nombre;
    }

    public void comer() {
        System.out.println(nombreAnimal + " esta comiendo.");
    }
    
    public abstract void hacerSonido();
 }
