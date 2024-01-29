import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Agenda {

	private Map<String,Contacto> contactos = new HashMap<String,Contacto>();
	
	
public String anadeContacto ( String nombre ,String telefono,String correo) {
		
		String insertado = "";
		if(contactos.containsKey(nombre)) {
			System.out.println("La nombre ya esta registrado en la agenda");
		}
		
		else {
			contactos.put(insertado, new Contacto (nombre,telefono,correo));
		}
		
		return insertado;
	}
	
	public boolean eliminaContacto(String nombre) {
		
		boolean isRemoved = false;
		if(contactos.containsKey(nombre)) {
			contactos.remove(nombre);
			isRemoved = true;
			System.out.println("El contacto se elimino correctamente");
		}
		
		else {
			System.out.println("El contacto no existe");
		}
		
		return isRemoved;
	}
	
	public void buscaContacto() {
		Collection<Contacto> contacto = contactos.values();
		
		for (Contacto key : contacto) {
			System.out.println(key);
			}
	}

	public void visualizaAgenda() {
		
		Set<String> Contacto = contactos.keySet();
		
	for (String key : Contacto) {
		System.out.println(key + " - " + contactos.get(key));
		}		
	
		
	}
}
