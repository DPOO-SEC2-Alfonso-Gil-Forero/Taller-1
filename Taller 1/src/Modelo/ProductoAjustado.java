package Modelo;

import java.util.ArrayList;
import java.util.List;

public class ProductoAjustado implements Producto
{

	
	private ProductoMenu base;
	
	private List<Ingrediente> agregados;
	
	private List<Ingrediente> eliminados;
	
	
	
	//Constructor
	
	public ProductoAjustado(ProductoMenu base) 
	{
		this.base = base;
		agregados = new ArrayList<Ingrediente>();
		eliminados = new ArrayList<Ingrediente>();
	}
	
	
	
	//Métodos
	
	public int getPrecio() {
		int precioBase = base.getPrecio();
		int precioExtra = 0;
		for (Ingrediente productoExtra : agregados) 
		{
			precioExtra += productoExtra.getCostoAdicional();
		}
		return precioBase + precioExtra;
	}

	public String getNombre() 
	{
		String cadena = base.getNombre();
		for (Ingrediente productoExtra : agregados) 
		{
			cadena += "Adición de : "+productoExtra.getNombre();
		}
		for (Ingrediente productoExtra : eliminados) 
		{
			cadena += "Sin : "+productoExtra.getNombre();
		}
		return cadena;
	}

	public String generarTextoFactura() 
	{
		return base.generarTextoFactura();
	}


	public void agregarIngrediente(Ingrediente nuevoIngrediente) 
	{
		agregados.add(nuevoIngrediente);
	}



	public void eliminarIngrediente(Ingrediente nuevoIngrediente) 
	{
		eliminados.add(nuevoIngrediente);
	}

}
