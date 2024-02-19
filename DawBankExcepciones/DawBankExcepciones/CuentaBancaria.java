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
		 
		 public boolean registrarCuenta(String IBAN, String titular ) {
			 boolean cuentacreada = false;
			 
			 CuentaBancaria nuevaCuenta = new CuentaBancaria(IBAN, titular);
			 movimientos.put(nuevaCuenta.getIBAN(),titular);
			 
			 
			return cuentacreada;
		 }
		 
		 public void realizarIngreso(double cantidad)throws AvisarHaciendaException , CuentaException {
		        try {
		            saldo += cantidad;
		            System.out.println("Ingreso realizado con éxito.");
		            AvisarHacienda(cantidad);
		            CuentaException(cantidad);
		            
		 		}catch(AvisarHaciendaException p) {
				p.printStackTrace();
		 		
		 		}catch(CuentaException p) {
				p.printStackTrace();
		 		}
		 }
		   public void realizarRetirada(double cantidad)throws AvisarHaciendaException , CuentaException ,SaldonegativoException {
			   try {	
					   saldo -= cantidad;
					   System.out.println("Retirada realizada con éxito.");
					   AvisarHacienda(cantidad); 
					   CuentaException(cantidad);
					   SaldonegativoException(saldo);
					   
			   }catch(AvisarHaciendaException p) {
					p.printStackTrace();
			  
			  }catch(CuentaException p) {
	   				p.printStackTrace();
	   				
			  }catch(SaldonegativoException p) {
				  	p.printStackTrace();
			  } 

		    }
	
		    static void AvisarHacienda(double cantidad) throws AvisarHaciendaException {
				if(cantidad <= 2999) {
				}else {
					throw new AvisarHaciendaException(cantidad);
				}
			}
		    
		    static void CuentaException(double cantidad) throws CuentaException {
				if(cantidad >= 1) {
				}else {
					throw new CuentaException(cantidad);
				}
			}
		    
		    static void SaldonegativoException(double saldo) throws SaldonegativoException {
				if(saldo >= -50) {
				}else {
					throw new SaldonegativoException(saldo);
				}
			}


			
		
}