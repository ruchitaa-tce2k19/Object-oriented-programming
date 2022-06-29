package com.exercises; 
//Develop Object Oriented Program to demonstrate inheritance and
//overriding super class methods
public class Hospital {
	int dept_id;
	String dept_name;

	Hospital(int id, String name) {
		dept_id = id;
		dept_name = name;
	}

	void display(int id, String name) {
		System.out.println("Deapartment Id: " + id);
		System.out.println("Deapartment name: " + name);
	}

	public static void main(String[] args) { 
		Hospital hos_obj1 = new Hospital(1, "Nephrology");
		Hospital hos_obj2 = new Hospital(2, "Oncology");
		Hospital hos_obj3 = new Hospital(3, "Neurology");
		Hospital hos_obj4 = new Hospital(4, "Cardiology");
		Hospital hos_obj5 = new Hospital(5, "Pediatrician");
		Doc doc_obj1 = new Doc(hos_obj1.dept_id, hos_obj1.dept_name, 57, "HOUSE");
		Doc doc_obj2 = new Doc(hos_obj2.dept_id, hos_obj2.dept_name, 61, "WILSON");
		Doc doc_obj3 = new Doc(hos_obj3.dept_id, hos_obj3.dept_name, 74, "FOREMAN");
		Doc doc_obj4 = new Doc(hos_obj4.dept_id, hos_obj4.dept_name, 83, "CHASE");
		Doc doc_obj5 = new Doc(hos_obj5.dept_id, hos_obj5.dept_name, 109, "CAMERON");
		doc_obj1.display(hos_obj1.dept_id, hos_obj1.dept_name, doc_obj1.doc_id, doc_obj1.doc_name);
		doc_obj2.display(hos_obj2.dept_id, hos_obj2.dept_name, doc_obj2.doc_id, doc_obj2.doc_name);
		doc_obj3.display(hos_obj3.dept_id, hos_obj3.dept_name, doc_obj3.doc_id, doc_obj3.doc_name);
		doc_obj4.display(hos_obj4.dept_id, hos_obj4.dept_name, doc_obj4.doc_id, doc_obj4.doc_name);
		doc_obj5.display(hos_obj5.dept_id, hos_obj5.dept_name, doc_obj5.doc_id, doc_obj5.doc_name);
	}
}

class Doc extends Hospital {
	Doc(int dept_id, String dept_name, int doc_id, String doc_name) {
		super(dept_id, dept_name);
		this.doc_id = doc_id;
		this.doc_name = doc_name; 
	}

	int doc_id;
	String doc_name;

	void display(int dept_id, String dept_name, int doc_id, String doc_name) {
		super.display(dept_id, dept_name);
		System.out.println("Doctor Id:" + doc_id);
		System.out.println("Doctor name:" + doc_name);
	}
}
