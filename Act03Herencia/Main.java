import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nummaxastros = 100;
		int numeroactualdeastros = 0;
		int numeroactualdeplanetas = 0;
		int numeroactualdesatelites = 0;
		Astros Universo [] = new Astros [nummaxastros];

		String [] opciones = {"1) Registrar Planeta", "2) Registrar Satelite", "3) Mostrar informacion Astros","4) Mostrar cantidad de Astros"
				,"5) Salir"};

		String op;
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
		
				Universo[numeroactualdeastros] = crearPlanetas();
				numeroactualdeastros ++;
				numeroactualdeplanetas ++;
		
			}else if(op.equals("2")){
		
				Universo[numeroactualdeastros] = crearSatelites();
				numeroactualdeastros ++;
				numeroactualdesatelites ++;
		
			}else if(op.equals("3")) {
				
			for(int i = 0; i < numeroactualdeastros; i++) {
				
				if(Universo[i] != null) {
					
					System.out.println(Universo[i].muestra());
					
				}
				
			}
			
				
			}else if(op.equals("4")) {	
				
				System.out.println("Hay " + numeroactualdeastros + " Astros");
				System.out.println("Hay " + numeroactualdeplanetas + " Planetas");
				System.out.println("Hay " + numeroactualdesatelites + " Satelites");
				System.out.println();

				
			}else if(op.equals("5")){
		System.out.println("Saliendo del programa. Buen dia.");
		
			}else {
		System.out.println("Introduzca un valor correcto del menu"+"\n");
			}

		}while(!op.equals("5"));

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
	
	private static Planetas crearPlanetas() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el radio del Planeta: ");
		double radio = reader.nextDouble();
		
		System.out.print("Introduzca la rotacion del eje del Planeta: ");
		double rotacioneje = reader.nextDouble();
		
		System.out.print("Introduzca la masa del Planeta: ");
		double masa = reader.nextDouble();

		System.out.print("Introduzca la temperatura media del Planeta: ");
		double temperaturamedia = reader.nextDouble();
		
		System.out.print("Introduzca la gravedad del Planeta: ");
		double gravedad = reader.nextDouble();
		
		System.out.print("Introduzca la distancia al sol: ");
		double distanciasol = reader.nextDouble();
		
		System.out.print("Introduzca la orbita al sol: ");
		double orbitasol = reader.nextDouble();
		
		System.out.print("tiene satelites: ");
		String tienesatelites = entrada.nextLine();
		
		System.out.println();
		
		Planetas Planetas  = new Planetas(radio, rotacioneje, masa, temperaturamedia,gravedad,distanciasol,orbitasol,tienesatelites);
		
		return Planetas;
		
	}
	
	private static Satelites crearSatelites() {

		Scanner reader = new Scanner (System.in);
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Introduzca el radio del Satelite:");
		double radio = reader.nextDouble();
		
		System.out.print("Introduzca la rotacion del eje del Satelite:");
		double rotacioneje = reader.nextDouble();
		
		System.out.print("Introduzca la masa del Satelite: ");
		double masa = reader.nextDouble();

		System.out.print("Introduzca la temperatura media del Satelite: ");
		double temperaturamedia = reader.nextDouble();
		
		System.out.print("Introduzca la gravedad del Satelite: ");
		double gravedad = reader.nextDouble();
		
		System.out.print("Introduzca la distancia al planeta: ");
		double distanciaplaneta = reader.nextDouble();
		
		System.out.print("Introduzca la orbita al planetaria: ");
		double orbitaplaneta = reader.nextDouble();
		
		System.out.print("Introduzca el planeta al que pertenece: ");
		String planetaalquepertenece = entrada.nextLine();
		
		System.out.println();
		
		Satelites Satelites  = new Satelites(radio, rotacioneje, masa, temperaturamedia,gravedad,distanciaplaneta,orbitaplaneta,planetaalquepertenece);
		
		return Satelites;
		
	}
	


}
