import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		
		Taller taller = new Taller();
		
		String [] opciones = {"1) Añadir coche", "2) Eliminar coche", "3) Salir"};

		String op;
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
				
				System.out.println("Inserte el Color");
				String Color = reader.nextLine();
				
				System.out.println("Inserte la marca");
				String marca = reader.nextLine();
				
				System.out.println("Inserte la matrícula");
				String matricula = reader.nextLine();

				taller.anadeElemento (Color,marca,matricula);
			
				
			}if(op.equals("2")){
				
				System.out.println("Inserte la matrícula");
				String matricula = reader.nextLine();
				
				taller.eliminaelemento(matricula);
			
				
			}else if(op.equals("3")){
				System.out.println("Saliendo del programa. Buen dia.");
				
					}else {
				System.out.println("Introduzca un valor correcto del menu"+"\n");
					}

				}while(!op.equals("3"));

		taller.VisualizarMatriculas();
		taller.VisualizarCoches();
		taller.visualizaTaller();
		
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
