//--------------------------------------------------------------|
//CONTENIDO: Exception y RuntimeException
//--------------------------------------------------------------|
package clase.excepcion;


public class Main {

    
    
    public static void metodoQueLanzaExcepcion(boolean error) throws MiExcepcionPersonalizada {
        
          if (error) {
              
            throw new MiExcepcionPersonalizada("Error con Exception = true");
        }
    }
//------------------------------------------------------------------------------------------------------|
    
      public static void metodoQueLanzaRuntime(boolean error) {
      
          if (error) {
              
            throw new MiRuntimeException("Error con RuntimeException = true");
        }
    }  
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {

        try {
              
            metodoQueLanzaExcepcion(true); // Prueba a cambiar el "true" por un "false".
            
        } catch (MiExcepcionPersonalizada e) {
            
            System.out.println("Excepcion atrapada: " + e.getMessage());
        }
//------------------------------------------------------------------------------------------------------|       
       
    try {
            metodoQueLanzaRuntime(true);
            
        } catch (MiRuntimeException e) {
            
            System.out.println("Excepcion atrapada: " + e.getMessage());
        }
    

    }
    
}
