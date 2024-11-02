
package clase.java.pkg9;


public class ClaseJava9 {

    String nombre; //(*)
    int edad; //(*)
    
    
    public ClaseJava9(String nombre, int edad){//Constructor con dos parametros
        
        this.nombre = nombre; // nombre se refiera a ...ClaseJava9(String nombre...
        this.edad = edad; //edad se refiere a ...String nombre, int edad){...
        
        //  this.nombre se refiera a (*)
        //    this.edad se refiera a (*)
    }
    
    
    public ClaseJava9(String nombre){ //Constructor con un parametro
        this(nombre,19); //Llama al constructor de dos parametros
    }
    
    
    
    public void imprimir_persona(){
        System.out.println("\nNombre: " + this.nombre + " | " + "Edad: " + this.edad);
    }
    
    

    
//------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//------------------------------------------------------------------------------------------------------|
    
    
    public static void main(String[] args) {
        
        ClaseJava9 persona1 = new ClaseJava9("Enrique",20);
        persona1.imprimir_persona();
        
        
        ClaseJava9 persona2 = new ClaseJava9("Luiscar");
        persona2.imprimir_persona();
        
        
    

        
    }
    
}
