//--------------------------------------------------------------|
//CONTENIDO: Sentencia scanner
//--------------------------------------------------------------|
package clase.java.pkg13;


//-----------------------|
import java.util.Scanner; //Para utilizar el scanner es necesario importar esta clase
//-----------------------|


public class ClaseJava13 {

     
    
    
 
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------| 

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in); 
        
        System.out.printf("Introduce tu nombre: ");
        String nombre = sc.nextLine(); //Lee lo que escriba el usuario.
                                       //"nextLine()" se utiliza para leer Strings
        
        System.out.println("\nHola " + nombre + ", como estas?\n");
        
    //------------------------------------------------------------------------------------|
    //Leer enteros
    
        System.out.printf("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        System.out.println("\nTienes "+ edad + " anos.\n" );
        
    //------------------------------------------------------------------------------------|
    //Leer float 
    
       System.out.printf("Introduce tu peso: ");
       float peso = sc.nextFloat();
    
        System.out.println("\nPesas "+ peso + " kg.\n" );
       
        
    //------------------------------------------------------------------------------------|
    //Leer double
    
        System.out.printf("Introduce tu altura: ");
        double altura = sc.nextDouble();
    
        System.out.println("\nAltura "+ altura + " m.\n" );
    
    
        
    //------------------------------------------------------------------------------------|
    //Otros
    
    //"nextBoolean()" <-- Lee booleanos
    
    //"nextByte()"   <-- Lee bytes
    
    //"nextLong()"  <-- Lee datos tipo long
    
    //"nextShort()" <-- Lee datos tipo short
        
        
        
    }
    
}
