import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fechanacimiento;
	private String dni;
	private String Direccion;
	/**
	 * @param nombre
	 * @param fechanacimiento
	 * @param dni
	 * @param direccion
	 */
	public Persona(String nombre, LocalDate fechanacimiento, String dni, String direccion) {
		super();
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
		this.dni = dni;
		Direccion = direccion;
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni)throws DniException{
		if(dni.length() >= 9) {
			this.dni = dni;
		}
		else {
			throw new DniException(dni);
		}
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechanacimiento=" + fechanacimiento + ", dni=" + dni + ", Direccion="
				+ Direccion + "]";
	}
	
public Persona(String dni) throws DniException{
		
		this.setDni(dni);
		
	}
}
