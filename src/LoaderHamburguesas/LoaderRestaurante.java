package LoaderHamburguesas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Platos;
import Modelo.Ingredientes;
import Modelo.Pedido;
import Modelo.Bebidas;
import Modelo.Combos;

public class LoaderRestaurante {

	public static Restaurante cargar_archivos(String archivo_menu, String archivo_bebidas, String archivo_combos, String archivo_ingr) throws IOException, FileNotFoundException
	{
		List<Platos> platos = new ArrayList<>();
		List<Bebidas> bebidas = new ArrayList<>();
		List<Ingredientes> ingredientes = new ArrayList<>();
		List<Combos> combos = new ArrayList<>();
		List<Pedido> pedidos = new ArrayList<>();
		
		BufferedReader br_menu = new BufferedReader(new FileReader(archivo_menu));
		String linea_menu = br_menu.readLine();
		while(linea_menu != null)
		{
			String[] partes_menu = linea_menu.split(";");
			String nombre_plato = partes_menu[0];
			int precio = Integer.parseInt(partes_menu[1]);
			Platos plato = new Platos(nombre_plato, precio);
			platos.add(plato);
			linea_menu = br_menu.readLine();
			
		}
		
		BufferedReader br_bebidas = new BufferedReader(new FileReader(archivo_bebidas));
		String linea_bebidas = br_menu.readLine();
		while(linea_bebidas != null)
		{
			String[] partes_bebidas = linea_menu.split(";");
			String nombre_bebida = partes_bebidas[0];
			int precio = Integer.parseInt(partes_bebidas[1]);
			Bebidas bebida = new Bebidas(nombre_bebida, precio);
			bebidas.add(bebida);
			linea_menu = br_menu.readLine();
			
		}
		
		BufferedReader br_combos = new BufferedReader(new FileReader(archivo_combos));
		String linea_combos = br_combos.readLine();
		while(linea_combos != null)
		{
			String[] partes_combos = linea_combos.split(";");
			String nombre_combo = partes_combos[0];
			float descuento = (float) ((Integer.parseInt(partes_combos[1].replace("%", "")))*0.01);
			Platos hamburguesa = look_for_plato(platos, partes_combos[2]);
			Platos papas = look_for_plato(platos, partes_combos[3]);
			Bebidas gaseosa = look_for_bebida(bebidas, partes_combos[4]);
			Combos combo = new Combos(nombre_combo, descuento, hamburguesa, papas, gaseosa);
			combos.add(combo);
			linea_combos = br_combos.readLine();
		}
		
		BufferedReader br_ing = new BufferedReader(new FileReader(archivo_ingr));
		String linea_ing = br_ing.readLine();
		while(linea_ing != null)
		{
			String[] partes_ing = linea_ing.split(";");
			String nombre_ing = partes_ing[0];
			int precio = Integer.parseInt(partes_ing[1]);
			Ingredientes ingrediente = new Ingredientes(nombre_ing, precio);
			ingredientes.add(ingrediente);
			linea_ing = br_ing.readLine();
		}
		br_menu.close();
		br_bebidas.close();
		br_combos.close();
		br_ing.close();
		Restaurante restaurante = new Restaurante(platos, bebidas, ingredientes, combos, pedidos);
		return restaurante;
		
	}
	
	public static Bebidas look_for_bebida(List<Bebidas> bebidas_lista, String nombre_bebida) {
		Bebidas bebida_buscado = null;

		for (int i = bebidas_lista.size() - 1; i >= 0; i--)
		{
			Bebidas bebida = bebidas_lista.get(i);
			if (bebida.dar_nombre().equals(nombre_bebida))
			{
				bebida_buscado = bebida;
			}
		}
		return bebida_buscado;
		}

	public static Platos look_for_plato(List<Platos> platos_lista, String nombre_plato) {
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
	
}


