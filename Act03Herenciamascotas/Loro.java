import java.time.LocalDate;

public class Loro extends Aves {
	
	String origen;
	String habla;


	public Loro(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String pico,
			String vuela, String origen, String habla) {
		super(nombre, edad, estado, fechanacimiento, nmascota, pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}

	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota 
				+ "\npico " + pico + "\nvuela " + vuela + "\nOrigen " + origen + "\nhabla " + habla;
		
		return s;
	}
}
