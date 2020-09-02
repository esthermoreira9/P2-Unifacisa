package basics;

import java.util.Scanner;

public class Basics7 {

	public static void main(String[] args) {

		Scanner entrada =  new Scanner (System.in);
		
		int num = entrada.nextInt();
		int cont = 0;
		int pares = 0;
		
		while(num != 100) {
			num = entrada.nextInt();
			if(num % 2 == 0 && num != 100) {
				pares += num;
				cont += 1;
			}
		}
		int media = pares / cont;
		System.out.println(media);
		
		entrada.close();
	}
	
}
