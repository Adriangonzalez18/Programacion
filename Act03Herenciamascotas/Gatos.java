import java.time.LocalDate;

/**
 * @author daw1
 * @version 1.0.1
 * @see Gatos
 */

public class Gatos extends Mascotas {
	
	String color;
	String pelolargo;
	
	/**
	 * @param nombre Para insertar el nombre
	 * @param edad Para insertar la edad
	 * @param estado Para insertar el estado
	 * @param fechanacimiento Para insertar la fechanacimiento
	 * @param nmascota Para insertar el nmascota
	 * @param color decir el color 
	 * @param pelolargo decir si tiene pelo largo
	 */
	public Gatos(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String color,
			String pelolargo) {
		super(nombre, edad, estado, fechanacimiento, nmascota);
		this.color = color;
		this.pelolargo = pelolargo;
	}

	@Override
	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota + "\nColor " + color + "\nPelo largo " + pelolargo ;
		
		return s;
	}
}
