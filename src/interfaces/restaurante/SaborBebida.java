package interfaces.restaurante;

public enum SaborBebida {
	
	SUCO(5.5), REFRIGERANTE(4.2), AGUA(0), WHISKY(6.50);
	
	private double valor;
	
	private SaborBebida(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}

}
