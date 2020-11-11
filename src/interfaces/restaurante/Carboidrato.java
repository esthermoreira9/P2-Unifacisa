package interfaces.restaurante;

public enum Carboidrato {
	
	FEIJAO(2.0), ARROZ(1.5), PURE(1.5), BATATA(1);
	
	private double valor;
	
	Carboidrato(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}

}
