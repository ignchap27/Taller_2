package LoaderHamburguesas;

import java.util.List;

import Modelo.Combos;
import Modelo.Ingredientes;
import Modelo.Pedido;
import Modelo.Platos;

public class Restaurante {

	List<Platos> platos;
	List<Ingredientes> ingredientes;
	List<Combos> combos;
	List<Pedido> pedidos;
	
	public Restaurante(List<Platos> platos, List<Ingredientes> ingredientes, List<Combos>combos, List<Pedido> pedidos){
		this.platos = platos;
		this.ingredientes = ingredientes;
		this.combos = combos;
		this.pedidos = pedidos;
	}
	
	public List<Platos> darPlatos() {
		return platos;
	}
	public List<Combos> darCombos() {
		return combos;
	}
	public List<Ingredientes> daringredientes() {
		return ingredientes;
	}
	public void agregar_pedido(Pedido pedido){
		this.pedidos.add(pedido);
	}
	public List<Pedido> darListaPedidos() {
		return pedidos;
	}
	public Combos look_for_combo(List<Combos> combos_lista, String nombre_combo) {
		Combos combo_buscado = null;

		for (int i = combos_lista.size() - 1; i >= 0; i--)
		{
			Combos combo = combos_lista.get(i);
			if (combo.dar_nombre().equals(nombre_combo))
			{
				combo_buscado = combo;
			}
		}
		return combo_buscado;
		}
	public Platos look_for_plato(List<Platos> platos_lista, String nombre_plato) {
		Platos plato_buscado = null;

		for (int i = platos_lista.size() - 1; i >= 0; i--)
		{
			Platos plato = platos_lista.get(i);
			if (plato.dar_nombre().equals(nombre_plato))
			{
				plato_buscado = plato;
			}
		}

		return plato_buscado;
		}
	public Ingredientes look_for_ingrediente(List<Ingredientes> ingredientes_lista, String nombre_ingrediente) {
		Ingredientes ing_buscado = null;

		for (int i = ingredientes_lista.size() - 1; i >= 0; i--)
		{
			Ingredientes ingrediente = ingredientes_lista.get(i);
			if (ingrediente.dar_nombre().equals(nombre_ingrediente))
			{
				ing_buscado = ingrediente;
			}
		}

		return ing_buscado;
		}
	public Pedido look_for_pedido(List<Pedido> pedidos_lista, int id_pedido) {
		for(int i = 0; i<pedidos_lista.size(); i++)	{
			Pedido pedido_buscado = pedidos_lista.get(i);
			int id_buscado = pedido_buscado.dar_id();
			if(id_buscado == id_pedido) {
				return pedido_buscado;
			}
		}
		return null;
	}
}
