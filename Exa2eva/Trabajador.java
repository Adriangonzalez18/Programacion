import java.time.LocalDate;

public class Trabajador extends Persona{

	private String nnumeross;
	private String email;
	private double salario;
	private String departamento;
	private boolean estarenlaoficina;
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
	 */
	public Trabajador(String nombre, LocalDate fechanacimiento, String dni, String direccion, String nnumeross,
			String email, double salario, String departamento, boolean estarenlaoficina) {
		super(nombre, fechanacimiento, dni, direccion);
		this.nnumeross = nnumeross;
		this.email = email;
		this.salario = salario;
		this.departamento = departamento;
		this.estarenlaoficina = estarenlaoficina;
	}
	
	public String getNnumeross() {
		return nnumeross;
	}
	public void setNnumeross(String nnumeross) {
		this.nnumeross = nnumeross;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public boolean isEstarenlaoficina() {
		return estarenlaoficina;
	}
	public void setEstarenlaoficina(boolean estarenlaoficina) {
		this.estarenlaoficina = estarenlaoficina;
	}
	
	@Override
	public String toString() {
		return "Trabajador [nnumeross=" + nnumeross + ", email=" + email + ", salario=" + salario + ", departamento="
				+ departamento + ", estarenlaoficina=" + estarenlaoficina + "]";
	}
	
	
}
