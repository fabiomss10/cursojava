package entities;

public class CurrencyConverter {
	public static final double TAX = 6.00;
	
	public static double calc(double price, double quantity) {
		return (price * quantity) + ((price * quantity) * (TAX / 100));
	}
	
}
