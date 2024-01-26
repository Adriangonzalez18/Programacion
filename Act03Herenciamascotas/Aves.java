import java.time.LocalDate;

public abstract class Aves extends Mascotas {

	String pico;
	String vuela;
	

	public Aves(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String pico,
			String vuela) {
		super(nombre, edad, estado, fechanacimiento, nmascota);
		this.pico = pico;
		this.vuela = vuela;
	}

	public String muestra() {
		String s;
		
		s = "\nNombre" + nombre + "\nEdad" + edad + "\nEstado"+ estado + "\nfecha nacimiento" + fechanacimiento + "\nNª mascota" + nmascota + "\npico" + pico + "\nvuela" + vuela ;
		
		return s;
	}
}
