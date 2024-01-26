
public class Movimiento {

		private int fecha;
		private String idmovimiento;
		private int tipo;
		private int cantidad;
		
		public Movimiento( int fecha, String idmovimiento, int tipo, int cantidad ) {
			
			this.fecha = fecha;
			this.idmovimiento = idmovimiento;
			this.tipo = tipo;
			this.cantidad = cantidad;
		}

		
		public int getFecha() {
			return fecha;
		}

		public void setFecha(int fecha) {
			this.fecha = fecha;
		}
		
		public String getIdmovimiento() {
			return idmovimiento;
		}

		public void setIdmovimiento(String idmovimiento) {
			this.idmovimiento = idmovimiento;
		}


		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public String mostrarInfo() {
			
			String s = "fecha" + this.fecha + "idmovimiento" +  idmovimiento + "tipo" + tipo + "cantidad" + cantidad;

			return s;
		
		}
}


