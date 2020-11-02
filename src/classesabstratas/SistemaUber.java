package classesabstratas;

import java.util.ArrayList;
import java.util.List;

public class SistemaUber {
	
	private List<Corrida> corridas;
	
	public SistemaUber() {
		this.corridas = new ArrayList<Corrida>();
	}
	
	public void addCorrida(Corrida corrida) {
		this.corridas.add(corrida);
	}
	
	public double getValorCorridas() {
		double valorTotal = 0;
		for(Corrida corrida: corridas)
			valorTotal += corrida.getValor();
		return valorTotal;
	}

}
