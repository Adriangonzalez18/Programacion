public class Contacto {
	
	private String nombre;
	private String numerotelefono;
	

	public Contacto(String nombre, String numerotelefono) {
		this.nombre = nombre;
		this.numerotelefono = numerotelefono;
	}
	
	public Contacto(String nombre) {
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumerotelefono() {
		return numerotelefono;
	}

	public void setNumerotelefono(String numerotelefono) {
		this.numerotelefono = numerotelefono;
	}

	@Override
	public String toString() {
		return "\nNombre " + nombre + "\nnumero de telefono " + numerotelefono ;
	}
	
	
}
