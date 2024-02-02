import java.time.LocalDate;

/**
 * @author daw1
 * @version 1.0.1
 * @see Canario
 */

public class Canario extends Aves {

	String color;
	String canta;
	
	/**
	 * @param nombre Para insertar el nombre
	 * @param edad Para insertar la edad
	 * @param estado Para insertar el estado
	 * @param fechanacimiento Para insertar la fechanacimiento
	 * @param nmascota Para insertar el nmascota
	 * @param pico Para insertar el tipo de pico
	 * @param vuela Para insertar si vuela
	 * @param color Para insertar el color
	 * @param canta Para insertar si canta
	 */
	public Canario(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String pico,
			String vuela, String color, String canta) {
		super(nombre, edad, estado, fechanacimiento, nmascota, pico, vuela);
		this.color = color;
		this.canta = canta;
	}

	@Override
	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota 
				+ "\npico " + pico + "\nVuela " + vuela + "\nColor " + color + "\nCanta " + canta;
		
		return s;
	}
}
