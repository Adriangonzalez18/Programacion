package DawBankExcepciones;

public class CuentaException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private double cantidad;
		
	public CuentaException(double cantidad) {
		super("El saldo es negativo"); 
		this.cantidad =  cantidad;
	}

}
