package com.exercises;
//Develop Object Oriented Program for passing arrays and objects as
//arguments to method and returning objects from methods 
import java.util.Scanner;

public class Doctor3 {
	int doc_id;
	int dept_floor;
	String doc_name;

	Doctor3(int floor, String name, int id) {
		dept_floor = floor;
		doc_name = name;
		doc_id = id;
	}

	Doctor3 newdoc(int ids[], String name, Doctor3 ob, int id, int floor) {
		int j = 0;
		int a;
		for (int i = 0; i < ids.length; ++i) {
			if (id == ids[i]) {
				j = 1;
				break;
			}
		}
		if (j == 1)
			System.out.println("The doctor has been already appointed");
		else {
			System.out.println("Newly appointed");
		}
		ob.doc_id = id;
		ob.doc_name = name;
		ob.dept_floor = floor;
		return ob;
	}

	boolean verify(int id, String name, int ids[], String names[]) {
		for (int i = 0; i < names.length; ++i) {
			if (name.equalsIgnoreCase(names[i]) && id == ids[i]) {
				return true;
			}
		}
		return false;
	}

	boolean verify(int id, int ids[]) {
		int flag=0;
		for (int i = 0; i < ids.length; i++) {
			if (id == ids[i]) {
				flag = 1;
				break;				
			}
		}
		if (flag== 1)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ids[] = { 57, 61, 74, 83, 109 };
		String names[] = { "HOUSE", "WILSON", "FOREMAN", "CHASE", "CAMERON" };
		Doctor3 ob = new Doctor3(0, "NULL", 0);
		System.out.println("Doctor 1 details ");
		System.out.println("Enter name : ");
		String name1 = sc.nextLine();
		System.out.println("Enter id : ");
		int id1 = sc.nextInt();
		System.out.println("Enter Floor assigned: ");
		int floor1 = sc.nextInt();
		Doctor3 ob1 = ob.newdoc(ids, name1, ob, id1, floor1);
		boolean avail1 = ob1.verify(ob1.doc_id, ob1.doc_name, ids, names);
		System.out.println("Doctor 2 details: ");
		System.out.println("Enter name : ");
		String name2 = sc.next();
		System.out.println("Enter id : ");
		int id2 = sc.nextInt();
		System.out.println("Enter Floor assigned: ");
		int floor2 = sc.nextInt();
		Doctor3 ob2 = ob.newdoc(ids, name2, ob, id2, floor2);
		boolean avail2 = ob2.verify(ob2.doc_id, ids);
		System.out.println("It is " + avail1 + " that Doctor 1 is available");
		System.out.println("It is " + avail2 + " that Doctor 2 is available");
	}
}