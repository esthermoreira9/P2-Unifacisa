package basics;

import java.util.Scanner;

public class Basics6 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner (System.in);
		
		int cont1 = 1;
		int soma = 0;
		int num = 0;
		
		while(cont1 <= 50) {
			num = entrada.nextInt();
			cont1 += 1;
			if(num % 3 == 0) {
				soma += num;
			}
		}
		System.out.println(soma);
		
		entrada.close();

	}

}
