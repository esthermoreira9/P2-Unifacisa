package basics;

import java.util.Scanner;

public class Basics4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		int cont = 0;
		
		for(int i = num1; i < num2; i++) {
			if (i % 4 == 0){
				cont += 1;
			}
	}
		
		System.out.println("A quantidade de multiplos de 4 é: " + cont);

		entrada.close();
}
}
