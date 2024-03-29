import java.util.Scanner;

public  class Agenda {
	
	Scanner reader = new Scanner (System.in);
	
	private int nunmaxagenda = 100;
	
	public int numeroactualagenda = 0;
	public Contacto [] agendas = new Contacto[nunmaxagenda];
	
	
	public String mostrarInfoContacto()
	{
		String InfoContacto = "";
		
		if(this.agendas != null)
		{
			 
			if(this.numeroactualagenda == 0) {
				InfoContacto = "No hay trabajadores registrados en la empresa";
			}
			
			for(int i = 0; i < this.numeroactualagenda; i++)
			{
				if(this.agendas[i] != null)
				{
					InfoContacto = InfoContacto + this.agendas[i].toString();
				}
			}
		}
		
		return InfoContacto;
	}
	public boolean registrarContactoPersona(Contacto contactopersona)
	{
		boolean ContactoIsertado = false;
		if(this.agendas != null)
		{
			if(this.numeroactualagenda >= 0 && this.numeroactualagenda < this.nunmaxagenda)
			{
				boolean existeagenda = false;
				for(int i = 0; i< this.numeroactualagenda; i++)
				{
					if(this.agendas[i].getNombre().equalsIgnoreCase(contactopersona.getNombre()))
					{
						existeagenda = true;
					}
				}
				
				if(existeagenda == false)
				{
					System.out.println("Se ha registrado en la persona en la agenda");
					agendas[numeroactualagenda] = contactopersona;
					numeroactualagenda ++;
					ContactoIsertado = true;
				}
				else {
					System.out.println("El contacto ya existe en la agenda");
				}

			}
			else {
				System.out.println("La agenda no admite más contactos");
			}
		}
		
		return ContactoIsertado;
	}
	public boolean registrarContactoEmpresa(Contacto contactoempresa)
	{
		boolean ContactoIsertado = false;
		if(this.agendas != null)
		{
			if(this.numeroactualagenda >= 0 && this.numeroactualagenda < this.nunmaxagenda)
			{
				boolean existeagenda = false;
				for(int i = 0; i< this.numeroactualagenda; i++)
				{
					if(this.agendas[i].getNombre().equalsIgnoreCase(contactoempresa.getNombre()))
					{
						existeagenda = true;
					}
				}
				
				if(existeagenda == false)
				{
					System.out.println("Se ha registrado en la persona en la agenda");
					agendas[numeroactualagenda] = contactoempresa;
					numeroactualagenda ++;
					ContactoIsertado = true;
				}
				else {
					System.out.println("El contacto ya existe en la agenda");
				}

			}
			else {
				System.out.println("La agenda no admite más contactos");
			}
		}
		
		return ContactoIsertado;
	}
	
	public boolean eliminarContacto(String nombre)
	{
		boolean isRemoved = false;
		if(this.agendas != null)
		{
			if(this.numeroactualagenda > 0)
			{
				int pos = -1;
				for(int i = 0; i < this.numeroactualagenda; i++)
				{
					if(this.agendas[i] != null)
					{
						if(this.agendas[i].getNombre().equalsIgnoreCase(nombre))
						{
							this.agendas[i] = null;
							isRemoved = true;
							numeroactualagenda --;
							pos = i;
						}
					}
				}
				
				for(int i = pos; i < this.agendas.length-1; i++)
				{
					this.agendas[i] = this.agendas[i+1];
				}
				this.agendas[agendas.length-1] = null;
				
				
			}
			else {
				System.out.println("La coleccion esta vacia");
			}	
		}
		
		return isRemoved;
	}
	
	
	public Contacto encontrarPornombre(String nombre)
	{
		Contacto t = null;
		
		for(int i = 0; i < this.numeroactualagenda; i++)
		{
			if(this.agendas[i].getNombre().equalsIgnoreCase(nombre))
			{
				t = agendas[i];
			}
		}
		
		return t;
	}

	public boolean IndicarsielContactoexiste(String nombre)
	{
		boolean ContactoEncontrado = false;
		if(this.agendas != null)
		{
			if(this.numeroactualagenda >= 0 && this.numeroactualagenda < this.nunmaxagenda)
			{
				boolean existeagenda = false;
				for(int i = 0; i< this.numeroactualagenda; i++)
				{
					if(this.agendas[i].getNombre().equalsIgnoreCase(nombre))
					{
						existeagenda = true;
					}
				}
				
				if(existeagenda == false)
				{
					System.out.println("El contacto no existe en la agenda");
				}
				else {
					System.out.println("El contacto existe en la agenda");
				}

			}
			else {
				System.out.println("La agenda no admite más contactos");
			}
		}
		
		return ContactoEncontrado;
	}
	
	public boolean buscarContacto(String nombre) {
	    boolean contactoEncontrado = false;

	    if (this.agendas != null) {
	        if (this.numeroactualagenda >= 0 && this.numeroactualagenda < this.nunmaxagenda) {
	            boolean existeAgenda = false;

	            for (int i = 0; i < this.numeroactualagenda; i++) {
	                if (this.agendas[i].getNombre().equalsIgnoreCase(nombre)) {
	                    existeAgenda = true;
	                    contactoEncontrado = true; 
	                    System.out.println("Contacto encontrado:");
	                    System.out.println(this.agendas[i].toString());
	                    break; 
	                }
	            }

	            if (!existeAgenda) {
	                System.out.println("El contacto no existe en la agenda");
	            }
	        } else {
	            System.out.println("La agenda no admite más contactos");
	        }
	    }

	    return contactoEncontrado;
	}
	
	
	
}