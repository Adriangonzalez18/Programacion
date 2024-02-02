import java.time.LocalDate;

/**
 * @author daw1
 * @version 1.0.1
 * @see Loro
 */

public class Loro extends Aves {
	
	String origen;
	String habla;

	/**
	 * @param nombre Para insertar el nombre
	 * @param edad Para insertar la edad
	 * @param estado Para insertar el estado
	 * @param fechanacimiento Para insertar la fechanacimiento
	 * @param nmascota Para insertar el nmascota
	 * @param pico Para insertar el tipo de pico
	 * @param vuela Para insertar si vuela
	 * @param origen Para insertar el origen
	 * @param habla Para insertar si habla
	 */
	public Loro(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String pico,
			String vuela, String origen, String habla) {
		super(nombre, edad, estado, fechanacimiento, nmascota, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	
	@Override
	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota 
				+ "\npico " + pico + "\nvuela " + vuela + "\nOrigen " + origen + "\nhabla " + habla;
		
		return s;
	}
}
