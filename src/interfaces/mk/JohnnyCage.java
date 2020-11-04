package interfaces.mk;

public class JohnnyCage extends Lutador{

	public JohnnyCage() {
		super("Johnny Cage");
	}
	
	@Override
	public void chutar(Lutador l2) {
		if(l2 != null) {
			super.chutar(l2);
			l2.vida -= 6;
		}
	}
	
	@Override
	public void socar(Lutador l2) {
		if(l2 != null) {
			super.socar(l2);
			l2.vida -= 10;
		}
	}
}
