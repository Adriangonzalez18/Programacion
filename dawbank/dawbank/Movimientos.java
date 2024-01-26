package dawbank;

import java.time.LocalDateTime;

public class Movimientos {

	private int fecha;
	private int idmovimiento;
	private Tipodemovimiento tmovimiento;
	private int cantidad;
	

	
	public Movimientos( int fecha, int idmovimiento, Tipodemovimiento tmovimiento, int cantidad ) {
		
		this.fecha = fecha;
		this.idmovimiento = idmovimiento;
		this.tmovimiento = tmovimiento;
		this.cantidad = cantidad;
	}

	
	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	public int getIdmovimiento() {
		return idmovimiento;
	}

	public void setIdmovimiento(int idmovimiento) {
		this.idmovimiento = idmovimiento;
	}


	public Tipodemovimiento getTipodemovimiento() {
		return tmovimiento;
	}

	public void setTipodemoviento(Tipodemovimiento tmovimiento) {
		this.tmovimiento = tmovimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public String mostrarInfomovimientos() {
		
		LocalDateTime fecha = LocalDateTime.now();

		
		String s = " fecha " + this.fecha + " idmovimiento " +  idmovimiento + " Tipodemovimiento " + this.tmovimiento + " cantidad " + cantidad;
		
		System.out.println(""+ s);
		
		return s;
	
	}
}


