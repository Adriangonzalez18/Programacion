package DawBankExcepciones;

public class AvisarHaciendaException extends Exception{

	private static final long serialVersionUID = 1L;
	private double cantidad;
		
	public AvisarHaciendaException(double cantidad) {
		super("AVISO: Notificar a hacienda"); 
		this.cantidad =  cantidad;
	}

}
