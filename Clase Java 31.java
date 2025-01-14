//--------------------------------------------------------------|
//CONTENIDO: HashSet
//--------------------------------------------------------------|
package clasejava31;

//------------------------|
import java.util.HashSet;
//------------------------|




//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
public class Clasejava31 {

   
    public static void main(String[] args) {

        HashSet<String> frutas = new HashSet<>(); // Es una colección de elementos donde cada elemento es único.

        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Naranja");
        frutas.add("Manzana"); // Los elementos que se agreguen mas de una vez, solo aparecera una vez.
        
        System.out.println("Contenido del HashSet: " + frutas);
        
               
                System.out.println();

        
        if (frutas.contains("Platano")) {   // Verificar si contiene un elemento.

            System.out.println("El HashSet contiene Platano.");
            
        }
        
                System.out.println();

        
        
        frutas.remove("Naranja"); // Eliminar un elemento.
        
        System.out.println("Despues de eliminar Naranja: " + frutas);
        
        
                System.out.println();

        
        
        System.out.println("Tamano del HashSet: " + frutas.size());

          
        
                System.out.println();
        
        
        frutas.clear(); // elimina todos los elementos.
        
        System.out.println("HashSet despues del vaciado: " + frutas);
        
               
                System.out.println();
                
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Naranja");
                        
        System.out.println("Contenido del HashSet");
        for(String fruta : frutas){
              System.out.println("-" + fruta);
        }
                     

    }
    
}
