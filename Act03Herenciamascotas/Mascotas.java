import java.time.LocalDate;

public abstract class Mascotas {
	
	String nombre;
	int edad;
	String estado;
	LocalDate fechanacimiento;
	String nmascota;
	
	
	
	public Mascotas(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.fechanacimiento = fechanacimiento;
		this.nmascota = nmascota;
	}

	public abstract String muestra();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDate fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNmascota() {
		return nmascota;
	}

	public void setNmascota(String nmascota) {
		this.nmascota = nmascota;
	}

	
	

}
