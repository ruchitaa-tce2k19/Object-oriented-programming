//Construct Object Oriented Program for method overloading and 
//constructor overloading 
package com.exercises;
import java.util.Scanner;

public class Doctor1 {
	int doctor_id;
	int dept_floor;
	String name;

	Doctor1(String doc_name, int id) {
		dept_floor = 2;
		name = doc_name;
		doctor_id = id;
	}

	Doctor1(int floor, String doc_name, int id) {
		dept_floor = floor;
		name = doc_name;
		doctor_id = id;
	}

	boolean verify(int id, String name) {
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

	boolean verify(int id) {
		int ida[] = { 57, 61, 74, 83, 109 };
		for (int i = 0; i < ida.length; i++) {
			if (id == ida[i])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name1 = sc.nextLine();
		System.out.println("Enter id : ");
		int id1 = sc.nextInt();
		String name2 = "CHRIS TAUB";
		int id2 = 13;
		Doctor1 ob1 = new Doctor1(name1, id1);
		Doctor1 ob2 = new Doctor1(4, name2, id2);
		boolean avail1 = ob1.verify(id1, name1);
		boolean avail2 = ob2.verify(id2);
		System.out.println("It is " + avail1 + " that Doctor 1 is available");
		System.out.println("It is " + avail2 + " that Doctor 2 is available");
	}
}