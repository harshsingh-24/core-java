package inheritanceAndPolymorphism;

// Constructor Chaining
// Object <- Person1 <- Employee <- Faculty

public class Faculty extends Employee {
	
	public static void main(String[] args) {
		new Faculty(); // crating a Faculty Object
	}
	
	public Faculty() {
		System.out.println("4. Perform Faculty tasks");
	}
	
}

class Employee extends Person1 {
	public Employee() {
		this("2. Invoke Employee's Overloaded Constructor");
		System.out.println("3. Performs Employee's tasks");
	}
	
	public Employee(String s) {
		System.out.println(s);
	}
}

class Person1 {
	public Person1() {
		System.out.println("1. Perform Person's tasks");
	}
}
