package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int numeros[] = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < 0) {
				System.out.println(numeros[i]);
			} 
		}
		
		
		
		sc.close();	
		
	}

}