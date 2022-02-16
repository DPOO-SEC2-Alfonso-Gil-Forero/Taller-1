package Modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante 
{

	
	public Restaurante()
	{
		
	}
	
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 
	{
		
	}
	
	
	public void cerrarYGuardarPedido()
	{
		
	}
	
	
	public Pedido getPedidoEnCurso()
	{
		
	}
	
	
	public ArrayList<Producto> getMenuBase()
	{
		
	}
	
	
	public ArrayList<Ingrediente> getIngredientes()
	{
		
	}
	
	
	public void cargarInformacionRestaurante (File archivoIngredientes, File archivoMenu, File archivoCombos) throws FileNotFoundException
	{
		cargarIngredientes(archivoIngredientes);
		cargarMenu (archivoMenu);
		cargarCombos (archivoCombos);
	}
	
	
	private void cargarIngredientes (File archivoIngredientes) throws FileNotFoundException
	{
		File doc =
		  new File("C:\\data\\ingredientes.txt");
		try (Scanner obj = new Scanner(doc)) 
		{
			while (obj.hasNextLine())
			    System.out.println(obj.nextLine());
		}
	}
	
	
	private void cargarMenu (File archivoMenu) throws FileNotFoundException
	{
		File doc =
		  new File("C:\\data\\menu.txt");
		try (Scanner obj = new Scanner(doc)) 
		{
			while (obj.hasNextLine())
			    System.out.println(obj.nextLine());
		}
	}
	
	
	private void cargarCombos (File archivoCombos) throws FileNotFoundException
	{
		File doc =
		  new File("C:\\data\\combos.txt");
		try (Scanner obj = new Scanner(doc)) 
		{
			while (obj.hasNextLine())
			    System.out.println(obj.nextLine());
		}
	}
	
	
	
	
}
