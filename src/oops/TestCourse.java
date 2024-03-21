package oops;

public class TestCourse {

	public static void main(String[] args) {
		
		Course course1 = new Course("Introduction to Core Java");
		Course course2 = new Course("Data Structures");
		
		course1.addStudent("Harsh singh");
		course1.addStudent("Sujal");
		course1.addStudent("Shubham");
		
		course2.addStudent("Harshit");
		course2.addStudent("Dhoni");
		course2.addStudent("Virat Kohli");
		course2.addStudent("Rohit Sharma");
		
		System.out.println("Number of students in course1: " + 
				course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i=0; i<course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}
		
		System.out.println();
		System.out.println("Number of students in course2: " + 
				course2.getNumberOfStudents());
		
		System.out.println("After dropping: ");
		course2.dropStudent("Rohit Sharma");
		System.out.println();
		System.out.println("Number of students in course2: " + 
				course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for(int i=0; i<course2.getNumberOfStudents(); i++) {
			System.out.print(students2[i] + ", ");
		}
		
//		course2.dropStudent("Hardik Pandya");
	}

}
