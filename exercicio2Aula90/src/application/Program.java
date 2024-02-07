package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double vect[] = new double[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.println("");
		System.out.println("Valores:");
		
		for (int i = 0; i<n; i++) {
			System.out.print(vect[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Soma: ");
		System.out.println(soma);
		System.out.println(" ");
		System.out.println("Media: ");
		System.out.println(media);

sc.close();
	}

}
