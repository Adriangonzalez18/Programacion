
public class Producto implements Comparable{
	
	String nombre;
	int cantidad;
	
	public Producto(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
	@Override
	public String toString() {
		return " Nombre del producto " + nombre + " cantidad " + cantidad ;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Producto p = (Producto)o; 
		return this.nombre.compareTo(p.getNombre());
	}

	
}
