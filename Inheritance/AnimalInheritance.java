package Inheritance;
/*
 * Single inheritance is the simplest type of inheritance in java. 
 * In this, a class inherits the properties from a single class. 
 * The class which inherits is called the derived class or child class or 
 * subclass, while the class from which the derived class inherits is called 
 * base class or superclass or parent class.*/
class Animal {	 
	String name;
	public void eat() {
		System.out.println("I eat pedigree");
	}
} 
class Dog extends Animal {	 
	public void display() {
		System.out.println("My name is " + name);
	}
}

class AnimalInheritance {
	public static void main(String[] args) {		 
		Dog labrador = new Dog();		 
		labrador.name = "Sugar";
		labrador.display();		 
		labrador.eat();

	}
}
