package entities;

public class Student {
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;

	public double finalNote() {
		return firstNote + secondNote + thirdNote;
	}

	

	public String approbation() {
		if (finalNote() > 60.00) {
			return "PASS";
		} else {
			return "FAILED\nMISSING " + (60.00 - finalNote()) + " POINTS";
		}
	}
	
	
	
	
	public String toString() {
		return name +
				"\n" +
				String.format("%.2f%n", firstNote) +
				String.format("%.2f%n", secondNote)+
				String.format("%.2f%n", thirdNote);
	}

}
