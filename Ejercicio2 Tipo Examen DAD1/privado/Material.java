package privado;

public class Material {

	private int cantidad;
	private String descipcion;
	
	
	public Material(int cantidad, String descipcion) {
		this.cantidad = cantidad;
		this.descipcion = descipcion;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getDescipcion() {
		return descipcion;
	}


	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}


	@Override
	public String toString() {
	    return "Material [cantidad=" + cantidad + ", descipcion=" + descipcion + "]";
	}
	
	
	
	
}
