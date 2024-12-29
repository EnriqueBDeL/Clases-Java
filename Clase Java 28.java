//--------------------------------------------------------------|
//CONTENIDO: Leer desde un Fichero
//--------------------------------------------------------------|
package clase.java.pkg28;


import java.io.File;

//------------------------------------|
import java.io.FileNotFoundException;// Permite que el programa maneje excepciones relacionadas con la ausencia de un archivo.
//------------------------------------|

//------------------------|
import java.util.Scanner;// Permite analizar y leer entradas de texto desde varias fuentes.
//------------------------|


public class ClaseJava28 {

  
    public static void main(String[] args) {
        
         try {
             
            File file = new File("Fichero.txt");
            
            Scanner scanner = new Scanner(file); // "scanner" se utiliza para leer datos de diversas fuentes.
            
            while (scanner.hasNextLine()) { // "hasNextLine" se utiliza para verificar si hay una línea completa de entrada disponible para ser leída.
                
                String data = scanner.nextLine(); // "nextLine" se utiliza para leer una línea completa de texto.
                
                System.out.println(data);
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            
            System.out.println("El fichero no fue encontrado.");
            
            e.printStackTrace();
        }
        
        
    }
    
}
