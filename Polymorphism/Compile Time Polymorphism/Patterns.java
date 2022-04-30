/* 
 * Polymorphism in Java is a concept by which we can perform a single action in different ways.
 * Compile Time Polymorphism: Whenever an object is bound with their functionality at the compile-time, 
 * this is known as the compile-time polymorphism. At compile-time, java knows which method to call by 
 * checking the method signatures. So this is called compile-time polymorphism or static or early binding. 
 * Compile-time polymorphism is achieved through method overloading. Method Overloading says you can have 
 * more than one function with the same name in one class having a different prototype. Function overloading 
 * is one of the ways to achieve polymorphism but it depends on technology that which type of polymorphism we
 *  adopt. In java, we achieve function overloading at compile-Time. The following is an example where 
 *  compile-time polymorphism can be observed. 
*/
package Polymorphism;
import java.io.*;
import java.util.*;

public class Patterns {
	public static void display() {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
	}
	public static void display(String s) {
		for(int i=0;i<10;i++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Patterns p = new Patterns();
		p.display();
		System.out.println();
		System.out.println("Enter the pattern symbol: ");
		String s = sc.next();
		p.display(s);

	}

}
