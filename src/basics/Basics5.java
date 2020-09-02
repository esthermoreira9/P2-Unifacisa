package basics;

import java.util.Scanner;

public class Basics5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int cont1 = 1;
		int cont2 = 0;
		
		while(cont1 <= 25) {
			int num = entrada.nextInt();
			cont1 += 1;
			if(num >= 0 && num % 2 == 0) {
				cont2 += 1;
			}
		}
		System.out.println(cont2);
		
		entrada.close();
	}

}
