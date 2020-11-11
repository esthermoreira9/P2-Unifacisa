package interfaces.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private int mesa;
	
	private List<Item> pedidos;
	
	public Cliente(int mesa) {
		this.mesa = mesa;
		this.pedidos = new ArrayList<Item>();
	}
	
	public double getConta() {
		double total = 0;
		for(Item item : pedidos) {
			total += item.getPreco();
		}
		return total;
	}
	
	public void addPedido(Item item) {
		pedidos.add(item);
	}
	
	public void removerPedido(Item item) {
		pedidos.remove(item);
	}

	public int getMesa() {
		return mesa;
	}
	
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	
}
