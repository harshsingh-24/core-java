package inheritanceAndPolymorphism;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(new Object());
		m(new Person());
		m(new Student());
		m(new GraduateStudent()); // Person, Student, Hex String
	}
	
	// short b = 4;
	// Primitive Rule - int a = b; // Implicit Casting
	// b = (short)a; // explicit casting
	
	// Object o = new Circle(); 
	// Student s = (Student)o; // explicit casting
	
	// Polymorphism -> Actual Type ka method should be executed
	public static void m(Object x) { // Object x = new Person()
		System.out.println(x.toString()); // actual type
		
		// matching(declared type) - is decided at compile time
		// binding(actual type) - is decided at runtime
	}

}

// Object <- Person <- Student <- GraduateStudent

class GraduateStudent extends Student {
	
}

class Student extends Person {
	
	public String toString() {
		return "Student";
	}
}

class Person extends Object {

	public String toString() {
		return "Person";
	}
}
