
package examenadrian;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.LocalDateTime;

public class gestion {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserte el nombre de la empresa: ");
		String nombredeempresa = reader.nextLine();
		
		System.out.println("Inserte el cif: ");
		String cif = reader.nextLine();
		
		System.out.println("Inserte el numero de trabajadores: ");
		int nummaxtrabajadores = reader.nextInt();
		
		empresa empresa = new empresa(nombredeempresa,cif,nummaxtrabajadores);
		
		if(cifValidator(cif) == false) 
		{
			System.out.println("Incorreto iserte de nuevo");
		
		}else {
		String [] opciones = {"","1) crear persona", "2) registrar trabajador en empresa", "3) mostrarinformacion de la empreasa", "4) mostrar el numero de trabajadores actuales",
				"5) mostrar informacion de todos los trabajadores","6) eliminar trabajadores","7) eliminar persona del programa","8) Salir"};
			
				String op; 
				do {
					op = mostrarMenu(opciones);
					
					
					if(op.equals("1")){
						
						
					}
					
					else if(op.equals("2")){
						
						System.out.println("Inserte el DNI: ");
						String dni = reader.nextLine();
						
						if(dnivalidator(dni) == false) 
						{
							System.out.println("El DNI es incorreto iserte de nuevo");
						}else {
							System.out.println("Inserte el nombre: ");
							String nombre = reader.nextLine();
							
							System.out.println("Inserte la fecha de nacimiento: ");
							int fechanacimiento = reader.nextInt();
							
							System.out.println("Inserte la direccion: ");
							String direccion = reader.nextLine();
								
							System.out.println("Inserte el numero de SS: ");
							int numeross = reader.nextInt();
							if(numerossvalidator(dni) == false) 
							{
								System.out.println("El numero de SS es incorreto iserte de nuevo");
							
							}else {
								
							}
						}
					}
					
					else if(op.equals("3")){
						empresa.mostrarInfoempresa();
						
						
					}
					
					else if(op.equals("4")){
						System.out.println("El numero de trabajadores es: " + empresa.getNummaxtrabajadores());	
						
						
					}	
					
					else if(op.equals("5")){
						
					
					}
					
					else if(op.equals("6")){
						
						
						
					
					}
					
					else if(op.equals("7")){
						
						
						
					}
					
					else if(op.equals("8")){
					
						System.out.println("Saliendo del programa. Buen dia.");
					}
					
				}while(!op.equals("8"));
				
			}	
		
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
	public static boolean cifValidator(String cif) {
	    boolean isFormatOk = false;
	    String regex = "^([A-Z]{1}[0-9]{10})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(cif);
	    if (matcher.matches()) {
	        isFormatOk = true;
	    }
	    return isFormatOk;
	}
	public static boolean dnivalidator(String dni) {
	    boolean isFormatOk = false;
	    String regex = "^([0-9]{8}[A-Z]{1})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(dni);
	    if (matcher.matches()) {
	        isFormatOk = true;
	    }
	    return isFormatOk;
	}
	public static boolean numerossvalidator(String numeross) {
	    boolean isFormatOk = false;
	    String regex = "^([0-9]{10})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(numeross);
	    if (matcher.matches()) {
	        isFormatOk = true;
	    }
	    return isFormatOk;
	}
	
}

