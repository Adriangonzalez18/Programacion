package videodaw12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		final String dniFormato = "[0-9]{8}[A-Z a-z]{1}";
		final String cifFormato = "[A-Z a-z]{1}[0-9]{10}";
		final String fechaFormato = "[0-3]{1}[0-9]{1}-[0-1]{1}[0-9]{1}-[0-9]{4}";
		
		System.out.println("dame el cif: ");
		String cif = reader.nextLine();
		
		System.out.println("dame la direccion: ");
		String direccion = reader.nextLine();
		
		VideoDaw VideoDaw = new VideoDaw(cif, direccion);
		
		
		String [] opciones = {"","1) Crear y registrar VideoClub en la franquicia", "2) Registrar película en videoclub", "3) Crear y registrar cliente en videoclub", "4) Alquilar película.Alquilar película.",
				"5) Devolver película","6) Dar de baja cliente","7) Dar de baja película","8) Salir"};
			
				String op; 
				do {
					op = mostrarMenu(opciones);
					
					
					if(op.equals("1")){
						
						boolean cifFormatoOK = false;
						System.out.println();
						
						
						do {
							
							System.out.print("Introduzca el cif de la empresa (ej: X1234567890): ");
							cif = reader.nextLine();
							cifFormatoOK = formatValidator(cif,cifFormato);
							if(!cifFormatoOK)
							{
								System.out.println("El formato del cif es incorrecto, vuelva a introducirlo ");
							}
						}while(!cifFormatoOK);
						
						String fecha;
						LocalDate fechaFundacion = null;
						boolean fechaIsOk = false;
						
						do {
							System.out.print("Introduzca la fecha de fundacion de la empresa (ej: 23-12-2000): ");
							fecha = reader.nextLine();
							fechaIsOk = formatValidator(fecha,fechaFormato);
							if(!fechaIsOk)
							{
								System.out.println("El formato de la fecha es incorrecto, vuelva a introducirlo ");
							}else {
								fechaFundacion = LocalDate.parse(fecha, formatter);
							}
							
						}while(!fechaIsOk);
						
					
					}
					
					else if(op.equals("2")){
						
						System.out.println(VideoDaw.mostrarinfoclientes());
						
					}
					
					else if(op.equals("3")){
						

						
						System.out.println("dame el dni: ");
						String dni = reader.nextLine();
						
						System.out.println("dame el nombre: ");
						String nombre = reader.nextLine();
						
						System.out.println("dame el numsocio: ");
						String numsocio = reader.nextLine();
						
						System.out.println("dame la direccion: ");
						String Direccion = reader.nextLine();
						
						System.out.println("dame la fecha: ");
						LocalDate fecha = LocalDate.now();
						
						System.out.println("dame la FechaNacimiento: ");
						LocalDate FechaNacimiento = LocalDate.now();
						
						
						clientes clientes = new clientes(dni, nombre, numsocio, Direccion, fecha, FechaNacimiento);
						
						clientes c = clientes;
						
						VideoDaw.registrarcliente(c);
						
					}
					
					else if(op.equals("4")){
						
						
						
					}	
					
					else if(op.equals("5")){
						
					
					}
					
					else if(op.equals("6")){
						
						VideoDaw.eliminarCliente(null);
					
					}
					
					else if(op.equals("7")){
						
						VideoDaw.eliminarPelicula(null);
						
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
	
	private static boolean formatValidator(String texto, String regex)
	{
		boolean isFormatOk = false;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		if(matcher.matches())
		{
			isFormatOk = true;
		}
		return isFormatOk;
	}
	
	
}
	

