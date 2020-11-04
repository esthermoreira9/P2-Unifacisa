package interfaces.mk;

public class Rayden extends Lutador implements Bruxo{

	public Rayden() {
		super("Rayden");
	}
	
	@Override
	public void lancarMagia(Lutador l2) {
		if(l2 != null) {
			l2.vida -= 19;
		}
	}

}
