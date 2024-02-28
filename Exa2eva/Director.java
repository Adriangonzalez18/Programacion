import java.time.LocalDate;

public class Director extends Trabajador{

	private String telefono;
	private boolean estarreunido;
	private boolean fueradelaoficina;
	
	/**
	 * @param nombre
	 * @param fechanacimiento
	 * @param dni
	 * @param direccion
	 * @param nnumeross
	 * @param email
	 * @param salario
	 * @param departamento
	 * @param estarenlaoficina
	 * @param telefono
	 * @param estarreunido
	 * @param fueradelaoficina
	 */
	public Director(String nombre, LocalDate fechanacimiento, String dni, String direccion, String nnumeross,
			String email, double salario, String departamento, boolean estarenlaoficina, String telefono,
			boolean estarreunido, boolean fueradelaoficina) {
		super(nombre, fechanacimiento, dni, direccion, nnumeross, email, salario, departamento, estarenlaoficina);
		this.telefono = telefono;
		this.estarreunido = estarreunido;
		this.fueradelaoficina = fueradelaoficina;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isEstarreunido() {
		return estarreunido;
	}
	public void setEstarreunido(boolean estarreunido) {
		this.estarreunido = estarreunido;
	}
	public boolean isFueradelaoficina() {
		return fueradelaoficina;
	}
	public void setFueradelaoficina(boolean fueradelaoficina) {
		this.fueradelaoficina = fueradelaoficina;
	}

	@Override
	public String toString() {
		return "Director [telefono=" + telefono + ", estarreunido=" + estarreunido + ", fueradelaoficina="
				+ fueradelaoficina + "]";
	}


}
