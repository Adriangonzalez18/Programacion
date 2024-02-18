package DawBankExcepciones;

import java.time.LocalDateTime;

public class Movimientos {

	private static int contadorMovimientos = 1;
	private LocalDateTime fecha;
	private int idmovimiento;
	private String tmovimiento;
	private double cantidad;
	

	
	public Movimientos( String tmovimiento, double cantidad ) {
		
		this.idmovimiento = contadorMovimientos;
        this.fecha = LocalDateTime.now();
        this.tmovimiento = tmovimiento;
        this.cantidad = cantidad;
	}

	
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	public int getIdmovimiento() {
		return idmovimiento;
	}

	public void setIdmovimiento(int idmovimiento) {
		this.idmovimiento = idmovimiento;
	}


	public String getTipodemovimiento() {
		return tmovimiento;
	}

	public void setTipodemoviento(String tmovimiento) {
		this.tmovimiento = tmovimiento;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return " \nfecha " + fecha + " \nidmovimiento " + idmovimiento + " \ntmovimiento " + tmovimiento
				+ " \ncantidad " + cantidad ;
	}
	

	
	
}


