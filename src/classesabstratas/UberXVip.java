package classesabstratas;

public class UberXVip extends UberX {

	public UberXVip(double km) {
		super(km);
	}
	
	@Override
	public double getValor() {
		return 0.9 * super.getValor();
	}

}
