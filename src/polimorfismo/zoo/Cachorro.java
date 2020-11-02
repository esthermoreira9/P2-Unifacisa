package polimorfismo.zoo;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome);
	}
	
	public void correr() {
		System.out.println("Cachorro correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au");
	}

}
