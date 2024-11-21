//--------------------------------------------------------------|
//CONTENIDO: HashMap y Map
//--------------------------------------------------------------|
package clase.java.pkg16;



//-----------------------------------------|
import java.util.HashMap;
//-----------------------------------------|

//-----------------------------------------|
import java.util.Map;
//-----------------------------------------|





public class ClaseJava16 {

    
    
    
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        
        Map<String, Integer> alumno = new HashMap<>(); //Un mapa tiene clave unica (no se puede repetir) y un valor (puede repetirse).
        //  CLAVE    VALOR
        
        
        alumno.put("Enrique", 20); //Nombre = CLAVE | Edad = VALOR
        alumno.put("Jose", 30);
        alumno.put("Rodrigo", 23);
        alumno.put("Laura", 22);
        
        System.out.println("Edad de Rodrigo: " + alumno.get("Rodrigo"));// "get" obtiene el valor a partir de la clave.
        
        System.out.println();
        
        System.out.println("Luis esta en el mapa? " + alumno.containsKey("Luis")); // "containsKey" verificar si una "clave" existe.
        
        System.out.println("Jose esta en el mapa? " + alumno.containsKey("Jose"));
        
        System.out.println();
        
        System.out.println("Alguien tiene 22 anos? " + alumno.containsValue(22)); // "containsValue" verificar si un "valor" existe.
        System.out.println("Alguien tiene 18 anos? " + alumno.containsValue(18));
        
        System.out.println();
         
        
        System.out.println("Mapa:");
        for (Map.Entry<String, Integer> entrada : alumno.entrySet()) {
       
            // "Map.Entry<String, Integer> entrada" representa una clave-valor en el mapa.
            // "alumno.entrySet()" devuelve un conjunto que contiene todas las entradas (claves-valores del mapa).
            
            System.out.println("-Nombre: " + entrada.getKey() + "| Edad: " + entrada.getValue());
        } //                                       obtener CLAVE                   obtener VALOR
        
        
        System.out.println();
        
        alumno.remove("Jose"); // Elimina CLAVE, por lo tanto se elimina el elemento del Mapa.
        System.out.println("Mapa despues de eliminar a Jose: " + alumno);     
                 
         
        System.out.println();
        
        
        
        

        
    }
    
}
