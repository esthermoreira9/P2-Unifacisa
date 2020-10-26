package polimorfismo.mk;

public class Kano extends Lutador {

	public Kano() {
		super("Kano");
	}
	
	@Override
	public void socar(Lutador l2) {
		if(l2 != null) {
			super.socar(l2);
			l2.vida -= 7;
		}
	}
	
	@Override
	public void lancarMagia(Lutador l2) {
		if(l2 != null) {
			super.lancarMagia(l2);
			l2.vida -= 6;
		}
	}
}
