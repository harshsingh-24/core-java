package inheritanceAndPolymorphism;

// extends - > Inheriting from parent


public class Circle extends GeometricObject {
	
	// Data fields
	private double radius; // by default - 0
	
	// Constructors
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	// Getters and Setters

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Custom Methods
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter() {
		return 2 * radius;
	}
	
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + 
				" and the radius is : " + radius);
		
	}
	
	// Overiding
	
	@Override
	public String toString1() {
		return "\n radius: " + radius;
	}

}
