
public class DniException extends Exception{

	private static final long serialVersionUID = 1L;
	private String dni;
		
	public DniException(String dni) {
		super("El Dni deve ser 8 digitos y una letra mayuscula"); 
		this.dni =  dni;
	}
}
