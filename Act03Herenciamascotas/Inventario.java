import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author daw1
 * @version 1.0.1
 * @see Inventario
 */

public class Inventario {
/**
 * 
 * @param args main
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		final String NmascotaFormato = "[0-9]{8}[A-Z a-z]{1}";
		
		int nummaxmascotas = 100;
		int numeroacualmascotas = 0;
		int numeroacualperros = 0;
		
		Mascotas inventario [] = new Mascotas [nummaxmascotas];

		/**
		 * 
		 */
		String [] opciones = {"1) Mostrar la lista de animales", "2) Mostrar todos los datos de un animal concreto", 
				"3) Mostrar todos los datos de todos los animales","4) Insertar animales en el inventario","5) Eliminar animales del inventario"
				,"6) Vaciar el inventario,","7) Salir"};
		
		String [] menuanimales = {"1) Registrar perro", "2) Registrar gato", "3) Registrar canario","4) Registrar loro","5) Salir"};
		
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
			    String men;
			    do {
			        men = mostrarMenuanimales(menuanimales);

			        if(men.equals("1")){
			            inventario[numeroacualmascotas] = crearPerro(NmascotaFormato);
			            numeroacualmascotas ++;
			            numeroacualperros ++;	
			            
			        } else if(men.equals("2")){
			            inventario[numeroacualmascotas] = crearGato();
			            numeroacualmascotas ++;
			            
			        } else if(men.equals("3")){
			            inventario[numeroacualmascotas] = crearCanario();
			            numeroacualmascotas ++;	
			            
			        } else if(men.equals("4")){
			            inventario[numeroacualmascotas] = crearLoro();
			            numeroacualmascotas ++;	
			            
			        } else if(men.equals("5")){
			            System.out.println("Saliendo del programa. Buen día.");
			        } else {
			            System.out.println("Introduzca un valor correcto del menú"+"\n");
			        }

			    } while (!men.equals("5"));
			

			}else if(op.equals("5")) {	
				
				
							
			}else if(op.equals("6")) {			
			
						
							
				
			}else if(op.equals("7")){
		System.out.println("Saliendo del programa. Buen dia.");
		
			}else {
		System.out.println("Introduzca un valor correcto del menu"+"\n");
			}

		}while(!op.equals("7"));

	}
		
	/**
	 * 
	 * @param opciones para el menu general
	 * @return devuelve lo introducido por pantalla
	 */
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
	
	/**
	 * 
	 * @param opciones para el menu de los animales
	 * @return devuelve lo introducido por pantalla
	 */
	public static String mostrarMenuanimales(String [] opciones)
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
	/**
	 *
	 * @param nummaxmascotas Valor numerico entero
	 * @param numeroacualmascotas Valor numerico entero
	 * @param numeroacualperros Valor numerico entero
	 * @param Mascotas nombre del array
	 * 
	 */
	int nummaxmascotas = 100;
	int numeroacualmascotas = 0;
	int numeroacualperros = 0;
	
	/**
	 * 
	 */
	Mascotas inventario [] = new Mascotas [nummaxmascotas];
	
	/**
	 *
	 * @param Mascotas Valor numerico entero
	 * 
	 *  @return Cadena devuelta.
	 */
	
	public boolean eliminarMascotas(Mascotas Mascotas ) {
	    boolean isRemoved = false;

	    if (this.inventario != null) {
	        if (this.numeroacualmascotas > 0) {
	            int pos = -1;
	            
	            
	            for (int i = 0; i < this.numeroacualmascotas; i++) {
	                if (this.inventario[i] != null && this.inventario[i].getNmascota().equalsIgnoreCase(Mascotas.getNmascota())) {
	                    pos = i;
	                    isRemoved = true;
	                    break;
	                }
	            }

	            if (isRemoved) {
	                
	                for (int i = pos; i < this.numeroacualmascotas - 1; i++) {
	                    this.inventario[i] = this.inventario[i + 1];
	                }

	                
	                this.inventario[this.numeroacualmascotas - 1] = null;

	                numeroacualmascotas--;
	            } else {
	                System.out.println("No se encontró la mascota con DNI: " + Mascotas.getNmascota());
	            }
	        } else {
	            System.out.println("La colección de mascotas está vacía");
	        }
	    }

	    return isRemoved;
	}
	
	/**
	 *
	 * @param Nmascota Valor numerico entero
	 * 
	 *  @return Cadena devuelta.
	 */
	
	public Mascotas encontrarPorNmascota(String Nmascota)
	{
		Mascotas t = null;
		
		for(int i = 0; i < this.numeroacualmascotas; i++)
		{
			if(this.inventario[i].getNmascota().equalsIgnoreCase(Nmascota))
			{
				t = inventario[i];
			}
		}
		
		return t;
	}
	
	/**
	 *
	 * @param Nmascota Valor numerico entero
	 * 
	 *  @return Cadena devuelta.
	 */
	
	private static Perro crearPerro(String nmascotaFormato) {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Perro: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Perro: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Perro: ejemplo 01/01/2024 ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Perro: ejemplo 12345678a ");
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
	
	/**
	 *
	 * @param Nmascota Valor numerico entero
	 * 
	 *  @return Cadena devuelta.
	 */
	
	private static Gatos crearGato() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Gato: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Gato: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Gato: ejemplo 01/01/2024 ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Gato: ejemplo 12345678a ");
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
	
	/**
	 *
	 * @param Nmascota Valor numerico entero
	 * 
	 *  @return Cadena devuelta.
	 */
	
	private static Canario crearCanario() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Canario: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Canario: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Canario: ejemplo 01/01/2024 ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Canario: ejemplo 12345678a ");
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
	
	/**
	 *
	 * @param Nmascota Valor numerico entero
	 * 
	 *  @return Cadena devuelta.
	 */
	
	private static Loro crearLoro() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el Nombre del Loro: ");
		String nombre = reader.next();
		
		System.out.print("Introduzca el estado del Loro: ");
		String estado = reader.next();

		System.out.print("Introduzca la fecha de nacimiento del Canario: ejemplo 01/01/2024 ");
		String fechanacimiento = reader.next();
		
		System.out.print("Introduzca el Nª mascota del Loro: ejemplo 12345678a ");
		String nmascota = reader.next();
		
		System.out.print("Introduzca el tipo de pico del Loro: ");
		String pico = reader.next();
		
		System.out.print("Introduzca el tipo de pico del Loro: ");
		String vuela = reader.next();
		
		System.out.print("Introduzca el origen del Loro: ");
		String origen = reader.next();
		
		System.out.print("Introduzca si habla el Loro: ");
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

