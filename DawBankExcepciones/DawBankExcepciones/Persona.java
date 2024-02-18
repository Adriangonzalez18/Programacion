package DawBankExcepciones;

import java.time.LocalDateTime;

public class Persona {

	protected String nombre;
	protected String dni;
	protected LocalDateTime fechanacimiento;
	
	public Persona(String nombre, String dni, LocalDateTime fechanacimiento) {
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


	public LocalDateTime getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(LocalDateTime fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	
	
}
