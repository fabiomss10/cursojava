package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		double altura[] = new double[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		 double somaDasAlturas = 0.0;
	        for (int i = 0; i < n; i++) {
	            somaDasAlturas += altura[i];
	        }	
		
		System.out.printf("Altura média: %.2f%n", (somaDasAlturas / n));
		
		double menores = 0.0;
		
		for (int i = 0; i<n ; i++) {
			if (idades[i] < 16) {
				menores++;
			}
		}
		
		System.out.println("Pessoas com menos de 16 anos: " + (menores/n) * 100 + "%");
		
		for (int i=0;i<n;i++) {
			if (idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
