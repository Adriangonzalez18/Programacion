
public class Producto {
	
	private String codigo;
	private String Nombre;
	private int Cantidad;
	private double Precio;
	
	/**
	 * @param codigo
	 * @param nombre
	 * @param cantidad
	 * @param precio
	 */
	public Producto(String codigo, String nombre, int cantidad, double precio) {
		
		this.codigo = codigo;
		Nombre = nombre;
		Cantidad = cantidad;
		Precio = precio;
	}

public Producto(String codigo) {
		
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return " codigo " + codigo + ", Nombre " + Nombre + ", Cantidad " + Cantidad + ", Precio " + Precio;
	}
	
	

}
