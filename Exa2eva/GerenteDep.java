import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GerenteDep extends Trabajador{

	private double numerodetrabajadores;
	private String numerodetelefono;
	
	List<Trabajador> Trabajadores = new ArrayList<Trabajador>();

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
	 * @param numerodetrabajadores
	 * @param numerodetelefono
	 */
	public GerenteDep(String nombre, LocalDate fechanacimiento, String dni, String direccion, String nnumeross,
			String email, double salario, String departamento, boolean estarenlaoficina, double numerodetrabajadores,
			String numerodetelefono) {
		super(nombre, fechanacimiento, dni, direccion, nnumeross, email, salario, departamento, estarenlaoficina);
		this.numerodetrabajadores = numerodetrabajadores;
		this.numerodetelefono = numerodetelefono;
	}

	public double getNumerodetrabajadores() {
		return numerodetrabajadores;
	}

	public void setNumerodetrabajadores(double numerodetrabajadores) {
		this.numerodetrabajadores = numerodetrabajadores;
	}

	public String getNumerodetelefono() {
		return numerodetelefono;
	}

	public void setNumerodetelefono(String numerodetelefono) {
		this.numerodetelefono = numerodetelefono;
	}

	public List<Trabajador> getTrabajadores() {
		return Trabajadores;
	}

	public void setTrabajadores(List<Trabajador> trabajadores) {
		Trabajadores = trabajadores;
	}
	
	
}
