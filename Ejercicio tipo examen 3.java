//-------------------------------------------------------------------------------|
//Enunciado: Calcula cuantos dias han pasado desde X hasta hoy.
//-------------------------------------------------------------------------------|
package ejerciciotipoexamen3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Ejerciciotipoexamen3 {

    //En este ejemplo calculamos el tiempo que lleva un producto caducado.
    
    public static void main(String[] args) {

        LocalDate fechaCaducidad = LocalDate.of(2025,01,14);
        
        LocalDate fechaActual = LocalDate.now();
        
        long diasCaducados = ChronoUnit.DAYS.between(fechaCaducidad,fechaActual);
        
        if(diasCaducados > 0){
            
                        System.out.println("El producto lleva " + diasCaducados + " dias caducado.");
            
        }else if(diasCaducados == 0){
                       
            System.out.println("El producto caduca hoy.");
            
        }else{
            
                
           System.out.println("El producto aun no ha caducado. Faltan " + (-diasCaducados) + " dias para que caduque.");

            
        }
        
            

    }
    
}
