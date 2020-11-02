package polimorfismo.zoo;

public class Preguica extends Animal{

	public Preguica(String nome) {
		super(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("ZZZZzzzzzZZ");
	}
	
	public void escalarArvore() {
		System.out.println("Não");
	}

}
