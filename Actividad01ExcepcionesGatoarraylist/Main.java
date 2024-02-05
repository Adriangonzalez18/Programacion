import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws GatoException{
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		
	try {
		System.out.println("Dame el nombre del gato");
		String nombre = reader.next();
		System.out.println("introduce la edad");
		int edad = reader.nextInt();
	
		Gato gato = new Gato(nombre,edad);
	}
	catch(Exception edad){
		System.out.println(edad.getMessage());
		
	}

	}
		

}
