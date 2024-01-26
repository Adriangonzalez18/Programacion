package videodaw12;

import java.time.LocalDate;

public class clientes {
	
	
	private String dni;
	private String nombre;
	private String numsocio;
	private String Direccion;
	private LocalDate fecha;
	private LocalDate FechaNacimiento;
	private LocalDate FechaBaja;
	private int numMaxPeliculas;
	private pelicula [] PeliculasAlquiladas;
	
	private int numeroActualPeliculas;
	
	public clientes( String dni, String nombre, String numsocio, String Direccion, LocalDate fecha, LocalDate FechaNacimiento ) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.numsocio = numsocio;
		this.Direccion = Direccion;
		this.fecha = fecha;
		this.FechaNacimiento = FechaNacimiento;
		
		this.numMaxPeliculas = 49;
		this.numeroActualPeliculas = 0;
		this.PeliculasAlquiladas =  new pelicula[this.numMaxPeliculas];
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumsocio() {
		return numsocio;
	}

	public void setNumsocio(String numsocio) {
		this.numsocio = numsocio;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public LocalDate getFechaBaja() {
		return FechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		FechaBaja = fechaBaja;
	}

	public pelicula[] getPeliculasAlquiladas() {
		return PeliculasAlquiladas;
	}
	
	
	public String toString2() {
		
		
		return "Trabajador [DNI=" + dni + ", Nombre=" + nombre + ", Numero de socio=" + numsocio + ", Direccion=" + Direccion + ", Fecha de nacimiento="
		+ FechaNacimiento + ", Fecha de Baja=" + FechaBaja + "] \n";
		
		
	}
	public void mostrarPeliculasAlquiladas() {
	System.out.println("Esta alquilada: " + PeliculasAlquiladas );

	}
}


