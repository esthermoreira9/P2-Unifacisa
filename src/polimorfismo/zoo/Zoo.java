package polimorfismo.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> jaulas;
	
	public Zoo() {
		jaulas = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal a) {
		jaulas.add(a);
	}
	
	public void cutucarAnimais() {
		for(Animal animal : jaulas) {
			animal.emitirSom();
			if(animal instanceof Cachorro) {
				Cachorro cachorro = (Cachorro) animal;
				cachorro.correr();
			}
			else if(animal instanceof Cavalo) {
				Cavalo cavalo = (Cavalo) animal;
				cavalo.correr();
			}
			else if(animal instanceof Preguica) {
				Preguica preguica = (Preguica) animal;
				preguica.escalarArvore();
			}
		}
	}
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Animal("Zeus"));
		zoo.addAnimal(new Cachorro("Dora"));
		zoo.addAnimal(new Cavalo("Alazão"));
		zoo.addAnimal(new Preguica("Flash"));
		
		zoo.cutucarAnimais();
		
	}
	
}
