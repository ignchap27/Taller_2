package Modelo;

public class Ingredientes extends Pedido{
	String nombre;
	int precio;
	public Ingredientes(String nombre, int precio)
	{
		super(null, 0, null, null);
		this.nombre = nombre;
		this.precio = precio;
	}
	public String dar_nombre() {
		return nombre;
	}
	public int dar_precio() {
		return precio;
	}
	
}
