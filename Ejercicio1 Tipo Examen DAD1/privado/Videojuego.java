package privado;

public class Videojuego {

	private String nombre;
	private String empresa;
	private double precio;
	
	
	public Videojuego(String nombre, String empresa, double precio) {
		super();
		this.nombre = nombre;
		this.empresa = empresa;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return String.format("Videojuego: '%s' (de %s) - %.2f€", 
				 nombre, 
				 empresa, 
				 precio);
	}
	
	
	
	
}

