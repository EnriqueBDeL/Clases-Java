//--------------------------------------------------------------|
//CONTENIDO: Abrir o Crear un Fichero
//--------------------------------------------------------------|
package clase.java.pkg25;

//-----------------------|
import java.io.File; // Representa la información sobre el fichero o directorio.
//-----------------------|

import java.io.IOException;



public class ClaseJava25 {

   
    
    public static void main(String[] args) {

      try {
            File file = new File("Fichero.txt");
            
            if (file.createNewFile()) { // "createNewFile" crear un nuevo archivo vacío en la carpeta pricipal del proyecto.
                
                System.out.println("Fichero creado: " + file.getName()); // "getName" se utiliza para obtener el nombre del archivo o directorio.
                
            } else {
                
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            
            System.out.println("Ocurrió un error.");
            
            e.printStackTrace();
        }
    }
    
}
