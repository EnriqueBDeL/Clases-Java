//--------------------------------------------------------------|
//CONTENIDO: Set
//--------------------------------------------------------------|
package clase.set;

//-----------------------|
import java.util.HashSet;
//-----------------------|

//-----------------------|
import java.util.Set;
//-----------------------|

public class ClaseSet {


//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>(); // Es una interfaz que define el comportamiento que todas sus implementaciones deben seguir.
                                                // No puedes crear instancias de Set directament, por lo que utiliza una clase como HashSet.
                                                // Devido a esto, Set funcionara exactamente igual que la clase que le siga.
                                                
                                                //En este caso funcionará igual que el HashSet.
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);

        System.out.println("Set (sin orden): " + numeros);

        
                System.out.println();

        
        if (numeros.contains(2)) {   // Verificar si contiene un elemento.

            System.out.println("Set contiene el numero 2.");
            
        }
        
                System.out.println();

        
        
        numeros.remove(1); // Eliminar un elemento.
        
        System.out.println("Despues de eliminar 1: " + numeros);
        
        
                System.out.println();

        
        
        System.out.println("Tamano del Set: " + numeros.size());

          
        
                System.out.println();
        
        
        numeros.clear(); // elimina todos los elementos.
        
        System.out.println("Set despues del vaciado: " + numeros);
        
               
                System.out.println();
                
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
                        
        System.out.println("Contenido del Set");
        for(int numero : numeros){
              System.out.println(">" + numero);
        }
        
    }
    
}
