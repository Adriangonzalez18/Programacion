package DawBankExcepciones;

public class CuentaException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private double saldo;
		
	public CuentaException(double saldo) {
		super("El saldo es negativo"); 
		this.saldo =  saldo;
	}

}
