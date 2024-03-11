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
		final String myFile = "Almacen.dat";
		final boolean modoApend = true; //cambiar a true para activar modo append

		Map<String, Producto> miLista = new HashMap<String, Producto>();
		
		boolean eof = false;
		
		try(FileInputStream fichero = new FileInputStream(myPath+myFile);
				DataInputStream lector = new DataInputStream(fichero);)
		{
			while(!eof)
			{
				//OJO: DANGER DANGER: Tenemos que conocer la estructura del fichero
				//Trabajador(String nombreC, int edad, double salarioB, String numSS)
				String codigo = lector.readUTF();
				String nombre = lector.readUTF();
				int cantidad = lector.readInt();
				double precio = lector.readDouble();
				
				Producto p = new Producto(codigo,nombre,cantidad,precio);
				miLista.put(codigo, p);
			}
			
			
		}catch(EOFException e)
		{
			eof = true;

			
		}catch(IOException e)
		{
			System.out.println("Se ha producido un error en el manejo del fichero");
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println("Ha ocurrido un error inexperado");
			System.out.println(e.getMessage());
		}
		
	
		String [] opciones = {"1) Crear producto","2) Mostrar productos existentes", 
				"3) Eliminar producto por código","4) Guardar productos en el fichero","5) Salir"};
		
		String op;
		
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
				
				System.out.println("Añade el código de el producto");
				String codigo = reader.next();
				
				if(miLista.containsKey(codigo)) {
					System.out.println("El producto ya existe");
				}

				else {
					System.out.println("Añade el nombre de el producto");
					String nombre = reader.next();
					
					System.out.println("Añade la cantidad de el producto");
					int cantidad = reader.nextInt();
					
					System.out.println("Añade el precio de el producto");
					double precio = reader.nextDouble();
					
					Producto producto  = new Producto(codigo,nombre,cantidad,precio);
					
					miLista.put(codigo,producto);
				}
				

				
			}else if(op.equals("2")){
				
				List<Producto> ProductoLeidos = new LinkedList<Producto>();
				
				boolean eof1 = false;
				
				try(FileInputStream fichero = new FileInputStream(myPath+myFile);
						DataInputStream lector = new DataInputStream(fichero);)
				{
					while(!eof1)
					{
						//OJO: DANGER DANGER: Tenemos que conocer la estructura del fichero
						//Trabajador(String nombreC, int edad, double salarioB, String numSS)
						String codigo = lector.readUTF();
						String nombre = lector.readUTF();
						int cantidad = lector.readInt();
						double precio = lector.readDouble();
						
						ProductoLeidos.add(new Producto(codigo,nombre,cantidad,precio));
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
				for(Producto t: ProductoLeidos)
				{
					System.out.println(t.toString());
				}
				
				
			}else if(op.equals("3")){
				
				System.out.println("Añade el código de el producto");
				String codigo = reader.next();
				
				if(miLista.containsKey(codigo)) {
					miLista.remove(codigo);
					System.out.println("El producto se elimino correctamente");
				}

				else {
					System.out.println("El codigo del producto no existe");
				}
				
				Producto producto  = new Producto(codigo);
				
				
			}else if(op.equals("4")){	
				
				try(FileOutputStream fichero = new FileOutputStream(myPath+myFile, modoApend);
						DataOutputStream escritor = new DataOutputStream(fichero);)
				{
					for(Producto p : miLista.values()) { 
						
						escritor.writeUTF(p.getCodigo());
						escritor.writeUTF(p.getNombre());
						escritor.writeInt(p.getCantidad());
						escritor.writeDouble(p.getPrecio());
					}

					
				}catch(IOException e)
				{
					System.out.println("Se ha producido un error en el manejo del fichero");
					System.out.println(e.getMessage());
				}
				finally {
					System.out.println("La escritura ha finalizado con exito.");
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
