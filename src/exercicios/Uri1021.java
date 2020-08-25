package exercicios;

import java.util.Scanner;

public class Uri1021 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		System.out.println("NOTAS: ");
		int cem = (int)valor/100;
		System.out.printf("%d nota(s) de R$ 100.00\n", cem);
		int cinq = (int)valor % 100 /50;
		System.out.printf("%d nota(s) de R$ 50.00\n", cinq);
		int vinte = (int)(valor%100) % 50 /20;
		System.out.printf("%d nota(s) de R$ 20.00\n", vinte);
		int dez = (int)((valor%100)% 50) % 20 /10;
		System.out.printf("%d notas de R$ 10.00\n", dez);
		int cinco = (int)(((valor%100)% 50)% 20)% 10 /5;
		System.out.printf("%d notas de R$ 5.00\n", cinco);
		int dois = (int)((((valor%100)%50)%20)%10)%5 /2;
		System.out.printf("%d notas de R$ 2.00\n", dois);
		
		System.out.println("MOEDAS: ");
		double moedas = (valor%1)*100;
		int moedasUmReal = (int)(((((valor%100) %50) %20) %10) %5) % 2;
		System.out.printf("%d moeda(s) de R$ 1.00\n", moedasUmReal);
		int moedasCinquenta = (int)moedas/50;
		System.out.printf("%d moeda(s) de R$ 0.50\n", moedasCinquenta);
		int moedasVinteCinco = (int) moedas%50 / 25;
		System.out.printf("%d moeda(s) de R$ 0.25\n", moedasVinteCinco);
		int moedasDez = (int)(moedas%50) % 25 /10;
		System.out.printf("%d moeda(s) de R$ 0.10\n", moedasDez);
		int moedasCinco = (int)((moedas % 50)% 25)%10 /5;
		System.out.printf("%d moeda(s) de R$ 0.05\n", moedasCinco);
		int moedasUm =(int)(((moedas % 50)% 25)% 10)% 5;
		System.out.printf("%d moeda(s) de R$ 0.01\n", moedasUm);
		
		
		
		
		sc.close();
	}
}
