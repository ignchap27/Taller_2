package Modelo;

public class Combos extends Pedido {
	String nombre;
	float descuento;
	Platos hamburguesa;
	Platos papas;
	Platos gaseosa;
	int precio;
	
	public Combos(String nombre, float descuento, Platos hamburguesa, Platos papas, Platos gaseosa ){
		super(null, 0, null, null);
		this.nombre = nombre;
		this.descuento = descuento;
		this.hamburguesa = hamburguesa;
		this.papas = papas;
		this.gaseosa = gaseosa;
		this.precio = (int) ((int)((hamburguesa.precio + papas.precio + gaseosa.precio) * (1 - descuento)));
	}
	public String dar_nombre() {
		return nombre;
	}
	public float dar_descuento() {
		return descuento;
	}
	public Platos dar_hamburguesa() {
		return hamburguesa;
	}
	public Platos dar_papar () {
		return papas;
	}
	public Platos dar_gaseosa() {
		return gaseosa;
	}
	public int dar_precio() {
		return precio;
	}
	
}
