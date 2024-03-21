class Circle {
	int radius;
	Circle(double d) {
		d = d;
	}
	public String getRadius() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getArea() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Test {
	public static void main(String[] args) {
		Circle myCircle = new Circle(5.0);
		printCircle(myCircle);
	}

	public static void printCircle(Circle c) {
		System.out.println("The area of the circle of radius " + 
				c.getRadius() + " is " + c.getArea());
	}
}



