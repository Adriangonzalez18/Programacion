import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		final String myPath = "./src/Resources/";
		final String myFile = "Biblioteca.dat";
		final boolean modoApend = true; //cambiar a true para activar modo append

		List<Libro> miLista = new LinkedList<Libro>();
		
		boolean eof = false;
		
		try(FileOutputStream file = new FileOutputStream(myPath+myFile, modoApend );
				ObjectOutputStream buffer = new ObjectOutputStream(file);)
		{
			//Recorro la coleccion y escribo cada uno de sus objetos
			for(Libro t : miLista)
			{
				//Escribo objeto serializable
				buffer.writeObject(t);
			}
			
		}catch(IOException e)
		{
			System.out.println("Se ha producido un error en la lectura del fichero");
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Fin de la escritura del fichero: "+ myFile);
		}
		
	
		String [] opciones = {"1 )Crear Libro y registrarlo en la Biblioteca (ISBN único)", 
				"2) Mostrar Libros existentes por (ISBN, titulo, Autor, Fecha)", 
				"3) Eliminar Libro por ISBN",
				"4) Guardar Libros en el fichero",
				"5) Guardar y Salir "};
		
		String op;
		
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
				
				System.out.println("Añade el código de el producto");
				String ISBN = reader.next();
				
				if(miLista.containsKey(ISBN)) {
					System.out.println("El producto ya existe");
				}

				else {
					System.out.println("Añade el nombre de el producto");
					String Titulo = reader.next();
					
					System.out.println("Añade la cantidad de el producto");
					String Autor = reader.next();
					
					System.out.println("Añade el precio de el producto");
					String FechaPublicacion = reader.next();
					
					Libro p = new Libro(ISBN,Titulo,Autor,FechaPublicacion);
					
					miLista.add(new Libro(ISBN,Titulo,Autor,FechaPublicacion));
				}
				

				
			}else if(op.equals("2")){
				
				 List<Libro> LibrosLeidos = new LinkedList<Libro>();
				
				boolean eof1 = false;
				
				try(FileInputStream fichero = new FileInputStream(myPath+myFile);
						DataInputStream lector = new DataInputStream(fichero);)
				{
					while(!eof1)
					{
						//OJO: DANGER DANGER: Tenemos que conocer la estructura del fichero
						//Trabajador(String nombreC, int edad, double salarioB, String numSS)
						String ISBN = lector.readUTF();
						String Titulo = lector.readUTF();
						String Autor = lector.readUTF();
						String FechaPublicacion = lector.readUTF();
						
						LibrosLeidos.add(new Libro(ISBN,Titulo,Autor,FechaPublicacion));
					}
					
					
				}catch(EOFException e)
				{
					eof1 = true;

					
				}catch(IOException e)
				{
					System.out.println("Ha ocurrido un error al I/O");
					System.out.println(e.getMessage());
					
				}catch(Exception e)
				{
					System.out.println("Ha ocurrido un error inexperado");
					System.out.println(e.getMessage());
				}
				
				
				System.out.println("Se muestran los datos obtenidos del fichero .dat \n");
				for(Libro t: LibrosLeidos)
				{
					System.out.println(t.toString());
				}
				
				
			}else if(op.equals("3")){
				
				System.out.println("Añade el código de el producto");
				String ISBN = reader.next();
				
				if(miLista.containsKey(ISBN)) {
					miLista.remove(ISBN);
					System.out.println("El producto se elimino correctamente");
				}

				else {
					System.out.println("El codigo del producto no existe");
				}
				
				Libro libro  = new Libro(ISBN);
				
				
			}else if(op.equals("4")){	
				
				try(FileOutputStream file = new FileOutputStream(myPath+myFile, modoApend );
						ObjectOutputStream buffer = new ObjectOutputStream(file);)
				{
					//Recorro la coleccion y escribo cada uno de sus objetos
					for(Libro t : miLista)
					{
						//Escribo objeto serializable
						buffer.writeObject(t);
					}
					
				}catch(IOException e)
				{
					System.out.println("Se ha producido un error en la lectura del fichero");
					System.out.println(e.getMessage());
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				finally {
					System.out.println("Fin de la escritura del fichero: "+ myFile);
				}

					
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
			
			
}
