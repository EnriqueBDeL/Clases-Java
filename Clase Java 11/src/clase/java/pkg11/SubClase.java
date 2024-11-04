
package clase.java.pkg11;


public class SubClase extends ClaseJava11 { //"extends" se utiliza para que una clase herede otra clase.
                                            
                                            //Ahora Subclase tiene todos los metodos y atributos de ClaseJava11
    
  
    void saludarS(){
       
    System.out.println("Hola, soy una subclase.");
   
   }
    
    
    float precio; 
   
    
    
    
    public SubClase(String marca, int velocidad, float precio) {
        
        super(marca, velocidad); //"super" llama al constructor de ClaseJava11
        this.precio = precio;
    }
    
    

        public void mostrarInfoCoche() {
        mostrarInfo();
        System.out.println("Precio del coche: " + precio + "$");
    }
    
}
