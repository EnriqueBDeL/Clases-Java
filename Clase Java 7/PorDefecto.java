
package clase.java.pkg7;


 class PorDefecto { //Acceso por defecto
    
       
    private String nombre2 = "Jose";
    private int edad2 = 23;
     
    
    
    public void mensajePD() {
        System.out.println("\nEsto es un modificador de acceso por defecto.");
    }
       
       
    public String obtenerNombre2() {
        return nombre2;
    }

    public int obtenerEdad2() {
        return edad2;
    }
     
}
