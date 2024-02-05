
public class GatoException extends Exception{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
		
	public GatoException(String nombre, int edad) {
		super("Los valores introducidos no son validos"); 
		this.nombre =  nombre;
		this.edad = edad;
	}
}
