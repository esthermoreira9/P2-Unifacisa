package interfaces.mk;

public class SubZero extends Lutador implements Bruxo{

	public SubZero() {
		super("Sub Zero");
	}
	
	@Override
	public void lancarMagia(Lutador l2) {
		if(l2 != null) {
			l2.vida -= 8;
		}
	}
	

}
