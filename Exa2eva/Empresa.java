import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;





public class Empresa {
	
	private String nombreempresa;
	private String cif ;
	private LocalDate fechafundacion;
	
	Map<String, String> trabajadores = new HashMap<String, String>();

	/**
	 * @param nombreempresa
	 * @param cif
	 * @param fechafundacion
	 */
	public Empresa(String nombreempresa, String cif, LocalDate fechafundacion) {
		super();
		this.nombreempresa = nombreempresa;
		this.cif = cif;
		this.fechafundacion = fechafundacion;
		
	}

	public String getNombreempresa() {
		return nombreempresa;
	}

	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public LocalDate getFechafundacion() {
		return fechafundacion;
	}

	public void setFechafundacion(LocalDate fechafundacion) {
		this.fechafundacion = fechafundacion;
	}

	public Map<String, String> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(Map<String, String> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public String registrarTrabajador(String dni,String nnumeross) {
	    if (trabajadores.containsKey(dni)) {
	        System.out.println("El dni ya está registrado");
	        return "El dni ya está registrado";
	    
	    } else {
	    	trabajadores.put(dni, nnumeross);
	        System.out.println("Trabajador registrado con éxito");
	        return "Trabajador registrado con éxito";
	    }
	    
	}
	
	public String registrarGerente(String dni, String nnumeross) {
	    int contadorGernete = 0;
		if (contadorGernete >= 3) {
	    	
	    	if (trabajadores.containsKey(dni)) {
		        System.out.println("El dni ya está registrado");
		        return "El dni ya está registrado";
		    
		    } else {
		    	trabajadores.put(dni, nnumeross);
		        System.out.println("Trabajador registrado con éxito");
		        contadorGernete ++;
		        return "Gernete registrado con éxito";
		    }
	    }else {
	        System.out.println("No se pueden añadir mas gerentes");
	    }
		return "Gernete registrado con éxito";
		
	}
	
	public String registrarDirector(String dni, String numeroSS) {
	    int contadorDirector= 0;
		if (contadorDirector >= 1) {
	    	
	    	if (trabajadores.containsKey(dni)) {
		        System.out.println("El dni ya está registrado");
		        return "El dni ya está registrado";
		    
		    } else {
		    	trabajadores.put(dni, numeroSS);
		        System.out.println("Director registrado con éxito");
		        contadorDirector ++;
		        return "Director registrado con éxito";
		    }
	    }else {
	        System.out.println("No se pueden añadir mas gerentes");
	    }
		return "Director registrado con éxito";
		
	}
	
	public boolean eliminarTrabajador(String dni) {
		
		boolean isRemoved = false;
		if(trabajadores.containsKey(dni)) {
			trabajadores.remove(dni);
			isRemoved = true;
			System.out.println("El Trabajador se elimino correctamente");
		}
		
		else {
			System.out.println("El dni no existe");
		}
		
		return isRemoved;
	}
	
	@Override
	public String toString() {
		return " \nnombreempresa " + nombreempresa + " \ncif " + cif + " \nfechafundacion " + fechafundacion ;
	}

	public void mostrarInformacionTrabajadores() {
		Collection<String> trabajador = trabajadores.values();
		
		for (String key : trabajador) {
			System.out.println(key);
			}
	}
	
	public void mostrarInformacionEmpresa() {
	    
		String informaciontrabajadores = toString();
		System.out.println(informaciontrabajadores);
	  
 }
}