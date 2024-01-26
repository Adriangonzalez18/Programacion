package videodaw12;

import java.time.LocalDate;

public class VideoDaw {
	
	private String cif;
	private String direccion;
	private LocalDate fechaalta;
	private String peliculasregistradas;
	private String clientesregistrados;
	private int numMaxPeliculas;
	private int numMaxClientes;
	
	private pelicula [] coleccion;
	
	private clientes [] coleccion2;
	
	private int numpeliculasactuales = 0;
	
	private int numclientesactuales = 0;
	
	
	public VideoDaw(String cif, String direccion) {
		
		this.cif = cif;
		this.direccion = direccion;
		this.coleccion = new pelicula[this.numMaxPeliculas];
		this.coleccion2 = new clientes [this.numMaxClientes];
		
	}
	
	public VideoDaw(int numMaxPeliculas,int numMaxClientes) 
	{
		this.numMaxPeliculas = numMaxPeliculas;
		this.coleccion = new pelicula[this.numMaxPeliculas];
		
		this.numMaxClientes = numMaxClientes;
		this.coleccion2 = new clientes[this.numMaxClientes];
	}

	
	public String getcif() {
		return cif;
	}

	public void setcif(String cif) {
		this.cif = cif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDate getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(LocalDate fechaalta) {
		this.fechaalta = fechaalta;
	}

	public String getPeliculasregistradas() {
		return peliculasregistradas;
	}

	public void setPeliculasregistradas(String peliculasregistradas) {
		this.peliculasregistradas = peliculasregistradas;
	}

	public String getClientesregistrados() {
		return clientesregistrados;
	}

	public void setClientesregistrados(String clientesregistrados) {
		this.clientesregistrados = clientesregistrados;
	}
	
	
	public String mostrarinfoclientes(){
		String infoclientes = "";
		
		if(this.coleccion2 != null)
		{
			
		
			if(this.numclientesactuales == 0) {
				infoclientes = "No hay clientes registrados en el videoclub";
			}
			
			for(int i = 0; i < this.numclientesactuales; i++)
			{
				if(this.coleccion2[i] != null)
				{
					infoclientes = infoclientes + this.coleccion2[i].toString2();
				}
			}
		}
		return infoclientes;
	}
	
	public String mostrarinfopeliculas(){
		String infopeliculas = "";
		
		if(this.coleccion != null)
		{
			
		
			if(this.numpeliculasactuales == 0) {
				infopeliculas = "No hay peliculas registrados en el videoclub";
			}
			
			for(int i = 0; i < this.numpeliculasactuales; i++)
			{
				if(this.coleccion[i] != null)
				{
					infopeliculas = infopeliculas + this.coleccion[i].toString();
				}
			}
		}
		return infopeliculas;
	}	
	
	public boolean registrarcliente(clientes clientes)
	{
		boolean clienteIsertado = false;
		if(this.coleccion2 != null)
		{
			if(this.numclientesactuales >= 0 && this.numclientesactuales < this.numMaxPeliculas)
			{
				boolean existeCliente = false;
				for(int i = 0; i< this.numclientesactuales; i++)
				{
					if(this.coleccion2[i].getDni().equalsIgnoreCase(clientes.getDni()))
					{
						existeCliente = true;
						System.out.println("He pasado por aqui: Libro repetido");
					}
				}
				
				if(existeCliente == false)
				{
					coleccion2[numclientesactuales] = clientes;
					numclientesactuales ++;
					clienteIsertado = true;
				}
				else {
					System.out.println("El libro ya existe en la coleccion");
				}

			}
			else {
				System.out.println("La coleccion esta completa");
			}
		}
		
		return clienteIsertado;
	}
	
	public boolean eliminarCliente(clientes clientes)
	{
		boolean isRemoved = false;
		if(this.coleccion2 != null)
		{
			if(this.numclientesactuales > 0)
			{
				int pos = -1;
				for(int i =0; i< this.numclientesactuales; i++)
				{
					if(this.coleccion2[i] != null)
					{
						if(this.coleccion2[i].getDni().equalsIgnoreCase(clientes.getDni()))
						{
							this.coleccion2[i] = null;
							isRemoved = true;
							numclientesactuales --;
							pos = i;
						}
					}
				}
				
				for(int i = pos; i < this.coleccion2.length-1; i++)
				{
					this.coleccion2[i] = this.coleccion2[i+1];
				}
				this.coleccion2[coleccion2.length-1] = null;
				
				
			}
			else {
				System.out.println("La coleccion esta vacia");
			}	
		}
		
		return isRemoved;
	}
	
	public boolean insertarPelicula(pelicula pelicula)
	{
		boolean libroIsertado = false;
		if(this.coleccion != null)
		{
			if(this.numpeliculasactuales >= 0 && this.numpeliculasactuales < this.numMaxPeliculas)
			{
				boolean existeLibro = false;
				for(int i = 0; i< this.numpeliculasactuales; i++)
				{
					if(this.coleccion[i].getCod().equalsIgnoreCase(pelicula.getCod()))
					{
						existeLibro = true;
						System.out.println("He pasado por aqui: Libro repetido");
					}
				}
				
				if(existeLibro == false)
				{
					coleccion[numpeliculasactuales] = pelicula;
					numpeliculasactuales ++;
					libroIsertado = true;
				}
				else {
					System.out.println("El libro ya existe en la coleccion");
				}

			}
			else {
				System.out.println("La coleccion esta completa");
			}
		}
		
		return libroIsertado;
	}
	
	public boolean eliminarPelicula(pelicula pelicula)
	{
		boolean isRemoved = false;
		if(this.coleccion != null)
		{
			if(this.numpeliculasactuales > 0)
			{
				int pos = -1;
				for(int i =0; i< this.numpeliculasactuales; i++)
				{
					if(this.coleccion[i] != null)
					{
						if(this.coleccion[i].getCod().equalsIgnoreCase(pelicula.getCod()))
						{
							this.coleccion[i] = null;
							isRemoved = true;
							numpeliculasactuales --;
							pos = i;
						}
					}
				}
				
				for(int i = pos; i < this.coleccion.length-1; i++)
				{
					this.coleccion[i] = this.coleccion[i+1];
				}
				this.coleccion[coleccion.length-1] = null;
				
				
			}
			else {
				System.out.println("La coleccion esta vacia");
			}	
		}
		
		return isRemoved;
	}
}
