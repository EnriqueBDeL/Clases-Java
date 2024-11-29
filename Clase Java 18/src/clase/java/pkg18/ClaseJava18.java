//--------------------------------------------------------------|
//CONTENIDO: clase abstracta
//--------------------------------------------------------------|

package clase.java.pkg18;



public class ClaseJava18 extends ClaseAbstracta {

      public ClaseJava18(String nombre) {
        super(nombre);
    }
    
  
    @Override
    public void hacerSonido() {
        System.out.println(nombreAnimal + " dice: Guau!");
    }
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
  
public static void main(String[] args) {
       
        ClaseJava18 perro = new ClaseJava18("Bolt");

    
        perro.comer();
        perro.hacerSonido();
        
    
}

   

  
    
}
