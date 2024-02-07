package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.println("How many dollar will be bought? ");
		int quantity = sc.nextInt();
		
		System.out.print("Amount to be paid in reais = ");
		System.out.println(String.format("%.2f", CurrencyConverter.calc(price, quantity)));

		sc.close();
	}

}
