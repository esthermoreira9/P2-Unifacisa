package interfaces.restaurante;

public enum Tamanho {
	
	PEQUENO(0.0), MEDIO(2), GRANDE(2.8);
	
	private double valor;
	
	Tamanho(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

}
