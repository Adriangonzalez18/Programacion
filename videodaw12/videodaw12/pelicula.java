package videodaw12;

import java.time.LocalDate;

public class pelicula {
	
	private String cod;
	private String titulo;
	private genero genero;
	private LocalDate fechaderegistro;
	private LocalDate fechadebaja;
	private LocalDate fechadealquiler;
	private boolean isalquilada;
	
	
	

	public pelicula(String cod, String titulo, videodaw12.genero genero, LocalDate fechaderegistro, LocalDate fechadebaja,
			LocalDate fechadealquiler, boolean isalquilada) {
		
		this.cod = cod;
		this.titulo = titulo;
		this.genero = genero;
		this.fechaderegistro = fechaderegistro;
		this.fechadebaja = fechadebaja;
		this.fechadealquiler = fechadealquiler;
		this.isalquilada = isalquilada;
	
	
		
	}public String getCod() {
			return cod;
		}
	public void setCod(String cod) {
			this.cod = cod;	
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public genero getGenero() {
		return genero;
	}
	public void setGenero(genero genero) {
		this.genero = genero;
	}
	public LocalDate getFechaderegistro() {
		return fechaderegistro;
	}
	public void setFechaderegistro(LocalDate fechaderegistro) {
		this.fechaderegistro = fechaderegistro;
	}
	public LocalDate getFechadebaja() {
		return fechadebaja;
	}
	public void setFechadebaja(LocalDate fechadebaja) {
		this.fechadebaja = fechadebaja;
	}
	public LocalDate getFechadealquiler() {
		return fechadealquiler;
	}
	public void setFechadealquiler(LocalDate fechadealquiler) {
		this.fechadealquiler = fechadealquiler;
	}
	public boolean isIsalquilada() {
		return isalquilada;
	}
	public void setIsalquilada(boolean isalquilada) {
		this.isalquilada = isalquilada;
	}
	
	public String  toString() {
		
		return "pelicula [COD=" + cod + ", Titulo=" + titulo + ", Genero=" + genero + ", Fecha de registro=" + fechaderegistro + 
				", Fecha de alquiler=" + fechadealquiler + ", Esta alquilada:=" + isalquilada +"]";

		}
	
	
	

}
