import java.time.LocalDate;

public class Gatos extends Mascotas {
	
	String color;
	String pelolargo;
	

	public Gatos(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String color,
			String pelolargo) {
		super(nombre, edad, estado, fechanacimiento, nmascota);
		this.color = color;
		this.pelolargo = pelolargo;
	}


	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota + "\nColor " + color + "\nPelo largo " + pelolargo ;
		
		return s;
	}
}
