package inheritanceAndPolymorphism;

public class DynamicBinding {
	public static void main(String[] args) {
		m(new Object());
		m(new Person());
		m(new Student());
		m(new GraduateStudent());
		Person p = new Student(); 
		System.out.println(" Method: " + p.CustomMethod());
		System.out.println("Here: " + p.name); // Why is this happening?
	}

	public static void m(Object x) {
		System.out.println(x.toString());
		if(x instanceof Person) {
			System.out.println(((Person)x).CustomMethod());
		}
	}

}

class GraduateStudent extends Student {
	@Override
	public String toString() {
		return "GraduateStudent";
	}
	@Override
	public String CustomMethod() {
		return "Custom Method";
	}
}

class Student extends Person {
	String name="Student";
	@Override
	public String toString() {
		return "Student";
	}

	@Override
	public String CustomMethod() {
		return "Custom Method of Student";

	}
}

class Person {
	String name="Person";

	@Override
	public String toString() {
		return "Person";
	}

	public String CustomMethod() {
		return "Custom Method";

	}
}