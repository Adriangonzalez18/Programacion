package DawBankExcepciones;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.DateFormatter;

public class DawBank {
	

	public static void main(String[] args) throws AvisarHaciendaException, CuentaException, SaldonegativoException {
		// TODO Auto-generated method stub
		
		
		
		Scanner reader = new Scanner(System.in);
		
		
		CuentaBancaria nuevaCuenta = new CuentaBancaria();
		
		System.out.println("");
		String [] opciones = {"1) Registrar cliente","2) Registrar cuenta","3) Datos de la persona","4) Datos de la cuenta", "5) Saldo",
		"6) Ingreso","7) Retirada","8) Eliminar cliente","9) Eliminar cuenta","10) Salir"};
	
		String op; 
		do {
			op = mostrarMenu(opciones);
			
			
			if(op.equals("1")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el nombre del Titular: ");
				String nombre = reader.nextLine();
				
				System.out.println("Inserte el DNI del Titular: ");
				String dni = reader.nextLine();
				
				System.out.println("Inserte la fecha de nacimiento del Titular: ejemplo 01/01/2024 ");
				String fechacumple = reader.nextLine();
				
				System.out.println("Inserte el telefono del Titular ");
				String telefono = reader.nextLine();
				
				System.out.println("Inserte el email del Titular ");
				String email = reader.nextLine();
				
				System.out.println("Inserte la direccion del Titular ");
				String direccion = reader.nextLine();
				
				DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				LocalDate fechanacimiento = LocalDate.parse(fechacumple,fmt);
				
				Cliente nuevoCliente = new Cliente(nombre,dni,fechanacimiento,telefono,email,direccion);

				nuevoCliente.crearcliente(dni,nombre);
			}
			
			else if(op.equals("2")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el IBAN: ejemplo AA12345678901234567890 ");
				String IBAN = reader.nextLine();
				
				System.out.println("Inserte el Titular de la cuenta: ");
				String titular = reader.nextLine();
				
				if(IBANValidator(IBAN) == false) 
				{
					System.out.println("Incorreto iserte de nuevo");
				
				}else {
				
				nuevaCuenta.crearcuenta(IBAN,titular);
				
				}
			}
			
			else if(op.equals("3")){
				
				
			}
			
			else if(op.equals("4")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el IBAN de la cuenta que quiere ver: ejemplo AA12345678901234567890 ");
				String IBAN = reader.nextLine();
				nuevaCuenta.VisualizarCuenta(IBAN);
				
			}else if(op.equals("5")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Saldo: " + nuevaCuenta.getSaldo() + " euros");
				
			}	
			
			else if(op.equals("6")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el IBAN de la cuenta que quiere ingresar: ejemplo AA12345678901234567890 ");
				String IBAN = reader.nextLine();
				System.out.println("Inserte el dinero que quieres meter: ");
				double cantidadI = reader.nextDouble();
				nuevaCuenta.realizarIngreso(cantidadI,IBAN);
			}
			
			else if(op.equals("7")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el IBAN de la cuenta que quiere ingresar: ejemplo AA12345678901234567890 ");
				String IBAN = reader.nextLine();
				System.out.println("Inserte el dinero que quieres retirar: ");
				double cantidadR= reader.nextDouble();
				nuevaCuenta.realizarRetirada(cantidadR,IBAN);
			}
			
			else if(op.equals("8")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el IBAN de la cuenta que quiere ingresar: ejemplo AA12345678901234567890 ");
				String IBAN = reader.nextLine();
				nuevaCuenta.eliminarcuenta(IBAN);
				
			}
			
			else if(op.equals("9")){
				
				reader = new Scanner(System.in);
				
				System.out.println("Inserte el IBAN de la cuenta que quiere ingresar: ejemplo AA12345678901234567890 ");
				String IBAN = reader.nextLine();
				nuevaCuenta.eliminarcuenta(IBAN);
				
			}
			else if(op.equals("10")){
			
				System.out.println("Saliendo del programa. Buen dia.");
			}
			
		}while(!op.equals("10"));
		
	}	
	
	
	public static boolean IBANValidator(String IBAN) {
	    boolean isFormatOk = false;
	    String regex = "^([A-Z]{2}[0-9]{20})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(IBAN);
	    if (matcher.matches()) {
	        isFormatOk = true;
	    }
	    return isFormatOk;
	}
	
	public static boolean dniValidator(String dni) {
	    boolean isFormatOk = false;
	    String regex = "^([0-9]{8}[A-Z]{1})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(dni);
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
