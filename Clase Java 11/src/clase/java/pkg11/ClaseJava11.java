//--------------------------------------------------------------|
//CONTENIDO: Herencia
//--------------------------------------------------------------|
package clase.java.pkg11;


public class ClaseJava11 {

    
    
    void saludarC(){
       
    System.out.println("Hola, soy una clase.");
   
   }
    
    
    String marca;
    int velocidad;

    
    
    public ClaseJava11(String marca, int velocidad) { //Constructor al que llama "super".
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
    
    
    public void mostrarInfo() {
        System.out.println("\nMarca: " + marca + " | Velocidad: " + velocidad + " km/h");
    }
 
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------| 
    
    public static void main(String[] args) {

        
        ClaseJava11 saludoC = new ClaseJava11("Ford", 150);
        
        saludoC.saludarC();
        
        
        
        SubClase salu2 = new SubClase("p",2,1f);
        
        salu2.saludarS();
        
        
        
        SubClase coche = new SubClase("Toyota", 200, 4566);

        coche.mostrarInfoCoche();
    }
    
}
