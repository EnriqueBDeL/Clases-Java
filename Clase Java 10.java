//--------------------------------------------------------------|
//CONTENIDO: Clase Genérica, Autoboxing y Sentencias try-catch 
//--------------------------------------------------------------|
package clase.java.pkg10;

import java.util.ArrayList;// Importar la clase ArrayList


public class ClaseJava10<E> { // E es una clase generica, la cual puede operar con cualquier tipo de dato.
//public class ClaseJava10<E, B>{  //Se pueden declarar mas de una clase generica. 
    
    
    private E dato;
    
    
    public ClaseJava10(E dato){
        this.dato = dato;
    }
    
      public E darValor() {
        return dato;
    }
    
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------| 

    public static void main(String[] args) {
        
        
//Clase Genérica &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  
        ClaseJava10<String> obj = new ClaseJava10<>("Hola");
        
       System.out.println("Valor almacenado en E es: " + obj.darValor());
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&  
   


// Autoboxing %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
 
       ArrayList<Integer> listaNumeros = new ArrayList<>(); //Crea una instancia que almacena objetos tipo Integer (entero).
        // <clase_envolvente>
       
       /* Lista de nombres de las clases envolventes: 
       
            -Integer
            -Byte
            -Short
            -Long
            -Float
            -Double
            -Character
            -Boolean
       
       */
        listaNumeros.add(10); 
        listaNumeros.add(20); 
        listaNumeros.add(30);
        
        System.out.println("\nLista de numeros enteros:");
        
        
        for (Integer numero : listaNumeros) {
            
            System.out.println(numero);
            
        }
//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
      

//Sentencias try-catch ..............................................................................................    
        try { // Contiene el código que puede causar una excepción.
            
            int numerador = 10;
            int denominador = 0;
            int resultado = numerador / denominador;
          
            System.out.println("\nEl resultado es: " + resultado);
            
        } catch (ArithmeticException e) { // Se ejecuta si se lanza una excepción en el bloque "try".
            
            System.out.println("\nERROR: No se puede dividir por cero.");
            
            // Una excepción en programación es un evento que ocurre durante la ejecución de un programa 
            // que interrumpe el flujo normal de instrucciones.
        }
 //..................................................................................................................       
    
 
  
        
        
    }
    
}
