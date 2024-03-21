package oops;

public class Course {

	// Data Fields - name, list of students, number of students
	private String courseName;
	private String[] students = new String[100]; //null, null .. null
	private int numberOfStudents; // 0
	
	// Constructors
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	// Getters and Setters

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// Methods
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		// Exercise - one implementation
		for (int i = 0; i < getNumberOfStudents(); i++) {
			if (students[i].equals(student)) {
				// swapping
				String temp = students[i];
				students[i] = students[getNumberOfStudents() - 1]; // 5, 9 -> null
				students[getNumberOfStudents() - 1] = temp;
				break;
			}
		}
		students[getNumberOfStudents() - 1] = null;
		numberOfStudents--;
	}

}
