package basics;

import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double num1 = entrada.nextDouble();
		double num2 = entrada.nextDouble();
		
		if(num1 > num2) {
			System.out.println("o maior é: " + num1);
		}
		else {
			System.out.println("o maior é: " + num2);
		}
		
		entrada.close();
	}

}
