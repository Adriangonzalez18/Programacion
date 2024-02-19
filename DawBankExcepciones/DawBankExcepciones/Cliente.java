package DawBankExcepciones;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente extends Persona{

	private String telefono;
	private String email;
	private String direccion;


	public Cliente(String nombre, String dni, LocalDate fechanacimiento, String telefono, String email,
			String direccion) {
		super(nombre, dni, fechanacimiento);
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return " \nnombre " + nombre + " \ndni " + dni +  " \nfechanacimiento " + fechanacimiento + "\ntelefono " + telefono + "\nemail=" + email + "\ndireccion " + direccion ;
	}
	
	

}