package polimorfismo.zoo;

public class Cavalo extends Animal {

	public Cavalo(String nome) {
		super(nome);
	}
	
	public void correr() {
		System.out.println("Cavalo trotando");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Innnnriririri");
	}

}
