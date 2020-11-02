package classesabstratas;

public abstract class Corrida {
	
	protected double km;
	protected double precoBase;
	protected double precoKm;
	
	public Corrida(double km, double precoBase, double precoKm) {
		this.km = km;
		this.precoBase = precoBase;
		this.precoKm = precoKm;
	}
	
	public abstract double getValor();
}
