package basics;

import java.util.Scanner;

public class Basics3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		String produto = entrada.next();
		double preco = entrada.nextDouble();
		
		if(preco > 0 && preco < 100) {
			preco *= 0.95;
		}else if (preco >= 100 && preco < 500) {
			preco *= 0.95;
		}else {
			preco *= 0.85;
		}
		
		System.out.printf("Produto: %s, valor com desconto: %.2f", produto, preco);
		
		entrada.close();
	}

}
