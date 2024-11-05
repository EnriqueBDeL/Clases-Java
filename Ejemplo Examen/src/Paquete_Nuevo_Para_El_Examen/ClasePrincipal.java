
package Paquete_Nuevo_Para_El_Examen;


public class ClasePrincipal {
    
        public static void main(String[] args) {
        
        Productos p1 = new Veganos("Platano",234, 10);
        Productos p2 = new Vegetarianos("Huevos",345, 2);
        Productos p3 = new Frescos("Galletas",453, 7);
        
        Cesta lista = new Cesta();
        
        lista.comprarProducto(p1);
        lista.comprarProducto(p2);
        lista.comprarProducto(p3);
        
       
        lista.mostrarProductos();     
        
        
        System.out.println("\nPrecio final de la compra: " + lista.PrecioCompra() + "$");
        
    }
    
}
