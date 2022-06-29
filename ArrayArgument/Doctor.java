package com.exercises; 
//Develop Object Oriented Program for passing arguments to a method
//and returning value from a method
import java.util.Scanner;

public class Doctor {
	static boolean verify(int id, String name) {
		int ids[] = { 57, 61, 74, 83, 109 };
		String names[] = { "HOUSE", "WILSON", "FOREMAN", "CHASE", "CAMERON" };
		boolean b = false;
		for (int i = 0; i < names.length; ++i) {
			if (name.equals(names[i]) && id == ids[i]) {
				b = true;
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the doctor:");
		String name = scan.nextLine();
		System.out.println("Enter the id of the doctor:");
		int id = scan.nextInt();
		boolean present = verify(id, name);
		System.out.println(present);
		scan.close();
	}
}
