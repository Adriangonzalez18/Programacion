import java.io.Serializable;

public class Libro implements Serializable{

	private String ISBN;
	private String Titulo;
	private String Autor;
	private String FechaPublicacion;
	/**
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param fechaPublicacion
	 */
	public Libro(String iSBN, String titulo, String autor, String fechaPublicacion) {
		super();
		ISBN = iSBN;
		Titulo = titulo;
		Autor = autor;
		FechaPublicacion = fechaPublicacion;
	}
	
	public Libro(String iSBN) {
		super();
		ISBN = iSBN;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getFechaPublicacion() {
		return FechaPublicacion;
	}
	public void setFechaPublicacion(String fechaPublicacion) {
		FechaPublicacion = fechaPublicacion;
	}
	@Override
	public String toString() {
		return " /nISBN " + ISBN + "/nTitulo " + Titulo + " /nAutor " + Autor + " /nFechaPublicacion "
				+ FechaPublicacion ;
	}
	
	
	
	
}
