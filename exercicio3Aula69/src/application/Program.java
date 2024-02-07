package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		
		System.out.println("Enter the name of student and your notes:");
		student.name = sc.nextLine();
		student.firstNote = sc.nextDouble();
		student.secondNote = sc.nextDouble();
		student.thirdNote = sc.nextDouble();
		
		System.out.println();
		
		System.out.println(student);
		System.out.print(student.approbation());
		
		
		
		
		sc.close();
	}

}
