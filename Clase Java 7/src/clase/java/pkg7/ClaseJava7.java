
package clase.java.pkg7;


public class ClaseJava7 { //Acceso publico
    
   public String nombre = "Enrique";
   public int edad = 20;
   
   private String coche = "Ford Mustang";

   
   protected String perro = "Michael";
   protected float peso = 23.3f;
   
   
   public String obtenerCoche(){
       return coche;
   }
    
   
   
    public static void main(String[] args) {

        System.out.println("Esto es un modificador de acceso publico.");
        
        
        ClaseJava7 objClase = new ClaseJava7();
        
        System.out.println("\nNombre: " + objClase.nombre);
        System.out.println("Edad: "+objClase.edad);
        
        System.out.println("Coche: " + objClase.obtenerCoche());
        
        System.out.println("Nombre del perro: " + objClase.perro); 
        System.out.println("Peso del perro: " + objClase.peso + " kg"); 
        
        

        PorDefecto objPD = new PorDefecto();

        objPD.mensajePD();
        
        System.out.println("\nNombre en PorDefecto: " + objPD.obtenerNombre2());
        System.out.println("Edad en PorDefecto: " + objPD.obtenerEdad2());
        
        
        
     
    }
    
}
