package classesabstratas;

public class UberX extends Corrida {

	public UberX(double km) {
		super(km, 4, 1.2);
	}
	
	@Override
	public double getValor() {
		return super.precoBase + super.km*super.precoKm;
	}

}
