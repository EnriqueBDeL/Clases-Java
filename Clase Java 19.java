//--------------------------------------------------------------|
//CONTENIDO: LinkedList
//--------------------------------------------------------------|
package clase.java.pkg19;

//-----------------------------------------|
import java.util.LinkedList;
//-----------------------------------------|


public class ClaseJava19 {

    
    public static void main(String[] args) {
       
        LinkedList<String> motos = new LinkedList<String>(); 
        
        motos.add("Harley Davidson");
        motos.add("Kawasaki Ninja");
        motos.add("Ducati Panigale");
        motos.add("Yamaha R1");

        System.out.println(motos);
        
//---------------------------------------------------------------------------------------|       
        // Método addFirst() añade un elemento al principio de la lista.
        motos.addFirst("BMW S1000RR");
        System.out.println("\nDespues de anadir al principio: " + motos);
//---------------------------------------------------------------------------------------|


//---------------------------------------------------------------------------------------|
        // Método addLast() añade un elemento al final de la lista (similar a add())
        motos.addLast("Suzuki GSX-R1000");
        System.out.println("\nDespues de anadir al final: " + motos);
//---------------------------------------------------------------------------------------|


//---------------------------------------------------------------------------------------|
        // Método get() bbtiene el elemento en una posición específica
        String motoEnPosicion3 = motos.get(2); // Índice 2 es la tercera moto
        System.out.println("\nMoto en la posicion 3: " + motoEnPosicion3);
//---------------------------------------------------------------------------------------|



//---------------------------------------------------------------------------------------|
        // Método remove() elimina un elemento específico de la lista
        motos.remove("Ducati Panigale");
        System.out.println("\nDespues de eliminar 'Ducati Panigale': " + motos);
//---------------------------------------------------------------------------------------|


//---------------------------------------------------------------------------------------|
        // Método removeFirst() - Elimina el primer elemento
        motos.removeFirst();
        System.out.println("\nDespues de eliminar el primer elemento: " + motos);
//---------------------------------------------------------------------------------------|
        

//---------------------------------------------------------------------------------------|
        // Método removeLast() elimina el último elemento
        motos.removeLast();
        System.out.println("\nDespues de eliminar el ultimo elemento: " + motos);
//---------------------------------------------------------------------------------------|


//---------------------------------------------------------------------------------------|
        // Método peek() obtiene el primer elemento de la lista sin eliminarlo
        String primeraMoto = motos.peek();
        System.out.println("\nPrimer moto en la lista: " + primeraMoto);
//---------------------------------------------------------------------------------------|
        
   
//---------------------------------------------------------------------------------------|
        // Método poll() obtiene y elimina el primer elemento de la lista
        String motoPoll = motos.poll();
        System.out.println("\nMoto obtenida con poll (y eliminada): " + motoPoll);
        System.out.println("\nLista despues de poll: " + motos);
//---------------------------------------------------------------------------------------|



//---------------------------------------------------------------------------------------|
        // Método offer() añade un elemento al final de la lista (similar a add())
        motos.offer("Honda CBR1000RR");
        System.out.println("\nDespues de usar offer() para anadir al final: " + motos);
//---------------------------------------------------------------------------------------|


//---------------------------------------------------------------------------------------|
        // Método contains() verifica si un elemento está en la lista
        boolean contieneMoto = motos.contains("Kawasaki Ninja");
        System.out.println("\nContiene 'Kawasaki Ninja'?: " + contieneMoto);
//---------------------------------------------------------------------------------------|



//---------------------------------------------------------------------------------------|
        // Método size() - Devuelve el tamaño de la lista
        int tamano = motos.size();
        System.out.println("\nTamano de la lista: " + tamano);
//---------------------------------------------------------------------------------------|
     

//---------------------------------------------------------------------------------------|
// Método clear() elimina todos los elementos de la lista
        motos.clear();
        System.out.println("\nLista despues de clear(): " + motos);
//---------------------------------------------------------------------------------------|
        
        
    }   
}
