import java.time.LocalDate;

/**
 * @author daw1
 * @version 1.0.1
 * @see Mascotas
 */
public abstract class Mascotas {
	
	String nombre;
	int edad;
	String estado;
	LocalDate fechanacimiento;
	String nmascota;
	
	/**
	 * @param nombre Para insertar el nombre
	 * @param edad Para insertar la edad
	 * @param estado Para insertar el estado
	 * @param fechanacimiento Para insertar la fechanacimiento
	 * @param nmascota Para insertar el nmascota
	 */
	public Mascotas(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechanacimiento = fechanacimiento;
		this.nmascota = nmascota;
	}

	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


	/**
	 * @return the fechanacimiento
	 */
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}


	/**
	 * @param fechanacimiento the fechanacimiento to set
	 */
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	/**
	 * @return the nmascota
	 */
	public String getNmascota() {
		return nmascota;
	}


	/**
	 * @param nmascota the nmascota to set
	 */
	public void setNmascota(String nmascota) {
		this.nmascota = nmascota;
	}

	/**
	 * @param muestra es un metodo pra mostrar la informacion por pantalla
	 */
	
	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota ;
		
		return s;
	}

	
	

}
