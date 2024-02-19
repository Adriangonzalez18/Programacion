package DawBankExcepciones;

public class SaldonegativoException extends Exception{

	private static final long serialVersionUID = 1L;
	private double saldo;
		
	public SaldonegativoException(double saldo) {
		super("El saldo es negativo"); 
		this.saldo =  saldo;
	}

}