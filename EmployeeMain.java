package com.capgemini.Employeemanagement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// Array of object
		Employee list[] = new Employee[10];

		int counter = 0;

		// Employee ansar = new Employee(100, "Ansar", 1000,dateFormat.format(date));
		// System.out.println(ansar.toString());

		// list[0] = ansar;

		//System.out.println(list[0].toString());

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Add Employee ");
			System.out.println("Press 2 for Create New Employee List  ");
			System.out.println("Press 3 for Edit Employee ");
			System.out.println("Press 4 for Print maximum Salary Employee ");
			System.out.println("Press 5 for Print minimum Salary Employee ");
			System.out.println("Press 6 for Print Sort the Salary of Employee ");
			System.out.println("Press 7 for Print Sort the Name of Employee ");
			System.out.println("Press 8 exit");
			System.out.println("Press 9 for Display the List");
			int choice = sc.nextInt();

			if (choice == 1) {
				
				System.out.println("Enter the employee name");
				String name = sc.next();
				
				// System.out.println("choice "+choice);
				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				
				// taking the current date starts

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				// System.out.println(dateFormat.format(date));
				// current date logic ends

				String newdate = dateFormat.format(date);
				Employee employee = new Employee(id, name, salary, newdate);
				list[counter] = employee;
				counter = counter + 1;

			}

			else if (choice == 8) {
				// contiune--which will run with next iteration and skip the current iteration
				// break will end the loop
				break;
			} else if (choice == 9) {

				for (Employee e : list) {
					System.out.println(e);
				}
			} else {
				System.out.println("Wrong chocie try again");
			}

		}

	}

}
