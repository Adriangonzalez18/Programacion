
public class ClaseCliente {
	
	private int dni;
	private String nombre;
	private int numsocio;
	private String Direccion;
	private int fecha;
	private int FechaNacimiento;
	private int FechaBaja;
	private int PeliculasAlquiladas;
	
	public ClaseCliente( int dni, String nombre, int numsocio, String Direccion, int fecha, int FechaNacimiento, int FechaBaja, int PeliculasAlquiladas ) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.numsocio = numsocio;
		this.Direccion = Direccion;
		this.fecha = fecha;
		this.FechaNacimiento = FechaNacimiento;
		this.FechaBaja = FechaBaja;
		this.PeliculasAlquiladas = PeliculasAlquiladas;
		
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumsocio() {
		return numsocio;
	}

	public void setNumsocio(int numsocio) {
		this.numsocio = numsocio;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public int getFechaBaja() {
		return FechaBaja;
	}

	public void setFechaBaja(int fechaBaja) {
		FechaBaja = fechaBaja;
	}

	public int getPeliculasAlquiladas() {
		return PeliculasAlquiladas;
	}

	public void setPeliculasAlquiladas(int peliculasAlquiladas) {
		PeliculasAlquiladas = peliculasAlquiladas;
	}
	

}
