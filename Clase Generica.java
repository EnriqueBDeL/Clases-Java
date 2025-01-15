//--------------------------------------------------------------|
//CONTENIDO: Clase Generica
//--------------------------------------------------------------|
package clase.generica;


public class ClaseGenerica<T> { // "<T>" es una variable que puede trabajar con difrentes tipos de datos sin necesidad de especificar un tipo concreto por adelantado.

     private T contenido; 
    
     
    public ClaseGenerica(T contenido) {
        this.contenido = contenido;
    }
     
      
    public T obtenerContenido() {
        return contenido;
    }
     
      
    public void ponerContenido(T contenido) {
        this.contenido = contenido;
    }
      
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {

        
        ClaseGenerica<Integer> entero = new ClaseGenerica<>(5);
        
        System.out.println(entero.obtenerContenido()); 
        
        
        
        ClaseGenerica<String> string = new ClaseGenerica<>("Hola Mundo");
        
        System.out.println(string.obtenerContenido()); 
        
        
    }
    
}
