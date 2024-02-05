import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		
			//Ejercicio1
		
			try {
				System.out.println("Introduzca un numero" );

				int A = reader.nextInt();
			}
			catch(InputMismatchException e) 
			{
				System.out.println("Error: por favor introduzca un numero" );
			}
		
			//Ejercicio2
		
			try {
				System.out.println("introduce el primer numero: ");
				int A = reader.nextInt();
				System.out.println("introduce el segundo numero: ");
				int B = reader.nextInt();
				int resultado = A / B;
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
				for(int i = 0; i < 6; i++)
				{
				reader = new Scanner(System.in);
				System.out.println("introduzca un numero");
				double a = reader.nextDouble();
			
				a = vector[5];
				}
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Error: posicion incorrecta");
			}
			finally {
				System.out.println("El programa ha finalizado");
			}
		
		
			//Ejercicio4
		
		System.out.println("Introduce el numero de datos que vas a meter: ");
		int numerosintroducidos = reader.nextInt();
		for(int i = 0; i < numerosintroducidos; i++){
		
			try {
				System.out.println("introduce un numero: ");
				int p = reader.nextInt();
			
				imprimepositivo(p);
				imprimenegativo(p);
		
			}catch(Exception p) {
				System.out.println(p.getMessage());
			}
		}
	}
	
		static void imprimepositivo(int p) throws NegativoException {
			if(p > 0) {
				System.out.println("El numero no es negativo");
			}else {
				throw new NegativoException(p);
			}
		}

		static void imprimenegativo(int p) throws PositivoException {
			if(p <= 0) {
				System.out.println("El numero no es positivo");
			}else {
				throw new PositivoException(p);
			}
		}
}
