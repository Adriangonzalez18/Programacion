import java.time.LocalDate;

/**
 * @author daw1
 * @version 1.0.1
 * @see Perro
 */

public class Perro extends Mascotas {

	private String raza; 
	private String pulgas;
	
	/**
	 * @param nombre Para insertar el nombre
	 * @param edad Para insertar la edad
	 * @param estado Para insertar el estado
	 * @param fechanacimiento Para insertar la fechanacimiento
	 * @param nmascota Para insertar el nmascota
	 * @param raza Para insertar la raza
	 * @param pulgas Para insertar si tiene pulgas
	 */
	public Perro(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String raza,
			String pulgas) {
		super(nombre, edad, estado, fechanacimiento, nmascota);
		this.raza = raza;
		this.pulgas = pulgas;
	}

	@Override
	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota +"\raza " + raza + "\npulgas " + pulgas ;
		
		return s;
	}
	
	

}
