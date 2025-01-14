//-------------------------------------------------------------------------------|
//Enunciado: Crea una lista, añadele contenido y muestra el contendio.
//-------------------------------------------------------------------------------|
package ejerciciotipoexamen2;

import java.util.ArrayList;
import java.util.List;




public class Ejerciciotipoexamen2 {

 
    
   
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        
        lista.add("BMW");
        lista.add("Dugati");
        lista.add("Honda");
        
        System.out.println("\nContenido de la lista:");
        for(String motos : lista){
            
            System.out.println("-" + motos);
            
        }
        
        

        
    }
    
}
