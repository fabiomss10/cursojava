package entities;

public class Account {
	private int numberAccount;
	private String name;
	private double balance;

	// CONSTRUTORES
	public Account(int numberAccount, String name, double balance) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.balance = balance;
	}

	public Account(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
	    this.balance = balance;
	}

	public void deposit(double x) {
		balance += x;
	}

	public void withdraw(double x) {
		balance -= x - 5;
	}

	public String toString() {
		return "Account " + getNumberAccount() + ", Holder: " + getName() + ", Balance: $" + getBalance();
	}

}
