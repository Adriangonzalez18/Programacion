
public class NegativoException extends Exception{

	private static final long serialVersionUID = 1L;
	private int numeronegativo;
		
	public NegativoException(int numeronegativo) {
		super("El numero es negativo"); 
		this.numeronegativo =  numeronegativo;
	}
	
}