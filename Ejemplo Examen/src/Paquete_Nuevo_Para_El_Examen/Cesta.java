
package Paquete_Nuevo_Para_El_Examen;


import java.util.ArrayList;



public class Cesta {
    
    
    ArrayList<Productos> array = new ArrayList<>();

    
    public Cesta() {
        
    }

    public  void comprarProducto(Productos p){
        array.add(p);
    }

 
    public void mostrarProductos(){
        for(Productos p:array){
            System.out.println("- Nombre: " + p.getNombre_producto() + " | Precio: " + p.getPrecio());
        }
    }
    
    
    public float PrecioCompra(){
    
        float totalPrecio = 0;
        
        for(Productos p:array){
            
            totalPrecio += p.getPrecio();
        }
        
        return totalPrecio; 
        
        
    }
 
    

    
    
}
