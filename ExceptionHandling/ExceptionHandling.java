package com.exercises; 
//Construct Object Oriented Program to demonstrate exception handling. 
//Create a custom Built Exception

import java.util.Scanner;

class DoctorException extends Exception{
	double docSalary;
	DoctorException(double salary){
		docSalary = salary;
	}
}

public class ExceptionHandling {
	static void calcSalary (double salary) throws DoctorException{
		if(salary>100000.0) 
			throw new DoctorException(salary);
		else {
			System.out.println("Salary within the limit");
		}
	}

	public static void main(String[] args) {		
		for(int i=1;i<6;i++) {
			System.out.print("Enter the salary of Doctor " + i + ":");
			Scanner sc = new Scanner(System.in);	
			double DoctorSalary = sc.nextDouble();				
			try {
			calcSalary (DoctorSalary);
		}catch (DoctorException e) {			 
			System.out.println("Doctors's salary exceeding the limit " +e);
		}
	}
  }
}
