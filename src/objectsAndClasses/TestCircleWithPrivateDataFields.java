package objectsAndClasses;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		
		Circle myCircle = new Circle();
		System.out.println("The area of circle with radius = " + myCircle.getRadius() + 
							" is " + myCircle.getArea());
		
		// Increase my circle radius by 10%
		myCircle.setRadius(myCircle.getRadius() * 1.10);
		System.out.println("The area of circle with radius = " + myCircle.getRadius() + 
				" is " + myCircle.getArea());
		
		System.out.println("The number of objects created: " + Circle.getNumberOfObjects());
		
	}

}
