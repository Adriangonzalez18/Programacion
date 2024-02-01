
public class PositivoException extends Exception{

	private static final long serialVersionUID = 1L;
	private int numeropositivo;

	public PositivoException(int numeropositivo) {
		super("El numero es positivo"); 
		this.numeropositivo =  numeropositivo;
	}
	
}
