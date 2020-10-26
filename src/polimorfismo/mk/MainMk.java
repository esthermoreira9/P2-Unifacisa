package polimorfismo.mk;

public class MainMk {

	public static void main(String[] args) {
		int numLuta = 1;
		
		Lutador l1 = new Jax();
		Lutador l2 = new Rayden();
		Lutador vencedor1 = luta(l1, l2, numLuta);

		numLuta++;
		l1 = new NightWolf();
		l2 = new LiuKang();
		
		numLuta++;
		l1 = new LiuKang();
		l2 = new NightWolf();
		Lutador vencedor2 = luta(l1, l2, numLuta);
		
		numLuta++;
		l1 = new SubZero();
		l2 = new Sonia();
		Lutador vencedor3 = luta(l1, l2, numLuta);
		
		numLuta++;
		l1 = new JohnnyCage();
		l2 = new Kano();
		Lutador vencedor4 = luta(l1, l2, numLuta);
		
		System.out.println("\n Semi-Finais \n" );
		// semi-finais
		
		numLuta++;
		l1 = vencedor1;
		l2 = vencedor2;
		Lutador vencedorSemi1 = luta(l1, l2, numLuta);
		
		numLuta++;
		l1 = vencedor3;
		l2 = vencedor4;
		Lutador vencedorSemi2 = luta(l1, l2, numLuta);
		
		System.out.println("\n Finais \n" );
		numLuta++;
		l1 = vencedorSemi1;
		l2 = vencedorSemi2;
		Lutador vencedorFinal = luta(l1, l2, numLuta);
		
	}
	
	public static Lutador luta(Lutador l1, Lutador l2, int numLuta) {
		System.out.println("Luta "+numLuta+": "+l1+" vs "+l2);
		MortalKombat mk = new MortalKombat(l1, l2);
		mk.fight();
		Lutador vencedor = mk.lVencedor;
		System.out.println("Vencedor "+numLuta+": "+mk.lVencedor);
		System.out.println("############# \n");
		return vencedor;
	}

}
