package dawbank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;

public class Dawbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserte el IBAN: ");
		String IBAN = reader.nextLine();
		
		System.out.println("Inserte el Titular de la cuenta: ");
		String titular = reader.nextLine();
		
		
		int idmovimiento = 0;
		Tipodemovimiento tmovimiento = null ;
		int cantidad = 0;
		int fecha = 0;
		
		double saldo = 0;
		int movimientos = 0;
		
		
		CuentaBancaria cuenta = new CuentaBancaria(IBAN,titular,saldo,movimientos);
		
		Movimientos movimiento = new Movimientos(idmovimiento,cantidad,tmovimiento,fecha);
		
		
		String [] opciones = {"","1) Datos de la cuenta", "2) IBAN", "3) Titular", "4) Saldo",
		"5) Ingreso","6) Retirada","7) Movimientos","8) Salir"};
	
		String op; 
		do {
			op = mostrarMenu(opciones);
			
			
			if(op.equals("1")){
				
				cuenta.mostrarInfocuneta();
			}
			
			else if(op.equals("2")){
				cuenta.getIBAN();
				System.out.println("El IBAN es " + IBAN );
				
			}
			
			else if(op.equals("3")){
				cuenta.getTitular();
				System.out.println("El titular de la cuenta es " + titular );
				
			}
			
			else if(op.equals("4")){
				
				System.out.println("El titular de la cuenta es " + saldo + "€" );
				
			}	
			
			else if(op.equals("5")){
				
				System.out.println("Inserte el dinero que quieres meter: ");
				Tipodemovimiento tmovimiento1 = Tipodemovimiento.INGRESO;
				double ingreso = reader.nextDouble();
				saldo = saldo + ingreso;
				idmovimiento ++;
			}
			
			else if(op.equals("6")){
				
				System.out.println("Inserte el dinero que quieres retirar: ");
				Tipodemovimiento tmovimiento2 = Tipodemovimiento.RETIRADA;
				double retirada = reader.nextDouble();
				saldo = saldo - retirada;
				idmovimiento ++;
				
			
			}
			
			else if(op.equals("7")){
				
				movimiento.mostrarInfomovimientos();
				
			}
			
			else if(op.equals("8")){
			
				System.out.println("Saliendo del programa. Buen dia.");
			}
			
		}while(!op.equals("8"));
		
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


