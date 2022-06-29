package com.exercises;
//AGGREGATION: Department can exist without any outpatients 
class DoctorOutPatients {
	public static class Department {
		String dept;

		public Department(String dept) {
			this.dept = dept;
		}

		public String toString() {
			return dept;
		}
	}

	public static class Out_Patients {
		String name;
		Department dept;

		public Out_Patients(String name, Department dept) {
			this.name = name;
			this.dept = dept;
		}

		public String toString() {
			return name + " " + dept.toString();
		}
	}

	public static void main(String[] args) {
		Department[] dept = { new Department("Nephrology"), new Department("Oncology"), new Department("Cardiology") };
		Out_Patients[] list = { new Out_Patients("Patient1", dept[0]), new Out_Patients("Patient2", dept[1]),
				new Out_Patients("Patient3", dept[2]) };
		for (Out_Patients x : list)
			System.out.println(x);
	}
}