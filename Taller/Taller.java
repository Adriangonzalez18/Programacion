import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Taller {
	
	private Map<String,Coche> coches = new HashMap<String,Coche>();


	
	
	public String anadeElemento ( String matricula ,String color,String marca) {
		
		String insertado = "";
		if(coches.containsKey(matricula)) {
			System.out.println("La matrícula ya esta registrada");
		}
		
		else {
			coches.put(matricula, new Coche (color,marca));
		}
		
		return insertado;
	}
	
	public boolean eliminaelemento(String matricula) {
		
		boolean isRemoved = false;
		if(coches.containsKey(matricula)) {
			coches.remove(matricula);
			isRemoved = true;
			System.out.println("La matrícula se elimino correctamente");
		}
		
		else {
			System.out.println("La matrícula no existe");
		}
		
		return isRemoved;
	}
	
	public void VisualizarMatriculas() {
		Set<String> matricula = coches.keySet();
		
		for (String key : matricula) {
			System.out.println(key);
			}
	}
	
	public void VisualizarCoches() {
		Collection<Coche> coche = coches.values();
		
		for (Coche key : coche) {
			System.out.println(key);
			}
	}

	public void visualizaTaller() {
		
		Set<String> taller = coches.keySet();
		
	for (String key : taller) {
		System.out.println(key + " - " + coches.get(key));
		}		
	
		
	}
}
