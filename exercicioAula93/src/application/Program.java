package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent vect[] = new Rent[10];
		
		
		for (int i=0; i<n ;i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("email: ");
			String email = sc.next();
			System.out.print("room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
			
		}
		
		
		sc.close();
	}

}
