package DawBankExcepciones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DawBank {
	

	public static void main(String[] args) throws AvisarHaciendaException {
		// TODO Auto-generated method stub
		

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserte el IBAN: ");
		String IBAN = reader.nextLine();
		
		System.out.println("Inserte el Titular de la cuenta: ");
		String titular = reader.nextLine();
		
	
		CuentaBancaria cuenta = new CuentaBancaria(IBAN,titular);
		
		
		
		String [] opciones = {"","1) Datos de la cuenta", "2) IBAN", "3) Titular", "4) Saldo",
		"5) Ingreso","6) Retirada","7) Movimientos","8) Salir"};
	
		String op; 
		do {
			op = mostrarMenu(opciones);
			
			
			if(op.equals("1")){
				
				cuenta.mostrarInfocuneta();
			}
			
			else if(op.equals("2")){
				
                System.out.println("IBAN: " + cuenta.getIBAN());

			}
			
			else if(op.equals("3")){
				System.out.println("Titular: " + cuenta.getTitular());	
				
			}
			
			else if(op.equals("4")){
				
				System.out.println("Saldo: " + cuenta.getSaldo() + " euros");
				
			}	
			
			else if(op.equals("5")){
				
				System.out.println("Inserte el dinero que quieres meter: ");
				double cantidadI = reader.nextDouble();
				cuenta.realizarIngreso(cantidadI);
			}
			
			else if(op.equals("6")){
				
				System.out.println("Inserte el dinero que quieres retirar: ");
				double cantidadR= reader.nextDouble();
                cuenta.realizarRetirada(cantidadR);
			}
			
			else if(op.equals("7")){
				
				cuenta.mostrarMovimientos();
				
			}
			
			else if(op.equals("8")){
			
				System.out.println("Saliendo del programa. Buen dia.");
			}
			
		}while(!op.equals("8"));
		
	}	
	
	
	public static boolean IBANValidator(String IBAN) {
	    boolean isFormatOk = false;
	    String regex = "^([A-Z]{2}[0-9]{22})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(IBAN);
	    if (matcher.matches()) {
	        isFormatOk = true;
	    }
	    return isFormatOk;
	}
		public static String mostrarMenu(String [] opciones)
		{
			System.out.println("Seleccione la opcion deseada");
			Scanner reader = new Scanner(System.in);
			for(String opcion : opciones)
			{
				System.out.println(opcion);
			}
			
			return reader.nextLine();	
		}
		
		
	
}
