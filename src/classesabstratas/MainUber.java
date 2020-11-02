package classesabstratas;

public class MainUber {

	public static void main(String[] args) {
		SistemaUber uber = new SistemaUber();
		uber.addCorrida(new UberX(5));
		uber.addCorrida(new UberBlack(8));
		uber.addCorrida(new UberXVip(3.4));
		uber.addCorrida(new UberPool(15.0, 3));
		
		System.out.printf("Valor total: %.2f", uber.getValorCorridas());

	}

}
