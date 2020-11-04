package interfaces.mk;

public class NightWolf extends Lutador implements Bruxo, Atirador {

	public NightWolf() {
		super("Night Wolf");
	}

	@Override
	public void atirar(Lutador l2) {
		if(l2 != null) {
			l2.vida -= 15;
		}
	}
	
	@Override
	public void lancarMagia(Lutador l2) {
		if(l2 != null) {
			l2.vida -= 16;
		}
	}
	
}
