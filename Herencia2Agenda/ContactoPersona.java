
public class ContactoPersona extends Contacto{

	private String cumpleanos;

	public ContactoPersona(String nombre, String numerotelefono, String cumpleanos) {
		super(nombre, numerotelefono);
		this.cumpleanos = cumpleanos;
	}


	public String getCumpleanos() {
		return cumpleanos;
	}



	public void setCumpleanos(String cumpleanos) {
		this.cumpleanos = cumpleanos;
	}



	@Override
	public String toString() {
		return "\nNombre " + nombre +"\nnumero de telefono "+ numerotelefono + "\nCumpleaños " + cumpleanos ;
	}
	
}
