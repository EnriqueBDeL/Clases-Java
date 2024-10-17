
package clase.java.pkg5;


public class ClaseJava5 { //Esto es una Clase.
    
    
    
    static void methodEstatico(){
        
        System.out.println("\nEsto es un method estatico.");

    }
    
    
    public void methodPublico(){
     
        System.out.println("\nEsto es un method publico.");

        
    }
    
    
    public void velocidad(int v){
        
        System.out.println("La velocidad maxima es: " + v + " Km/h");
        
    }
         
    
    

    public static class Coche{ //Esto es una clase dentro de otra clase.
        
        
        int precio = 2;
        
        final int unidades = 200;
        
        String marca = "Bugatti";
        
        
        static void method_coches(){
        
              System.out.println("\nEsto es un method dentro de una clase.");

        }//Fin clase coche
        
      
        
    }//Fin clase principal
    
 
    public static void main(String[] args) {
      
        //Esto es un Objeto.
      //------------------------------------------|
        Coche myObj = new Coche();
      //------------------------------------------|
        System.out.println(myObj.precio);

        
      
       Coche myObj2 = new Coche();
       myObj2.precio = 44; //Saca el valor de precio y le da el valor 44.
        System.out.println(myObj2.precio);
        
        
      /*
          // ERROR: No puedes modificar una variable que se ha declarado con final.
         
        Coche myObj3 = new Coche();
         myObj3.unidades = 44; //Saca el valor de precio y le da el valor 44.
            System.out.println(myObj3.unidades);
        
        */
      
      System.out.println("\nMarca: " + myObj.marca);
      
      
      Coche.method_coches();
      
      
      methodEstatico();
        
     
      //Un method publico, no se pude usar como un static.
      ClaseJava5 myObjet = new ClaseJava5();
      myObjet.methodPublico();
      myObjet.velocidad(200);
      
    }
    
}
