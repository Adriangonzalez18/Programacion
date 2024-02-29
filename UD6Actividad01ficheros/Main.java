import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
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
		final String myFile = "trabajadores.dat";
		final boolean modoApend = false; //cambiar a true para activar modo append

		Map<String, Producto> miLista = new HashMap<String, Producto>();
	
		String [] opciones = {"1) Crear producto","2) Mostrar productos existentes", 
				"3) Eliminar producto por código","4) Guardar productos en el fichero","5) Salir"};
		
		String op;
		
		do {
			op = mostrarMenu(opciones);
				
	
			if(op.equals("1")){
				
				System.out.println("Añade el código de el producto");
				String codigo = reader.next();
				
				System.out.println("Añade el nombre de el producto");
				String nombre = reader.next();
				
				System.out.println("Añade la cantidad de el producto");
				int cantidad = reader.nextInt();
				
				System.out.println("Añade el precio de el producto");
				double precio = reader.nextDouble();
				
				Producto producto  = new Producto(codigo,nombre,cantidad,precio);
				
				miLista.put(codigo,producto);
		
			}else if(op.equals("2")){
				
				System.out.println("Añade el código de el producto");
				String codigo = reader.next();
				
				if(miLista.containsKey(codigo)) {
				       
				        String informacionCuenta = miLista.get(codigo).toString();
				        System.out.println(informacionCuenta);
				    } else {
				    	System.out.println("El codigo del producto no existe");
				    }
				
				Producto producto  = new Producto(codigo);

				
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
					
					//Recorremos la coleccion y escribimos los datos que tiene el objeto Trabajador
					for(Producto p: miLista)
					{
						escritor.writeUTF(p.getCodigo());
						escritor.writeUTF(p.getNombre());
						escritor.writeInt(p.getCantidad());
						escritor.writeDouble(p.getPrecio());
					}
				
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
