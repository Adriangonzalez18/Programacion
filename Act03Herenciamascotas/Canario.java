import java.time.LocalDate;

public class Canario extends Aves {

	String color;
	String canta;
	
	
	public Canario(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String pico,
			String vuela, String color, String canta) {
		super(nombre, edad, estado, fechanacimiento, nmascota, pico, vuela);
		this.color = color;
		this.canta = canta;
	}


	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota 
				+ "\npico " + pico + "\nVuela " + vuela + "\nColor " + color + "\nCanta " + canta;
		
		return s;
	}
}
