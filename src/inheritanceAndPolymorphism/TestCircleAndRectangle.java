package inheritanceAndPolymorphism;

public class TestCircleAndRectangle {

	public static void main(String[] args) {
		
		System.out.println("Circle: ");
		Circle circle = new Circle(1);
		System.out.println(circle.toString());
		System.out.println(circle.getColor());
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		System.out.println(circle.getDiameter());
		
		System.out.println("Rectangle: ");
		Rectangle rectangle = new Rectangle(2, 4);
		System.out.println(rectangle.toString());
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());
		
		
		System.out.println("Object toString Method");
		System.out.println(circle.toString()); // Object toString
		System.out.println(rectangle.toString());
		

	}

}
