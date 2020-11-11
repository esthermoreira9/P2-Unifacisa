package interfaces.restaurante;

public enum Proteina {
	
	PICANHA(20.0), MAMINHA(15.0), FRANGO(15.0), LINGUICA(10.0); 

	private double valor;
	
	Proteina(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
}
