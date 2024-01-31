import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		
		int A ;
		int B ;
		int resultado ; 
		
		//Ejercicio1
		
		try {
			System.out.println("Introduzca un numero" );

			A = reader.nextInt();
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Error: por favor introduzca un numero" );
		}
		
		//Ejercicio2
		
		try {
			System.out.println("introduce el primer numero: ");
			A = reader.nextInt();
			System.out.println("introduce el segundo numero: ");
			B = reader.nextInt();
			resultado = A / B;
			System.out.println("El resultado es: " + resultado);
		}
		catch(InputMismatchException e) 
		{
			System.out.println("Error: por favor introduzca un numero" );
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Error: al realizar una operacion matematica" );
		}
		
		//Ejercicio3
		
		double [] vector = new double[5];
		
		try {
			reader = new Scanner(System.in);
			System.out.println("introduzca la posicion");
			double a = reader.nextDouble();
			
			a = vector[5];
			
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Error: posicion incorrecta");
		}
		finally {
			System.out.println("El programa ha finalizado");
		}
		
		
		//Ejercicio4
		
	}

}
