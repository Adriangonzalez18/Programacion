import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner reader = new Scanner (System.in);
	
			final String nonbreFormato = "[A-Z][a-zA-Z]*";
			final String numeroFormato = "[679][0-9]{8}";
			final String correoFormato = "[a-zA-Z0-9_.-]+@[a-zA-Z]+.[a-zA-Z]{2,4}";
			
			Agenda agenda = new Agenda();
			
			String [] opciones = {"1) Añadir contacto", "2) Buscar contacto","3) Eliminar contacto","4) Visualizar agenda"
					,"5) Número de contactos de mi agenda", "6) Salir"};
	
			String op;
			do {
				op = mostrarMenu(opciones);
					
		
				if(op.equals("1")){
					
					boolean Formatook = false;
					String nombre;
					String telefono;
					String correo;
					
					do {
						System.out.print("Introduzca el nombre de la persona la primera letra en mayuscula: ");
						nombre = reader.nextLine();
						Formatook = formatValidator(nombre,nonbreFormato);
						if(!Formatook)
						{
							System.out.println("El formato del nombre es incorrecto, vuelva a introducirlo ");
						}
					}while(!Formatook);
					
					do {
						System.out.print("Inserte el telefono que empiece por 6,7 o 9 y tenga en total 9 dígitos ejemplo 678901234");
						telefono = reader.nextLine();
						Formatook = formatValidator(telefono,numeroFormato);
						if(!Formatook)
						{
							System.out.println("El formato del telefono es incorrecto, vuelva a introducirlo ");
						}
					}while(!Formatook);
					
					do {
						System.out.print("Inserte el correo adrian@ejemplo.com");
						correo = reader.nextLine();
						Formatook = formatValidator(correo,correoFormato);
						if(!Formatook)
						{
							System.out.println("El formato del correo es incorrecto, vuelva a introducirlo ");
						}
					}while(!Formatook);
	
					agenda.anadeContacto(nombre, telefono, correo);
				
				
				}else if(op.equals("2")){
					
					boolean nonbreFormatook = false;
					String nombre;
					
					do {
						System.out.print("Introduzca el nombre de la persona la primera letra en mayuscula: ");
						nombre = reader.nextLine();
						nonbreFormatook = formatValidator(nombre,nonbreFormato);
						if(!nonbreFormatook)
						{
							System.out.println("El formato del nombre es incorrecto, vuelva a introducirlo ");
						}
					}while(!nonbreFormatook);
					
					agenda.buscaContacto(nombre);
				
				}else if(op.equals("3")){
					
					boolean nonbreFormatook = false;
					String nombre;
					
					do {
						System.out.print("Introduzca el nombre de la persona la primera letra en mayuscula: ");
						nombre = reader.nextLine();
						nonbreFormatook = formatValidator(nombre,nonbreFormato);
						if(!nonbreFormatook)
						{
							System.out.println("El formato del nombre es incorrecto, vuelva a introducirlo ");
						}
					}while(!nonbreFormatook);
					
					agenda.eliminaContacto(nombre);	
					
				}else if(op.equals("4")){
					
					agenda.visualizaAgenda();	
				
				}else if(op.equals("5")){
					
					agenda.Agendanumerodevontactos();
					
				}else if(op.equals("6")){
					System.out.println("Saliendo del programa. Buen dia.");
					
						}else {
					System.out.println("Introduzca un valor correcto del menu"+"\n");
						}
	
					}while(!op.equals("6"));
	
			
		}	
	public static String mostrarMenu(String [] opciones)
	{
		System.out.println("\nSeleccione la opcion deseada");
		System.out.println();
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