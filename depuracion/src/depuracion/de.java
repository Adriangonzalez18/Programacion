package depuracion;

import java.util.Scanner;


public class de {


		public static void main(String[] args) {
			Scanner reader = new Scanner(System.in);

			
			
			//Ej 1
			/*
					System.out.println("");
					System.out.println("Ejercicio 1");
					System.out.println("");
					
					int billete500 = 0,billete200 = 0,billete100 = 0,billete50 = 0,billete20 = 0,billete10 = 0,billete5 = 0;
					
			        System.out.print("Introduce el dinero: ");
			        int dinero = reader.nextInt();
		
			     
			    	do {  
			    	
			    		
			    	if (dinero % 5 == 0) 
			    		
			    		if (dinero >= 500) {
				        	
				        	dinero = dinero - 500 ; 
				        	
				        	billete500 ++;
				        }
				        	
				        else if (dinero >= 200) {
				        	
				        	dinero = dinero - 200 ;
				        	
				            billete200 ++;
				        }       
				                
				        else if (dinero >= 100) {
				        	
				        	dinero = dinero - 100 ;
				        	
				            billete100 ++;
				        }
				        
				        else  if (dinero >= 50) {
				        	
				        	dinero = dinero - 50 ;
				        	
				            billete50 ++;
				        }
				       
				        else if (dinero >= 20) {
				        	
				        	dinero = dinero - 20 ;
				        	
				            billete20 ++;
				        }
				        
				        else if (dinero >= 10) {
				        	
				        	dinero = dinero - 10 ;
				        	
				            billete10 ++;
				        }
				        
				        else if (dinero >= 5) {
				        	
				        	dinero = dinero - 5 ;
				        	
				            billete5 ++;
				        }
				        
			    	else 
			        	System.out.print("es erroneo");
			        	
			       
			    	
			        
			    	} while (dinero != 0 );
			        
			        System.out.println("Necesitas");
			        System.out.println("de 500: " + billete500);
			        System.out.println("de 200: " + billete200);
			        System.out.println("de 100: " + billete100);
			        System.out.println("de 50: " + billete50);
			        System.out.println("de 20: " + billete20);
			        System.out.println("de 10: " + billete10);
			        System.out.println("de 5: " + billete5);
			       
			        */
			        //Ejercicio 2
			        System.out.println("");
			        System.out.println("ejercicio 2");
			        System.out.println("");
						
			        double num1 = 0,num2 = 0,num3 = 0,resultado = 0;
					
			        do {
			        
			        	System.out.println("introduce un numero");
						num1 = reader.nextInt();
						
						System.out.println("introduce otro numero");
						num2 = reader.nextInt();
						
						System.out.println("");
						
						System.out.println("1. sumar ");
						
						System.out.println("2. restar ");
						
						System.out.println("3. multiplicar ");
						
						System.out.println("4. dividir ");
						
						System.out.println("5. salir ");
						
						System.out.println("Dime lo que quieres hacer");
						num3 = reader.nextInt();
						
						
						if (num3 == 1){
							 resultado = num1 + num2 ;
						}
						else if (num3 == 2) {
							 resultado = num1 - num2 ;
						}
						else if (num3 == 3) {
							resultado = num1 * num2;
						}
						else if (num3 == 4) {
							resultado = num1 / num2;
						}
						
						System.out.println("" + resultado);
						
						} while (num3 != 5);
							
						
					
					
					
			
		}
		

	}
	
	
	

