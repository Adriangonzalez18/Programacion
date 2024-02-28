import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Inserte el nombre de la empresa: ");
		String nombreempresa = reader.nextLine();
		
		System.out.println("Inserte el CIF de la empresa: ");
		String cif = reader.nextLine();
		
		System.out.println("Inserte la fecha de fundacion de la empresa: (ej: 01/01/2024) ");
		String fechafundacion1 = reader.nextLine();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate fechafundacion = LocalDate.parse(fechafundacion1,fmt);
		
		Empresa nuevaempresa = new Empresa(nombreempresa,cif,fechafundacion);
		
		System.out.println("");
		String [] opciones = {"1) Registrar trabajador en empresa","2) Mostrar información general de la empresa","3) Mostrar el número de trabajadores actuales y el organigrama de la empresa",
				"4) Mostrar información de un departamento", "5) Eliminar trabajador de la empresa","6) Agenda Director","7) Salir"};
	
		String op; 
		do {
			op = mostrarMenu(opciones);
			

			if(op.equals("1")){
				
				
				String [] opciones1 = {"a) Registrar director","b) Registrar GerenteDep","c) Registrar Trabajador normal","d) salir"};
				
				String op1; 
				do {
					op1 = mostrarMenu(opciones1);
					
					if(op1.equals("a")){
						
						
						System.out.println("Introduzca el nombre de la persona:");
						String nombre = reader.nextLine();
						
						LocalDate fechanacimiento = null;
						
						System.out.print("Introduzca la fecha de nacimiento (ej: 01/01/2024): ");
						
						String fecha = reader.nextLine();
						
						DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							
						fechanacimiento = LocalDate.parse(fecha, fmt1);
							
						System.out.println();
						
						System.out.print("Introduzca el dni de la persona (ej: 12345678X): ");
						String dni = reader.nextLine();
						
						System.out.print("Introduzca la direccion de la persona: ");
						String direccion = reader.nextLine();
						
						System.out.print("Introduzca el NumeroSS de la persona: ");
						String NumeroSS = reader.nextLine();
						
						System.out.print("Introduzca el email de la persona: ");
						String email = reader.nextLine();
						
						System.out.print("Introduzca el Salario de la persona: ");
						double Salario = reader.nextDouble();
						
						System.out.print("Introduzca el Departamento de la persona: ");
						String Departamento = reader.nextLine();
						
						System.out.print("Introduzca el telefono de la persona: ");
						String telefono = reader.nextLine();
						
						System.out.print("Di si persona esta en la oficina: ");
						boolean estarenlaoficina = reader.nextLine() != null;
						
						System.out.print("Di si persona esta rreunida: ");
						boolean estarreunido = reader.nextLine() != null;
						
						System.out.print("Di si persona esta fuera de la oficina: ");
						boolean fueradelaoficina = reader.nextLine() != null;
						
						Director Director = new Director(nombre, fechanacimiento, dni, direccion,NumeroSS,email,Salario,Departamento,estarenlaoficina,telefono,estarreunido,fueradelaoficina);	
						
						nuevaempresa.registrarDirector(dni,NumeroSS);

						
					}else if(op1.equals("b")){
						
						System.out.println("Introduzca el nombre de la persona:");
						String nombre = reader.nextLine();
						
						LocalDate fechanacimiento = null;
						
						System.out.print("Introduzca la fecha de nacimiento (ej: 01/01/2024): ");
						
						String fecha = reader.nextLine();
						
						DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							
						fechanacimiento = LocalDate.parse(fecha, fmt1);
							
						System.out.println();
						
						System.out.print("Introduzca el dni de la persona (ej: 12345678X): ");
						String dni = reader.nextLine();
						
						System.out.print("Introduzca la direccion de la persona: ");
						String direccion = reader.nextLine();
						
						System.out.print("Introduzca el NumeroSS de la persona: ");
						String NumeroSS = reader.nextLine();
						
						System.out.print("Introduzca el email de la persona: ");
						String email = reader.nextLine();
						
						System.out.print("Introduzca el Salario de la persona: ");
						double Salario = reader.nextDouble();
						
						System.out.print("Introduzca el Departamento de la persona: ");
						String Departamento = reader.nextLine();
						
						System.out.print("Di si persona esta en la oficina: ");
						boolean estarenlaoficina = reader.nextLine() != null;
						
						System.out.print("Introduzca el telefono de la persona: ");
						String telefono = reader.nextLine();
						
						System.out.print("Introduzca el numero de trabajadores: ");
						double numerodetrabajadores = reader.nextDouble();
						
						GerenteDep GerenteDep = new GerenteDep(nombre, fechanacimiento, dni, direccion,NumeroSS,email,Salario,Departamento,estarenlaoficina,numerodetrabajadores,telefono);	
						
						nuevaempresa.registrarGerente(dni, NumeroSS);
					
					}else if(op1.equals("c")){
						
						
						System.out.println("Introduzca el nombre de la persona:");
						String nombre = reader.nextLine();
						
						LocalDate fechanacimiento = null;
						
						System.out.print("Introduzca la fecha de nacimiento (ej: 01/01/2024): ");
						
						String fecha = reader.nextLine();
						
						DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							
						fechanacimiento = LocalDate.parse(fecha, fmt1);
							
						System.out.println();
						
						System.out.print("Introduzca el dni de la persona (ej: 12345678X): ");
						String dni = reader.nextLine();
						
						System.out.print("Introduzca la direccion de la persona: ");
						String direccion = reader.nextLine();
						
						System.out.print("Introduzca el NumeroSS de la persona: ");
						String NumeroSS = reader.nextLine();
						
						System.out.print("Introduzca el email de la persona: ");
						String email = reader.nextLine();
						
						System.out.print("Introduzca el Salario de la persona: ");
						double Salario = reader.nextDouble();
						
						System.out.print("Introduzca el Departamento de la persona: ");
						String Departamento = reader.nextLine();
						
						System.out.print("Di si persona esta en la oficina: ");
						boolean estarenlaoficina = reader.nextLine() != null;
						
						Trabajador Trabajador = new Trabajador(nombre, fechanacimiento, dni, direccion,NumeroSS,email,Salario,Departamento,estarenlaoficina);	
						
						nuevaempresa.registrarTrabajador(dni, NumeroSS);
					
					}else if(op1.equals("d")) {
					
					}
					
				}while(!op1.equals("d"));
			}
			
			else if(op.equals("2")){
				nuevaempresa.mostrarInformacionEmpresa();
				
			}
			
			else if(op.equals("3")){
				
				
			}
			
			else if(op.equals("4")){
				
				nuevaempresa.mostrarInformacionTrabajadores();

				
			}else if(op.equals("5")){
				
				System.out.print("Introduzca el dni de la persona que quiere ekiminar (ej: 12345678X): ");
				String dni = reader.nextLine();
				
				nuevaempresa.eliminarTrabajador(dni);
				
			}	
			
			else if(op.equals("6")){
				
				
			}
			
			
			else if(op.equals("7")){
			
				System.out.println("Saliendo del programa. Buen dia.");
			}
			
		}while(!op.equals("7"));
		
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
	
	public static String mostrarmenutrabajadores(String [] opciones1)
	{
		System.out.println("Seleccione la opcion deseada");
		Scanner reader = new Scanner(System.in);
		for(String opcion1 : opciones1)
		{
			System.out.println(opcion1);
		}
		
		return reader.nextLine();	
	}
	
	
}
