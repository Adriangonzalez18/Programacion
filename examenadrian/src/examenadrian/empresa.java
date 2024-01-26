package examenadrian;

import java.time.LocalDateTime;

public class empresa {
	
	private String nombredeempresa;
	private String cif;
	private LocalDateTime fechadefundacion;
	private int nummaxtrabajadores;
	private String trabajador;
	
	empresa(String nombredeempresa,String cif,int nummaxtrabajadores) {
	
	this.nombredeempresa = nombredeempresa;
	this.cif = cif;
	this.nummaxtrabajadores = nummaxtrabajadores;
	
	
	}

	public String getNombredeempresa() {
		return nombredeempresa;
	}

	public void setNombredeempresa(String nombredeempresa) {
		this.nombredeempresa = nombredeempresa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public LocalDateTime getFechadefundacion() {
		return fechadefundacion;
	}

	public void setFechadefundacion(LocalDateTime fechadefundacion) {
		this.fechadefundacion = fechadefundacion;
	}

	public int getNummaxtrabajadores() {
		return nummaxtrabajadores;
	}

	public void setNummaxtrabajadores(int nummaxtrabajadores) {
		this.nummaxtrabajadores = nummaxtrabajadores;
	}

	public String getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	public void mostrarInfoempresa() {
		System.out.println("nombre de la empresa: " + nombredeempresa );
		System.out.println("el cif es: " + cif );
		System.out.println("la fecha de fundacion es : " + fechadefundacion );
		System.out.println("El numero maximo de trabajadores es: " + nummaxtrabajadores );
		}
	
}
