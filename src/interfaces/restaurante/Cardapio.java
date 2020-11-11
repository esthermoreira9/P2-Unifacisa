package interfaces.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	
	private List<Bebida> bebidas;
	private List<Refeicao> refeicoes;
	
	public Cardapio() {
		SaborBebida[] sabores = SaborBebida.values();
		Tamanho[] tamanhos = Tamanho.values();
		
		for(SaborBebida sabor : sabores) {
			for(Tamanho tamanho : tamanhos) {
				this.bebidas.add(new Bebida(tamanho, sabor));
			}
		}
		
		this.refeicoes = new ArrayList<Refeicao>();
		Proteina[] proteinas = Proteina.values();
		Carboidrato[] carboidratos = Carboidrato.values();
		
		for(Proteina proteina : proteinas) {
			for(Carboidrato carboidrato : carboidratos) {
				this.refeicoes.add(new Refeicao(proteina, carboidrato));
			}
		}
	}
	
	public List<Bebida> getBebidas() {
		return bebidas;
	}

	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	public List<Item> getCardapio(){
		List<Item> cardapio = new ArrayList<Item>();
		cardapio.addAll(refeicoes);
		cardapio.addAll(bebidas);
		return cardapio;
	}

}
