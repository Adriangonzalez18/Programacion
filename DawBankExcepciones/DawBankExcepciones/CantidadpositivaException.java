package DawBankExcepciones;

public class CantidadpositivaException extends Exception{

	private static final long serialVersionUID = 1L;
	private double cantidad;
		
	public CantidadpositivaException(double cantidad) {
		super("La cantidad debe ser un numero positivo"); 
		this.cantidad =  cantidad;
	}

}