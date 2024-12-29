//--------------------------------------------------------------|
//CONTENIDO: Escribir en un Fichero
//--------------------------------------------------------------|
package clase.java.pkg26;

//------------------------|
import java.io.FileWriter;// Permite escribir en fichero.
//------------------------|

import java.io.IOException;

public class ClaseJava26 {

  
    public static void main(String[] args) {
    
        try {
           
            FileWriter writer = new FileWriter("Fichero.txt"); // "FileWriter" se utiliza para escribir datos en un archivo.
                                                               // Si el archivo ya existe, su contenido será eliminado.
           
            writer.write("Hola."); // "write" se utiliza para escribir datos en un archivo.
            writer.write("Este es un texto dentro del fichero.");
            
            writer.write("\n\n\n");
            
            writer.write("Hola.\n");
            writer.write("Este es un texto dentro del fichero.");
           
            
            writer.close(); // "close" cierra el flujo y asegura que todos los datos se guarden.
            System.out.println("Texto escrito correctamente.");
       
        } catch (IOException e) {
          
            System.out.println("Ocurrió un error al escribir en el fichero.");
           
            e.printStackTrace();
        
        }
    }
    
}
