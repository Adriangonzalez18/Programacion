import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		int nummaxastros = 100;
		int numeroacualmascotas = 0;
		int numeroacualperros = 0;
		Mascotas inventario [] = new Mascotas [nummaxastros];

		String [] opciones = {"1) Mostrar la lista de animales", "2) Mostrar todos los datos de un animal concreto", 
				"3) Mostrar todos los datos de todos los animales","4) Insertar animales en el inventario","5) Eliminar animales del inventario"
				,"6) Vaciar el inventario,","7) Salir"};

		String op;
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
		
				
		
			}else if(op.equals("2")){
		
				
		
			}else if(op.equals("3")) {
				
			
				for(int i = 0; i < numeroacualmascotas; i++) {
					
					if(inventario[i] != null) {
						
						System.out.println(inventario[i].muestra());
						
					}
			
				}
				
			}else if(op.equals("4")) {	
				
				
				
				inventario[numeroacualmascotas] = crearPerro();
				numeroacualmascotas ++;
				numeroacualperros ++;	
				

			}else if(op.equals("5")) {	
				
				
							
			}else if(op.equals("6")) {			
			
				Mascotas inventrio [] = new Mascotas [nummaxastros];				
							
				
			}else if(op.equals("7")){
		System.out.println("Saliendo del programa. Buen dia.");
		
			}else {
		System.out.println("Introduzca un valor correcto del menu"+"\n");
			}

		}while(!op.equals("7"));

	}
		
	

	public static String mostrarMenu(String [] opciones)
	{
		System.out.println("Seleccione la opcion deseada");
		System.out.println();
		Scanner reader = new Scanner(System.in);
		for(String opcion : opciones)
		{
			System.out.println(opcion);
		}
		
		return reader.nextLine();	
	}
	
	private static Perro crearPerro() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Perro: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Perro: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Perro: ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Perro: ");
		String nmascota = reader.next();
		
		System.out.print("Introduzca la raza del Perro: ");
		String raza = reader.next();
		
		System.out.print("Introduzca si tien pulgas el Perro: ");
		String pulgas = reader.next();
		
		LocalDate fechadehoy = LocalDate.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate fechadecumple = LocalDate.parse(fechanacimiento,fmt);
	
		int edad = fechadehoy.getYear() - fechadecumple.getYear();
		
		System.out.println();
		
		Perro Perro  = new Perro(nombre,edad,estado,fechadecumple,nmascota,raza,pulgas);
		
		return Perro;
		
	}
	
	private static Gatos crearGato() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Gato: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Gato: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Gato: ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Gato: ");
		String nmascota = reader.next();
		
		System.out.print("Introduzca el color del Gato: ");
		String color = reader.next();
		
		System.out.print("Introduzca si tiene pelolargo el Gato: ");
		String pelolargo = reader.next();
		
		LocalDate fechadehoy = LocalDate.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		LocalDate fechadecumple = LocalDate.parse(fechanacimiento,fmt);
	
		int edad = fechadehoy.getYear() - fechadecumple.getYear();
		
		System.out.println();
		
		Gatos Gatos  = new Gatos(nombre,edad,estado,fechadecumple,nmascota,color,pelolargo);
		
		return Gatos;
		
		
	}
	
	private static Canario crearCanario() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Canario: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Canario: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Canario: ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Canario: ");
		String nmascota = reader.next();
		
		System.out.print("Introduzca el tipo de pico del Canario: ");
		String pico = reader.next();
		
		System.out.print("Introduzca el tipo de pico del Canario: ");
		String vuela = reader.next();
		
		System.out.print("Introduzca el color del Canario: ");
		String color = reader.next();
		
		System.out.print("Introduzca si tiene pelolargo el Canario: ");
		String canta = reader.next();
		
		LocalDate fechadehoy = LocalDate.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechadecumple = LocalDate.parse(fechanacimiento,fmt);
	
		int edad = fechadehoy.getYear() - fechadecumple.getYear();
		
		System.out.println();
		
		Canario Canario  = new Canario(nombre,edad,estado,fechadecumple,nmascota,pico,vuela,color,canta);
		
		return Canario;
		
		
	}
	private static Loro crearLoro() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Canario: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Canario: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Canario: ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Canario: ");
		String nmascota = reader.next();
		
		System.out.print("Introduzca el tipo de pico del Canario: ");
		String pico = reader.next();
		
		System.out.print("Introduzca el tipo de pico del Canario: ");
		String vuela = reader.next();
		
		System.out.print("Introduzca el color del Canario: ");
		String origen = reader.next();
		
		System.out.print("Introduzca si tiene pelolargo el Canario: ");
		String habla = reader.next();
		
		
		LocalDate fechadehoy = LocalDate.now();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechadecumple = LocalDate.parse(fechanacimiento,fmt);
	
		int edad = fechadecumple.getYear() - fechadehoy.getYear();
		
		System.out.println();
		
		Loro Loro  = new Loro(nombre,edad,estado,fechadecumple,nmascota,pico,vuela,origen,habla);
		
		return Loro;
		
		
	}
	
}
