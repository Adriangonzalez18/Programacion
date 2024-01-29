import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner reader = new Scanner (System.in);
			
			Agenda agenda = new Agenda();
			
			String [] opciones = {"1) Añadir coche", "2) Eliminar coche", "3) Salir"};
	
			String op;
			do {
				op = mostrarMenu(opciones);
					
		
				if(op.equals("1")){
					
					System.out.println("Inserte el Color");
					String nombre = reader.nextLine();
					
					System.out.println("Inserte la marca");
					String telefono = reader.nextLine();
					
					System.out.println("Inserte la matrícula");
					String correo = reader.nextLine();
	
					agenda.anadeContacto(nombre, telefono, correo);
				
					
				}else if(op.equals("2")){
					
					System.out.println("Inserte la matrícula");
					String nombre = reader.nextLine();
					
					agenda.buscaContacto();
				
				}else if(op.equals("3")){
					
					System.out.println("Inserte la matrícula");
					String nombre = reader.nextLine();
					
					agenda.eliminaContacto(nombre);	
					
				}else if(op.equals("4")){
					
					agenda.visualizaAgenda();	
				
				}else if(op.equals("5")){
					
						
					
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

}
