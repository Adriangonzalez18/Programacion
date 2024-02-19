package DawBankExcepciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CuentaBancaria {

		private String IBAN;
		private String titular;
		private double saldo;
		
		
		Map<String, String> cuentas = new HashMap<String, String>();
		

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
		 
		 @Override
		public String toString() {
			return " \nIBAN " + IBAN + " \ntitular " + titular + " \nsaldo " + saldo ;
		}

		 public String crearcuenta(String IBAN, String titular) {
			    if (cuentas.containsKey(IBAN)) {
			        System.out.println("El IBAN ya está registrado");
			        return "El IBAN ya está registrado";
			    
			    } else {
			        cuentas.put(IBAN, titular);
			        System.out.println("Cuenta creada con éxito");
			        return "Cuenta creada con éxito";
			    }
			}

		 public boolean eliminarcuenta(String IBAN) {
				
				boolean isRemoved = false;
				if(cuentas.containsKey(IBAN)) {
					cuentas.remove(IBAN);
					isRemoved = true;
					System.out.println("La cuenta se elimino correctamente");
				}
				
				else {
					System.out.println("El IBAN no existe");
				}
				
				return isRemoved;
			}
		 
		 public void VisualizarCuenta(String IBAN) {
			    if (cuentas.containsKey(IBAN)) {
			       
			        String informacionCuenta = cuentas.get(IBAN).toString();
			        System.out.println(informacionCuenta);
			    } else {
			        System.out.println("El IBAN no existe");
			    }
		 }

		 public void realizarIngreso(double cantidad,String IBAN)throws AvisarHaciendaException , CuentaException {
		        try {
		            
		        	 if (cuentas.containsKey(IBAN)) {
					        Set<String> keys = cuentas.keySet();
					        
					        for (String key : keys) {
					            if (key.equals(IBAN)) {
					            	saldo += cantidad;
						            System.out.println("Ingreso realizado con éxito.");
						            AvisarHacienda(cantidad);
						            CuentaException(cantidad);
					                break; 
					            }
					        }
					    } else {
					        System.out.println("El IBAN no existe");
					    }
		            
		 		}catch(AvisarHaciendaException p) {
				p.printStackTrace();
		 		
		 		}catch(CuentaException p) {
				p.printStackTrace();
		 		}
		 }
		   public void realizarRetirada(double cantidad,String IBAN)throws AvisarHaciendaException , CuentaException ,SaldonegativoException {
			   try {	
					  
				   if (cuentas.containsKey(IBAN)) {
				        Set<String> keys = cuentas.keySet();
				        
				        for (String key : keys) {
				            if (key.equals(IBAN)) {
				            	saldo -= cantidad;
								System.out.println("Retirada realizada con éxito.");
								AvisarHacienda(cantidad); 
								CuentaException(cantidad);
								SaldonegativoException(saldo);
				                break; 
				            }
				        }
				    } else {
				        System.out.println("El IBAN no existe");
				    }
				   
					   
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