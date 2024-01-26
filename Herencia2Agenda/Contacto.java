
public abstract class Contacto {

		public String nombre;
		public String numerotelefono;
		

		public Contacto(String nombre, String numerotelefono) {
			super();
			this.nombre = nombre;
			this.numerotelefono = numerotelefono;
		}
		
		public Contacto(String nombre) {
			this.nombre = nombre;
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getNumerotelefono() {
			return numerotelefono;
		}

		public void setNumerotelefono(String numerotelefono) {
			this.numerotelefono = numerotelefono;
		}

		public abstract String toString(); 
			
		
}

