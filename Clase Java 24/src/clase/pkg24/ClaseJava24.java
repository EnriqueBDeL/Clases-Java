//--------------------------------------------------------------|
//CONTENIDO: instanceof
//--------------------------------------------------------------|
package clase.pkg24;


public class ClaseJava24 {

   /*   
    "instanceof" se utiliza para verificar si un objeto es una instancia de una clase específica o de una subclase de esa clase. 
        También se puede usar para verificar si un objeto implementa una interfaz.
  */
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
    
    public static void main(String[] args) {

//Clase

        Clase1 c12 = new Clase2();
        Clase1 c13 = new Clase3();
        
        System.out.println("Clase2 pertenece a Clase2? -> " + (c12 instanceof Clase2));
          System.out.println("Clase2 pertenece a Clase3? -> " + (c12 instanceof Clase3));
             System.out.println("Clase2 pertenece a Clase1? -> " + (c12 instanceof Clase1));
        
        System.out.println();
           
        System.out.println("Clase3 pertenece a Clase2? -> " + (c13 instanceof Clase2));
          System.out.println("Clase3 pertenece a Clase3? -> " + (c13 instanceof Clase3));
             System.out.println("Clase3 pertenece a Clase1? -> " + (c13 instanceof Clase1));
             
             
//-------------------------------------------------------------------------------------------------|         
//        
       System.out.println();
         
       
       Clase1 c = new Clase2();
       
       if(c instanceof Clase2){
           
           System.out.println("Clase2 encontrada.");
           
       }else{
           
           System.out.println("No es la Clase2.");
           
       }
       
//-------------------------------------------------------------------------------------------------|
//Interfaz

        System.out.println();


        Interfaz1 i = new ClaseIn1();
        Interfaz1 i2 = new ClaseIn2();
                
        System.out.println("ClaseIn1 pertenece a ClaseIn1? -> " + (i instanceof ClaseIn1));
            System.out.println("ClaseIn1 pertenece a ClaseIn2? -> " + (i instanceof ClaseIn2));
                System.out.println("ClaseIn1 pertenece a Interfaz1? -> " + (i instanceof Interfaz1));
                
        System.out.println();

        System.out.println("ClaseIn2 pertenece a ClaseIn1? -> " + (i2 instanceof ClaseIn1));
            System.out.println("ClaseIn2 pertenece a ClaseIn2? -> " + (i2 instanceof ClaseIn2));
                System.out.println("ClaseIn2 pertenece a Interfaz1? -> " + (i2 instanceof Interfaz1));




    }
}    
    
   
