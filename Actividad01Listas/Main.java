import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejercicio1
		Producto Producto1 = new Producto("azucar",1);
		Producto Producto2= new Producto("sal",1);
		Producto Producto3 = new Producto("leche",6);
		Producto Producto4 = new Producto("filetes de pollo",4);
		Producto Producto5 = new Producto("arroz",2);
		
		//ejercicio2
		List<Producto> producto = new ArrayList<Producto>();
		
		//ejercicio3
		producto.add(Producto1);
		producto.add(Producto2);
		producto.add(Producto3);
		producto.add(Producto4);
		producto.add(Producto5);
		
		//ejercicio4
		Iterator<Producto> itera = producto.iterator();
		Producto producto1;
		while (itera.hasNext()) {
			producto1 = itera.next();
			
			System.out.println(producto.toString());
		}
		
		//ejercicio5
		Iterator<Producto> itera1 = producto.iterator();
		Producto producto2;
		while (itera1.hasNext()) {
			producto2 = itera1.next();
			if(producto2.getNombre().equals("azucar"))
			{
				itera1.remove();
			}
			if(producto2.getNombre().equals("leche"))
			{
				itera1.remove();
			}
		}
		
		System.out.println();
		
		//ejercicio6
		Producto Producto6 = new Producto("fanta",3);
		producto.add(3,Producto6);
		
		//ejercicio7
		Iterator<Producto> itera2 = producto.iterator();
		Producto producto3;
		while (itera2.hasNext()) {
			producto1 = itera2.next();
			
			System.out.println(producto.toString());
		}
		
		//ejercicio8
		Collections.sort(producto);
		
	}

}
