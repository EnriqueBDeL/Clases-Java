//--------------------------------------------------------------|
//CONTENIDO: throws
//--------------------------------------------------------------|
package clase.java.pkg21;



public class ClaseJava21 {

    
     static void comprobarEdad(int edad) throws ArithmeticException {
                                        //"ArithmeticException" Se lanza cuando ocurre un error aritmético.
        if (edad < 18) {
            
            throw new ArithmeticException("Tienes menos de 18 anos.");
            
        } else {
            
            System.out.println("Cumples con la edad minima!");
        }
    }
     
    /*
     
     LISTA DE EXCEPCIONES EN JAVA:
     
     - "NullPointerException" Se lanza cuando intentas acceder a un objeto o método a través de una referencia que es null.
     
     - "ArrayIndexOutOfBoundsException" Se lanza cuando intentas acceder a una posición de un array que está fuera de sus límites.
     
     - "ClassCastException" Se lanza cuando intentas convertir un objeto a una clase incompatible.
     
     - "NumberFormatException" Se lanza cuando intentas convertir una cadena a un número, pero la cadena no es un formato válido.
     
     - "IllegalArgumentException" Se lanza cuando un método recibe un argumento inapropiado o no válido.

     - "IllegalStateException"  Se lanza cuando el estado de un objeto no permite la operación solicitada.
     
     - "IndexOutOfBoundsException" Se lanza cuando intentas acceder a una posición inválida en listas, strings, o arrays.
     
     - "IOException" Se lanza cuando ocurre un error durante una operación de entrada/salida, como leer o escribir un archivo. 
     
     - "FileNotFoundException" Subclase de IOException, se lanza cuando no se puede encontrar un archivo que se intenta abrir.
     
     - "InterruptedException" Se lanza cuando un hilo que está en espera es interrumpido.
     
     - "RuntimeException" Clase base para excepciones que pueden ocurrir durante la ejecución y no necesitan ser declaradas explícitamente.
     
     - "StackOverflowError" No es una excepción, sino un error que ocurre cuando el programa excede el límite del stack, generalmente debido a recursión infinita.
     
     - "OutOfMemoryError"  Error que se lanza cuando la JVM no puede asignar más memoria.
     
     - "SecurityException" Se lanza cuando una operación viola restricciones de seguridad.
     
     */
  

//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------|
  
    public static void main(String[] args) {

       comprobarEdad(24); // Permite seguir ejecutando el codigo.
  
     //comprobarEdad(16); // Detendrá la ejecución aquí.
      
    }
    
    
    
}
