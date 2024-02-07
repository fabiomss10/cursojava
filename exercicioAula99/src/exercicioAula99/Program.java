package exercicioAula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
				
		List<Employee> employees = new ArrayList<>();
		
		
		for (int i = 0 ; i < n ; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.println("Id: ");
			int id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		
		

		
		
		
		
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : employees) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
