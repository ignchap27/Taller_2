package Modelo;

public class Platos extends Pedido {
	String nombre;
	int precio;
	
	public Platos(String nombre, int precio)
	{
		super(null, 0, null, null);
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String dar_nombre() {
		return nombre;
	}
		
	public int dar_precio(){
		return precio;
	}
	
}
