
package Paquete_Nuevo_Para_El_Examen;


public class Productos {
    
    protected String fecha_caducidad;
    protected int numero_lote;
    protected String nombre_producto;
    protected float precio;
    
    protected final int codigo_unico; // es unico
    protected static int totalProductos = 0; //no se puede modificar

    
    
    public int getCodigo_unico() {
        return codigo_unico;
    }

    public static int getTotalProductos() {
        return totalProductos;
    }
    
    
    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public int getNumero_lote() {
        return numero_lote;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public float getPrecio() {
        return precio;
    }
//---------------------------------------------------------------------|
    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static void setTotalProductos(int totalProductos) {
        Productos.totalProductos = totalProductos;
    }
 //---------------------------------------------------------------------|  

    public Productos(String nombre_producto, float precio, int codigo_unico) {
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.codigo_unico = codigo_unico;
    }
    
    
}
