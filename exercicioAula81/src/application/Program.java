package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.println("Enter account holder: ");
		String name = sc.next();
		sc.nextLine();

		System.out.println("Is there na initial deposit (n/y)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(numberAccount, name, balance);
		} else {
			account = new Account(numberAccount, name, 0);
		}

		System.out.println("Account data:");
		System.out.println(account.toString());

		System.out.println("");

		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());

		sc.close();
	}

}
