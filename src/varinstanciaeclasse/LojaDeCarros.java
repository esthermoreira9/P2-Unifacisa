package varinstanciaeclasse;

public class LojaDeCarros {

	public static void main(String[] args) {
		
		Carro palio0 = new Carro("Pálio", "Fiat", 35000);
		Carro palio1 = new Carro("Pálio", "Fiat", "PRATEADA", 2, false, false, false, false, 35000);
		Carro civic = new Carro("Honda Civic", "Honda", "BRANCO", 4, true, true, true, true, 110000);
		Carro corolla = new Carro("Corolla", "Toyota", "BRANCO", 2, true, true, false, true, 110000);
		Carro gol = new Carro();
		
		System.out.println(palio0);
		System.out.println(palio1);
		System.out.println(civic);
		System.out.println(corolla);
		System.out.println(gol);
	}

}
