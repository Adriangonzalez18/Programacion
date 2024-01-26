package dawbank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CuentaBancaria {

		private String IBAN;
		private String titular;
		private double saldo;
		private int Movimientos = 0;
		
		private  Movimientos[] movimientos;
		
		public CuentaBancaria(String IBAN, String titular,double saldo, int movimientos) {

			this.IBAN = IBAN;
			this.titular = titular;
			this.saldo = 0.0;
			this.movimientos = new Movimientos[100];
		
		}
		


		public String getIBAN() {
			return IBAN;
		}
		
		public void setIBAN(String IBAN) {
			this.IBAN = IBAN;
		}
		

		public String getTitular() {
			return titular;
		}


		public void setTitular(String titular) {
			this.titular = titular;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(int saldo) {
			this.saldo = saldo;
		}


		public int getNMovimientos() {
			return Movimientos;
		}


		public void setNMovimientos(int nMovimientos) {
			this.Movimientos = nMovimientos;
		}
		
		public boolean registromovimiento(Movimientos movimientos) {
			
			boolean movientosregistrado = false;
			if(Movimientos >= 0)
			{
			
				if(this.Movimientos >= 0 && this.Movimientos < 100);
			{
				
					for(int i = 0; i< this.Movimientos; i++) {
					
					}
				
					if(Movimientos <= 0) {
						Movimientos[movimientos] = movimientos;
						Movimientos ++;
				
					}
			
				else {
					System.out.println("La coleccion esta completa");	
				}
			
			return movientosregistrado;
			}
			
			}
			
		}

		public String mostrarInfocuneta() {
		
		String s = " IBAN " + this.IBAN + " titular " +  titular + " saldo "  + saldo ;
		
		System.out.println(""+ s);

		return s;
		}
}