import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CuentaBancaria {

		private String IBAN;
		private String titular;
		private int saldo;
		private int movimientos;
		
		private  Movimiento[] coleccion;
		
		public CuentaBancaria(String IBAN, String titular, int saldo, int movimientos ) {

			this.setIBAN(IBAN);
			this.titular = titular;
			this.saldo = saldo;
			this.movimientos = movimientos;
			this.coleccion = new Movimiento[this.movimientos];
		
		}
		
		
		public CuentaBancaria(int movimientos) 
		{
			
			this.movimientos = movimientos;
			this.coleccion = new Movimiento[this.movimientos];
		
		}

		
		public String getIBAN() {
			return IBAN;
		}
		
		private boolean setIBAN(String IBAN) {
			this.IBAN = IBAN;
			return true;
		}
		
		private boolean IBANValidator(String IBAN){
			
			boolean isFormatOk = false;
			String regex = "^(?:IBAN[A-Z]{2}[0-9]{22}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(IBAN);
			if(matcher.matches())
			{
				this.IBAN = IBAN;
				isFormatOk = true;
			}

			return isFormatOk;
		}

		public String getTitular() {
			return titular;
		}


		public void setTitular(String titular) {
			this.titular = titular;
		}


		public int getSaldo() {
			return saldo;
		}


		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}


		public int getMovimientos() {
			return movimientos;
		}


		public void setMovimientos(int movimientos) {
			this.movimientos = movimientos;
		}
		

		public String mostrarInfo() {
		
		String s = "IBAN" + this.IBAN + "titular" +  titular + "saldo" + saldo + "movimientos" + movimientos;

		return s;
		}
}
