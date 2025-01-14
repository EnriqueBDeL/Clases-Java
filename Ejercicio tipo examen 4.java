//-------------------------------------------------------------------------------|
//Enunciado: Almacena x, diferenciandose entre si por y.
//-------------------------------------------------------------------------------|
package ejerciciotipoexamen4;

import java.util.HashMap;

// En este caso almacenamos alumnos diferenciados por el DNI.

public class Ejerciciotipoexamen4 {

  
    public static void main(String[] args) {

           HashMap<String,String> alumnos = new HashMap<String,String>();
       
           alumnos.put("234545T", "Ramon"); 
           alumnos.put("745746J", "Mike"); 
           
        System.out.println("\nHashMap de alumnos:");
        for (String key : alumnos.keySet()) {
            System.out.println("DNI: " + key + ", Nombre: " + alumnos.get(key));
        }
           
           
    }
    
}
