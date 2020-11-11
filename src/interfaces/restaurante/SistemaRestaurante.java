package interfaces.restaurante;

import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
	
	private int mesas;
	private List<Cliente> clientes;
	
	public SistemaRestaurante() {
		this.mesas = 0;
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void adicionarCliente() {
		Cliente c = new Cliente(mesas);
		this.clientes.add(c);
		this.mesas++;
	}
	
	public void adicionarPedido(int mesa, Item item) {
		Cliente cliente = this.clientes.get(mesa);
		cliente.addPedido(item);
	}
	
	public void removerPedido(int mesa, Item item) {
		Cliente cliente = this.clientes.get(mesa);
		cliente.removerPedido(item);
	}
	
	public double computarPagamentoCliente(int mesa) {
		Cliente cliente = this.clientes.get(mesa);
		return cliente.getConta();
	}
	
	public void receberPagamentoCliente(int mesa, double pagamento) {
		double valorConta = computarPagamentoCliente(mesa);
		if(pagamento >= valorConta) {
			this.clientes.remove(mesa);
			this.mesas--;
			
			while(mesa < this.mesas) {
				Cliente c = this.clientes.get(mesa);
				int mesaAtual = c.getMesa();
				mesaAtual--;
				c.setMesa(mesaAtual);
				mesa++;
			}
		}
	}

}
