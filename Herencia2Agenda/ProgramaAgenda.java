import java.util.Scanner;

public class ProgramaAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner reader = new Scanner (System.in);
		
		Agenda agenda = new Agenda();

		
		String [] opciones = {"1) Añadir Contacto", "2) Añadir Contacto", "3) Eliminar Contacto","4) Existe Contacto"
				,"5) Mostrar toda la agenda","6) Buscar Contacto","7) Salir"};

		String op;
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
		

				System.out.println("Inserte el nombre");
				String nombre = reader.nextLine();
				
				System.out.println("Inserte el numero de telefono");
				String numerotelefono = reader.nextLine();
				
				System.out.println("Inserte el cumpleaños");
				String cumpleanos = reader.nextLine();


				ContactoPersona Contacto = new ContactoPersona(nombre,numerotelefono,cumpleanos);
				
				agenda.registrarContactoPersona(Contacto);
				
			}if(op.equals("2")){
					

				System.out.println("Inserte el nombre");
				String nombre = reader.nextLine();
					
				System.out.println("Inserte el numero de telefono");
				String numerotelefono = reader.nextLine();
					
				System.out.println("Inserte el paginaweb");
				String paginaweb = reader.nextLine();


				ContactoEmpresa Contacto = new ContactoEmpresa(nombre,numerotelefono,paginaweb);
					
				agenda.registrarContactoEmpresa(Contacto);
					
					
				
			}else if(op.equals("3")){
		
				
				if( agenda.numeroactualagenda > 0)
				{

					reader = new Scanner(System.in);
					
					Contacto agendas =  null;
					System.out.println("Introduce el nombre de la persona que quiere eliminar de la agenda: ");
					String nombre = reader.nextLine();
					
					if(nombre != null)
					{
						agenda.eliminarContacto(nombre);
						
						for(int i = 0; i < agenda.numeroactualagenda; i++)
						{
							if(agenda.agendas[i].getNombre().equalsIgnoreCase(agendas.getNombre())) {
								
								agenda.agendas[i].getNombre();
							}
			
						}
						
					}
					else {
						System.out.println("No se han encontrado contactos con ese nombre");
					}
					
				}else
				{
					System.out.println("No hay trabajadores para eleminar");
				}
		
			}else if(op.equals("4")) {
				
				System.out.println("Inserte el  nombre");
				String nombre = reader.nextLine();
				
				agenda.IndicarsielContactoexiste(nombre);
				
				
			}else if(op.equals("5")) {	
				
				System.out.println(agenda.mostrarInfoContacto());
				
			}else if(op.equals("6")) {
				
				System.out.println("Inserte el  nombre");
				String nombre = reader.nextLine();
				
				System.out.println();
				if(agenda.buscarContacto(nombre));
				
			}else if(op.equals("7")){
		System.out.println("Saliendo del programa. Buen dia.");
		
			}else {
		System.out.println("Introduzca un valor correcto del menu"+"\n");
			}

		}while(!op.equals("7"));

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

}

