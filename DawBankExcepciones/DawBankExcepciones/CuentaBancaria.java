package DawBankExcepciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class CuentaBancaria {

		private String IBAN;
		private String titular;
		private double saldo;
		private int Movimientos;
		private int contadorMovimientos;
		
		private  Movimientos[] movimientos;
		
		public CuentaBancaria(String IBAN, String titular) {

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
		
		public int getcontadorMovimientos() {
			return contadorMovimientos;
		}


		public void setcontadorMovimientos(int contadorMovimientos) {
			this.contadorMovimientos = contadorMovimientos;
		}
		
		
		 public void mostrarInfocuneta() {
		        System.out.println("IBAN: " + IBAN);
		        System.out.println("Titular: " + titular);
		        System.out.println("Saldo: " + saldo + " euros");
		    }
		 public void realizarIngreso(double cantidad)throws AvisarHaciendaException {
		        try {
		            saldo += cantidad;
		            System.out.println("Ingreso realizado con éxito.");
		            AvisarHacienda(cantidad);
		            CantidadpositivaException(cantidad);
		            
		 		}catch(AvisarHaciendaException p) {
				System.out.println(p.getMessage());
		 		
		 		}catch(CantidadpositivaException p) {
				System.out.println(p.getMessage());
		 		}
		 }
		   public void realizarRetirada(double cantidad) {
			   try {
				   if (cantidad > 0) {
						
					   System.out.println("Retirada realizada con éxito.");
					   AvisarHacienda(cantidad); 
					   CuentaException(cantidad);
		        } else {
		            System.out.println("Error: La cantidad debe ser mayor que cero.");
		        }
			  }catch(AvisarHaciendaException p) {
	   				System.out.println(p.getMessage());
			  
			  }catch(CuentaException p) {
	   				System.out.println(p.getMessage());
			  }

		    }
		    public void mostrarMovimientos() {
		        System.out.println("Historial de movimientos:");
		        for (int i = 0; i < contadorMovimientos; i++) {
		            movimientos[i].toString();
		          
		        }
		    }
		    private void registrarMovimiento(String tmovimiento, double cantidad) {
		        if (contadorMovimientos < 100) {
		            movimientos[contadorMovimientos++] = new Movimientos(tmovimiento,cantidad);
		        } else {
		            System.out.println("Error: Límite de movimientos alcanzado.");
		        }
		    }
		    static void AvisarHacienda(double cantidad) throws AvisarHaciendaException {
				if(cantidad <= 3000) {
				}else {
					throw new AvisarHaciendaException(cantidad);
				}
			}
		    
		    static void CuentaException(double cantidad) throws CuentaException {
				if(cantidad <= -50) {
				}else {
					throw new CuentaException(cantidad);
				}
			}
		    
		    static void CantidadpositivaException(double cantidad) throws CantidadpositivaException {
				if(cantidad <= 0) {
				}else {
					throw new CantidadpositivaException(cantidad);
				}
			}
		
}