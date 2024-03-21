package objectsAndClasses;

import java.util.Scanner;

public class TestCircle {

	public static void main(String[] args) {
		
		// Variable storing the reference to the Object -> Object (new)
//		Scanner inputScanner = new Scanner(System.in);
		Circle circle1 = new Circle(); // new -> create objects
		// circle1 -> reference Variable
		// Circle -> reference class
		
		System.out.println("Radius: " + circle1.radius); // access data fields
		System.out.println("Area: " + circle1.getArea()); // invoking a method
		System.out.println("Perimeter: " + circle1.getPerimeter()); // invoking a method
		
		Circle circle2 = new Circle(25.0); // new -> create objects
		
		System.out.println("Radius: " + circle2.radius); // access data fields
		System.out.println("Area: " + circle2.getArea()); // invoking a method
		System.out.println("Perimeter: " + circle2.getPerimeter()); // invoking a method
		
		Circle circle3 = new Circle(125.0); // new -> create objects
		
		System.out.println("Radius: " + circle3.radius); // access data fields
		System.out.println("Area: " + circle3.getArea()); // invoking a method
		System.out.println("Perimeter: " + circle3.getPerimeter()); // invoking a method
	}

}
