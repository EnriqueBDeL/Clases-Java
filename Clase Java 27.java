//--------------------------------------------------------------|
//CONTENIDO: Eliminar un Fichero
//--------------------------------------------------------------|
package clase.java.pkg27;

import java.io.File;

public class ClaseJava27 {

   
    public static void main(String[] args) {
        
         File file = new File("Fichero.txt");
         
        if (file.delete()) { // "delete" se utiliza para eliminar un archivo o un directorio del sistema de archivos.
            
            System.out.println("Fichero eliminado: " + file.getName());
            
        } else {
            
            System.out.println("No se pudo eliminar el fichero.");
        }
        
    }
    
}
