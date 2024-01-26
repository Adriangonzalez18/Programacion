
public class Planetas extends Astros{

	
	private double distanciasol;
	private double orbitasol;
	private String tienesatelites;
	
	public Planetas(double radio,double rotacioneje, double masa, double temperaturamedia, double gravedad, double distanciasol,
			double orbitasol, String tienesatelites) {
		
		super(radio, rotacioneje, masa, temperaturamedia, gravedad);
		this.distanciasol = distanciasol;
		this.orbitasol = orbitasol;
		this.tienesatelites = tienesatelites;
	}

	public String muestra() {
		String s;
		
		 s = "\nPlanetas radio = " + super.radio + "\nrotacioneje = " + super.rotacioneje + "\nmasa = " + super.masa + "\ntemperaturamedia = "
				+ super.temperaturamedia + "\ngravedad = " + super.gravedad + "\ndistanciasol = " + distanciasol + "\norbitasol = "
				+ orbitasol + "\ntienesatelites = " + tienesatelites;
		 return s;
	}


	
	
	
	
}
