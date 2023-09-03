package Modelo;

public class Bebidas extends Pedido{

	String nombre;
	int precio;
	
	public Bebidas(String nombre, int precio){
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
