//--------------------------------------------------------------------|
//Enunciado: Compara el nombre de dos personas que des de alta
//--------------------------------------------------------------------|
package ejerciciotipoexamen;


public class Ejerciciotipoexamen {

    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public static void main(String[] args) {
        
        Ejerciciotipoexamen persona1 = new Ejerciciotipoexamen();
        Ejerciciotipoexamen persona2 = new Ejerciciotipoexamen();
        
        
        persona1.setNombre("Enrique");
        System.out.println("La persona uno se llama: " + persona1.nombre);
        persona2.setNombre("Jorge");
        System.out.println("La persona dos se llama: " + persona2.nombre);

        System.out.println();
                
        if(persona1.nombre.equals(persona2.nombre)){
            
            System.out.println("Los dos nombres son iguales.");
            
        }else{
            
            System.out.println("Los dos nombres son diferentes.");
            
        }

        
    }
    
}
