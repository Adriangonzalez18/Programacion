package DawBankExcepciones;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


	



public class CuentaBancaria {

		private String IBAN;
		private String titular;
		private double saldo;
		
		
		Map<String, String> movimientos = new HashMap<String, String>();
		
		public CuentaBancaria(String IBAN, String titular) {

			this.IBAN = IBAN;
			this.titular = titular;
			this.saldo = 0.0;
		
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
		
		
		 public void mostrarInfocuneta() {
		        System.out.println("IBAN: " + IBAN);
		        System.out.println("Titular: " + titular);
		        System.out.println("Saldo: " + saldo + " euros");
		    }
		 public void realizarIngreso(double cantidad)throws AvisarHaciendaException , CuentaException {
		        try {
		            saldo += cantidad;
		            System.out.println("Ingreso realizado con éxito.");
		            AvisarHacienda(cantidad);
		            CuentaException(saldo);
		            
		 		}catch(AvisarHaciendaException p) {
				System.out.println(p.getMessage());
		 		
		 		}catch(CuentaException p) {
				System.out.println(p.getMessage());
		 		}
		 }
		   public void realizarRetirada(double cantidad)throws AvisarHaciendaException , CuentaException ,CantidadpositivaException {
			   try {	
					   saldo -= cantidad;
					   System.out.println("Retirada realizada con éxito.");
					   AvisarHacienda(cantidad); 
					   CuentaException(saldo);
					   CantidadpositivaException(cantidad);
					   
			  }catch(AvisarHaciendaException p) {
	   				System.out.println(p.getMessage());
			  
			  }catch(CuentaException p) {
	   				System.out.println(p.getMessage());
			 
			  }catch(CantidadpositivaException p) {
				  System.out.println(p.getMessage());
			  } 

		    }
	
		    static void AvisarHacienda(double cantidad) throws AvisarHaciendaException {
				if(cantidad <= 3000) {
				}else {
					throw new AvisarHaciendaException(cantidad);
				}
			}
		    
		    static void CantidadpositivaException(double cantidad) throws CantidadpositivaException {
				if(cantidad >= 0) {
				}else {
					throw new CantidadpositivaException(cantidad);
				}
			}
		    
		    static void CuentaException(double saldo) throws CuentaException {
				if(saldo <= -50) {
				}else {
					throw new CuentaException(saldo);
				}
			}


			
		
}