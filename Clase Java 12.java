//--------------------------------------------------------------|
//CONTENIDO: Sentencia equals
//--------------------------------------------------------------|

package clase.java.pkg12;

import java.util.Objects;


public class ClaseJava12 {
    
    private String nombre;
    private int dni;
    private int edad;

    
    public ClaseJava12(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
// Sentencias para el equals  
//----------------------------------------------------------------------|
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClaseJava12 other = (ClaseJava12) obj;
        if (this.edad != other.edad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    

//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------| 
    
    
     public static void main(String[] args) {
     
        ClaseJava12 cj = new ClaseJava12("Pepe",12);
         
        ClaseJava12 cj2 = new ClaseJava12("Pepe",12);

    
        
        System.out.println(cj.equals(cj2)); //Son iguales, por lo que devuelve true
         
        
        
        
        ClaseJava12 cj3 = new ClaseJava12("Jaime",22);
         
        ClaseJava12 cj4 = new ClaseJava12("Carlos",20);
         
             
        System.out.println(cj3.equals(cj4)); //Son distintos, por lo que devuelve false
         
     
     }
     
}

