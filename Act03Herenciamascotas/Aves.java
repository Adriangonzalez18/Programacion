import java.time.LocalDate;

/**
 * @author daw1
 * @version 1.0.1
 * @see Aves
 */

public abstract class Aves extends Mascotas {

	String pico;
	String vuela;
	
	/**
	 *@param nombre Para insertar el nombre
	 * @param edad Para insertar la edad
	 * @param estado Para insertar el estado
	 * @param fechanacimiento Para insertar la fechanacimiento
	 * @param nmascota Para insertar el nmascota
	 * @param pico Para insertar el tipo de pico
	 * @param vuela Para insertar si vuela
	 */
	public Aves(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String pico,
			String vuela) {
		super(nombre, edad, estado, fechanacimiento, nmascota);
		this.pico = pico;
		this.vuela = vuela;
	}

	@Override
	public String muestra() {
		String s;
		
		s = "\nNombre" + nombre + "\nEdad" + edad + "\nEstado"+ estado + "\nfecha nacimiento" + fechanacimiento + "\nNª mascota" + nmascota + "\npico" + pico + "\nvuela" + vuela ;
		
		return s;
	}
}
