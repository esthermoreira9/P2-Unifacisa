package interfaces.mk;

import java.util.Random;

public class MortalKombat {

	private Random rand = new Random();
	private Lutador l1, l2;
	protected Lutador lVencedor;
	
	public MortalKombat(Lutador l1, Lutador l2) {
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public void fight() {
		while(l1.getVida() > 0 && l2.getVida() > 0) {
			Lutador lAtacante = sorteiaLutador(l1, l2);
			Lutador lApanhando = null;
			if(l1 == lAtacante) 
				lApanhando = l2;
			else 
				lApanhando = l1;
			
			golpear(lAtacante, lApanhando);
		}
		if(l1.getVida() > 0)
			lVencedor = l1;
		else
			lVencedor = l2;
	}
	
	private Lutador sorteiaLutador(Lutador l1, Lutador l2) {
		double num = rand.nextDouble();
		if(num <= 0.5)
			return l1;
		else
			return l2;
	}
	
	private void golpear(Lutador lAtacante, Lutador lApanhando) {
		double num = rand.nextDouble();
		if(num <= 0.25)
			lAtacante.socar(lApanhando);
		else if(num <= 0.5)
			lAtacante.chutar(lApanhando);
		else if(num <= 0.75) {
			if(lAtacante instanceof Atirador) {
				Atirador lAtirador = (Atirador) lAtacante;
				lAtirador.atirar(lApanhando);
			}else {
				golpear(lAtacante, lApanhando);
			}
		}
		else {
			if(lAtacante instanceof Bruxo) {
				Bruxo lBruxo = (Bruxo) lAtacante;
				lBruxo.lancarMagia(lApanhando);
			}else {
				golpear(lAtacante, lApanhando);
			}
		}
			
	}
}
