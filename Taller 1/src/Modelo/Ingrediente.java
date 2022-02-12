package Modelo;

public class Ingrediente 
{

	//Atributos
	
	private String nombre;
	
	private int costoAdicional;
	
	
	//Constructor
	
	public Ingrediente(String nombre, int costoAdicional) 
	{
		this.nombre = nombre;
		this.costoAdicional = costoAdicional;
	}
	

	
	//Métodos
	
	
	public String getNombre() 
	{
		return nombre;
	}
	

	public int getCostoAdicional() 
	{
		return costoAdicional;
	}


}
