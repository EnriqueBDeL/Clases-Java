
package clase.java.pkg8;

//NO ES NECESARIO IMPORTAR LAS CLASES QUE PERTENECEN AL MISMO PAQUETE.


import clase.java.pkg8.paquete1.Clase1; // Importa la clase del paquete
//COMENTARIO: import nombre_del_paquete.nombre_de_la_clase;

//import clase.java.pkg8.paquete1.*;   // Importa el paquete completo
//COMENTARIO: import nombre_del_paquete.*;


enum NombreMarca{ //Enumeracion
    Bugatti,Ford ,Tesla,Jeep;
}

public class ClaseJava8 {

     NombreMarca nombremarca;
     String nombre;
     float precio;
    
    
    public ClaseJava8(NombreMarca nombremarca, String nombre, float precio) {
        
        this.nombremarca = nombremarca;
        this.nombre = nombre;             
        this.precio = precio;             
        
    }
    
    
    public void Informacion() {
        System.out.println("-Marca: " + nombremarca +" | " + "Nombre: " + nombre + " | " +  " Precio: " + precio);
    }
    
    
    
 
    public static void main(String[] args) {
      
        // Crear instancias de ClaseJava8 con datos para diferentes coches
        ClaseJava8 coche1 = new ClaseJava8(NombreMarca.Bugatti, "Bugatti Veyron", 2500000f);
        ClaseJava8 coche2 = new ClaseJava8(NombreMarca.Ford, "Ford Mustang", 55000f);
        ClaseJava8 coche3 = new ClaseJava8(NombreMarca.Tesla, "Tesla Model S", 79990f);
        ClaseJava8 coche4 = new ClaseJava8(NombreMarca.Jeep, "Jeep Wrangler", 30000f);
        
        
         
        System.out.println("Coches disponibles:");
        coche1.Informacion();
        coche2.Informacion();
        coche3.Informacion();
        coche4.Informacion();
        
          
        System.out.println("\nMarcas disponibles: ");
        for (NombreMarca nombremarca : NombreMarca.values()) { // ":" se utiliza para recorrer "enum".
            System.out.println("-" + nombremarca);
        }
      
    }
    
}
