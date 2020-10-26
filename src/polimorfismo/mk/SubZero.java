package polimorfismo.mk;

public class SubZero extends Lutador {

	public SubZero() {
		super("Sub Zero");
	}
	
	@Override
	public void lancarMagia(Lutador l2) {
		if(l2 != null) {
			super.lancarMagia(l2);
			l2.vida -= 8;
		}
	}
	

}
