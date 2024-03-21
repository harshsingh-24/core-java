package objectsAndClasses;

// No main method inside it - normal class
public class Circle {
	
	// Data Fields - instance(object) variable
	private double radius; // default value of 0, boolean -> false, char -> \u0000, String, Person -> null
	
	/** The number of objects created **/
	private static int numberOfObjects = 0;
	
	// Constructors -> Initialise when object is created
	// Empty Constructor or No-arg constructor
	
	// By default - empty constructor will be present
	// If you have atleast one constructor defined, then default constructor
	// won't be created for you.
	
	Circle() { 
//		radius = 1.0;
//		numberOfObjects++;
		this(1.0); // I am passing a paramter here
	}
	
//	 Parameterized Constructor
	Circle(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	
	// Methods - instance methods
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}
	
	// Getter Method
	public double getRadius() {
		return radius;
	}
	
	// Setter Method
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	// Static method -> Getter Number of Objects
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

}
