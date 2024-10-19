
package clase.java.pkg6;


public class ClaseJava6 {
    
    int numero;
    
    int n = 10;
    int y;
    
    String nombre;
    
    String nombre_gato;

    
    public ClaseJava6(String w, String p, String g){ //Esto es un Constructor.
        
        numero = 23;
        
        y = n;
        
        nombre = w;
        
        String nombre_perro = p; //Lo que se declare dentro, solo se puede utilizar en el constructor.
        
        nombre_gato = g;
    
           System.out.println("Su perro se llamaba: " + nombre_perro);
        
        /*
        
        Constructor: No tiene un tipo de retorno (int, String, void, etc), ni siquiera void. 
        Esto lo diferencia de los métodos. No puede devolver valores.
        
        */
    }
    
    

 
    
    public static void main(String[] args) {
        
        ClaseJava6 miObjeto = new ClaseJava6("Marta","Canela","Polimedia");
        System.out.println(miObjeto.numero);
        
        
        System.out.println(miObjeto.y);
        
        
        System.out.println("Su nombre era: " + miObjeto.nombre);
        
            System.out.println("El nombre de su gato era: " + miObjeto.nombre_gato);
        
       


    }
    
}
