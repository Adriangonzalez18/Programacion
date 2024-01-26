
public abstract class Astros {
	
		
		public double radio;
		public double rotacioneje;
		public double masa;
		public double temperaturamedia;
		public double gravedad;
		
		
		public Astros(double radio, double rotacioneje, double masa, double temperaturamedia, double gravedad) 
		{
			super();
			this.radio = radio;
			this.rotacioneje = rotacioneje;
			this.masa = masa;
			this.temperaturamedia = temperaturamedia;
			this.gravedad = gravedad;
		}

		public abstract String muestra();
		
		public double getRadio() {
			return radio;
		}


		public void setRadio(double radio) {
			this.radio = radio;
		}


		public double getRotacioneje() {
			return rotacioneje;
		}


		public void setRotacioneje(double rotacioneje) {
			this.rotacioneje = rotacioneje;
		}


		public double getMasa() {
			return masa;
		}


		public void setMasa(double masa) {
			this.masa = masa;
		}


		public double getTemperaturamedia() {
			return temperaturamedia;
		}


		public void setTemperaturamedia(double temperaturamedia) {
			this.temperaturamedia = temperaturamedia;
		}


		public double getGravedad() {
			return gravedad;
		}


		public void setGravedad(double gravedad) {
			this.gravedad = gravedad;
		}
		
			
	

}


