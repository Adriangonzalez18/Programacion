
public class Satelites extends Astros{

	private double distanciaplaneta;
	private double orbitaplaneta;
	private String planetaalquepertenece;
	
	
	public Satelites(double radio, double rotacioneje, double masa, double temperaturamedia, double gravedad,
			double distanciaplaneta, double orbitaplaneta, String planetaalquepertenece) {
		
		super(radio, rotacioneje, masa, temperaturamedia, gravedad);
		this.distanciaplaneta = distanciaplaneta;
		this.orbitaplaneta = orbitaplaneta;
		this.planetaalquepertenece = planetaalquepertenece;
	}


	public String muestra() {
		String s;
		s = "\nSatelites radio = " + super.radio + "\nrotacioneje = " + super.rotacioneje + "\nmasa = " + super.masa + "\ntemperaturamedia = "
				+ super.temperaturamedia + "\ngravedad = " + super.gravedad + "\ndistanciaplaneta = " + distanciaplaneta
				+ "\norbitaplaneta = " + orbitaplaneta + "\nplanetaalquepertenece = " + planetaalquepertenece;
		return s;
	}
	
	
}
