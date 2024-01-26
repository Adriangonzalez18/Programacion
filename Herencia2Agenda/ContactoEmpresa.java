
public class ContactoEmpresa extends Contacto {
	
	private String paginaweb;

	public ContactoEmpresa(String nombre, String numerotelefono, String paginaweb) {
		super(nombre, numerotelefono);
		this.paginaweb = paginaweb;
	}
	

	public String getPaginaweb() {
		return paginaweb;
	}

	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}

	@Override
	public String toString() {
		return "\nNombre " + nombre +"\nnumero de telefono "+ numerotelefono +"\nPagina web " + paginaweb;
	}
	
	

}
