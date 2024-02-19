package DawBankExcepciones;

import java.time.LocalDate;

public class Persona {

	protected String nombre;
	protected String dni;
	protected LocalDate fechanacimiento;
	
	public Persona(String nombre, String dni, LocalDate fechanacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	
	
}
