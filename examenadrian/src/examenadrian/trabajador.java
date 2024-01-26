package examenadrian;

public class trabajador {
	
	private String nombre;
	private int fechanacimiento;
	private String dni;
	private String direccion;
	private int numeross;
	
	public trabajador(String nombre,int fechanacimiento,String dni,String direccion,int numeross) {
		
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
		this.dni = dni;
		this.direccion = direccion;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(int fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeross() {
		return numeross;
	}

	public void setNumeross(int numeross) {
		this.numeross = numeross;
	}
	
	public void  mostrarInfotrabajador() {
		System.out.println("nombre: " + nombre );
		System.out.println("fecha de nacimiento: " + fechanacimiento );
		System.out.println("el dni es: " + dni );
		System.out.println("la direccion es: " + direccion );
		System.out.println("El numero de la SS es: " + numeross );
		}

}
