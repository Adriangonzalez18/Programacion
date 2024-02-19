package DawBankExcepciones;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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

	Map<String, String> clientes = new HashMap<String, String>();

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
		return " \nnombre " + nombre + " \ndni " + dni +  " \nfechanacimiento " + fechanacimiento + "\ntelefono " + telefono + "\nemail " + email + "\ndireccion " + direccion ;
	}
	
	public String crearcliente(String dni, String nombre) {
	    if (clientes.containsKey(dni)) {
	        System.out.println("El dni ya está registrado");
	        return "El dni ya está registrado";
	    
	    } else {
	    	clientes.put(dni,nombre);
	        System.out.println("cliente creado con éxito");
	        return "cliente creado con éxito";
	    }
	}

	public boolean eliminarcliente(String dni) {
		
		boolean isRemoved = false;
		if(clientes.containsKey(dni)) {
			clientes.remove(dni);
			isRemoved = true;
			System.out.println("El cliente se elimino correctamente");
		}
		
		else {
			System.out.println("El DNI no existe");
		}
		
		return isRemoved;
	}
	
	 public void Visualizarcliente(String dni) {
		    if (clientes.containsKey(dni)) {
		        // Obtener la información de la cuenta asociada al IBAN
		        String informacionCuenta = clientes.get(dni).toString();
		        System.out.println(informacionCuenta);
		    } else {
		        System.out.println("El IBAN no existe");
		    }
	 }
	
}
