package classesabstratas;

public class UberPool extends UberX{
	
	private int numPassageiros;
	
	public UberPool(double km, int numPassageiros) {
		super(km);
		this.numPassageiros = numPassageiros;
	}

	@Override
	public double getValor() {
		return super.getValor() / numPassageiros;
	}
	
	

}
