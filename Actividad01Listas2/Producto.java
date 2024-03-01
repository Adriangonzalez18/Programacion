public class Producto implements Comparable <Producto>{
	
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
    public int compareTo(Producto o) {
        // TODO Auto-generated method stub
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }

	
}