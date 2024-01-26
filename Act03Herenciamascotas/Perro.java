import java.time.LocalDate;

public class Perro extends Mascotas {

	private String raza; 
	private String pulgas;
	

	public Perro(String nombre, int edad, String estado, LocalDate fechanacimiento, String nmascota, String raza,
			String pulgas) {
		super(nombre, edad, estado, fechanacimiento, nmascota);
		this.raza = raza;
		this.pulgas = pulgas;
	}


	@Override
	public String muestra() {
		String s;
		
		s = "\nNombre " + nombre + "\nEdad " + edad + "\nEstado "+ estado + "\nfecha nacimiento " + fechanacimiento + "\nNª mascota " + nmascota +"\raza " + raza + "\npulgas " + pulgas ;
		
		return s;
	}
	
	

}
