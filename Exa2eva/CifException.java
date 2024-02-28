
public class CifException extends Exception{

	private static final long serialVersionUID = 1L;
	private String cif;
		
	public CifException(String cif) {
		super("El cif deve ser Letra mayúscula y 10 dígitos"); 
		this.cif =  cif;
	}
}
