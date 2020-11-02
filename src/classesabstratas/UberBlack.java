package classesabstratas;

public class UberBlack extends UberX{

	public UberBlack(double km) {
		super(km);
	}
	
	@Override
	public double getValor() {
		return 1.1 * super.getValor();
	}
	

}
