//--------------------------------------------------------------|
//CONTENIDO: interface
//--------------------------------------------------------------|
package clase.java.pkg20;

/*

"interface" es una "clase completamente abstracta" que se utiliza para agrupar 
métodos relacionados con cuerpos vacíos.

*/

public class ClaseJava20 implements Interfaz,Interfaz2 { // "implements" se utiliza para acceder a los métodos de la interfaz.
                          // En el caso de que solo haya una interfaz, sería: "...implements Interfaz {" 
    
    
    public void cocheEncendido() {
   
    System.out.println("Brum Brum Brum");
    
    }
    
    
    public void cocheApagado() {
   
    System.out.println("(...)");
    
     }
 
 
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    
    public static void main(String[] args) {
        
        ClaseJava20 coche = new ClaseJava20();
        coche.cocheEncendido();
        coche.cocheApagado();
        
    }
    
}
