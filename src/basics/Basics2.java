package basics;

import java.util.Scanner;

public class Basics2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		double num3 = entrada.nextDouble();
		
		double media = (num1 + num2 + num3) / 3;
		
		System.out.printf("Média: %.1f ", media);

		entrada.close();
	}

}
