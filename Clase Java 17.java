//--------------------------------------------------------------|
//CONTENIDO: clone()
//--------------------------------------------------------------|

package clase.java.pkg17;


public class ClaseJava17 implements Cloneable {

    //"implements Cloneable" indica que esa clase da permiso explícito 
    // para que sus objetos puedan ser clonados usando el método clone().
    
    private String nombre;
    private int edad;

    
    public ClaseJava17(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
// Método clone --------------------------------------------------|
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
//-----------------------------------------------------------------|

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    // Método toString
    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
  
    public static void main(String[] args) {
        
        try { // Contiene el bloque de código que puede generar una excepción.
            
            
            // Crear un objeto Persona
            ClaseJava17 persona1 = new ClaseJava17("Ana", 25);
            // Clonar el objeto
            ClaseJava17 persona2 = (ClaseJava17) persona1.clone();

            
            // Mostrar los objetos
            System.out.println(">Persona original: " + persona1);
            System.out.println(">Persona clonada: " + persona2);

            // Modificar la persona clonada
            persona2.setNombre("Carlos");
            persona2.setEdad(30);

            System.out.println("\nDespus de modificar la persona clonada:");
            System.out.println(">Persona original: " + persona1);
            System.out.println(">Persona clonada: " + persona2);

        } catch (CloneNotSupportedException e) { // Maneja la excepción que se lanzó dentro del bloque "try".
            
        //"CloneNotSupportedException" excepción comprobada que se lanza cuando un objeto intenta usar el método clone() 
        // pero no implementa la interfaz Cloneable.
            
            e.printStackTrace(); // Imprime un informe del error.
        }
    }
}