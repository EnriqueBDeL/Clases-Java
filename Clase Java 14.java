//--------------------------------------------------------------|
//CONTENIDO: fechas en Java
//--------------------------------------------------------------|
package clase.java.pkg14;



//-------------------------|
import java.time.LocalDate; //Necesaria para utilizar la fecha actual del sistema.
//-------------------------|

//-------------------------|
import java.time.LocalTime; //Necesaria para utilizar la hora actual del sistema.
//-------------------------|

//------------------------------|
import java.time.LocalDateTime;   //Necesaria para utilizar la fehca y la hora actual del sistema.
//------------------------------|

//-----------------------------------------|
import java.time.format.DateTimeFormatter;  //Necesaria para quitar la T en el "LocalDateTime".
//-----------------------------------------|

public class ClaseJava14 {

 
    
    
    
    
    
    
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|  
    
    public static void main(String[] args) {
        
    //-------------------------------------------|
    //Fecha actual
     
        LocalDate ld = LocalDate.now();
        System.out.println("\nFecha actual: "+ld);
        
        
        
    //-------------------------------------------|   
    //Hora actual
    
    
        LocalTime lt = LocalTime.now();
        System.out.println("\nHora actual: "+lt);
    
        
    //-------------------------------------------|   
    //Fecha y Hora actual   
        
    
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("\nFecha y Hora actual: "+ldt);
    
        
    //La T que se imprime, es un sepradador entre la fehca y la hora.
        
    //Eliminar la T
    
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //Establece el nuevo formato
        
        String nuevoFormato = ldt.format(dtf);
        
        System.out.println("\nFecha y Hora con nuevo formato: " + nuevoFormato);
    
        
    //Otros formatos para "ofPattern()":
    
    // "yyyy-MM-dd"
    
    // "dd/MM/yyyy"
    
    // "dd-MMM-yyyy"
    
    // "E, MMM dd yyyy"
        
        
    }
    
}
