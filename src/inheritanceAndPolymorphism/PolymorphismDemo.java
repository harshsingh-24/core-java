package inheritanceAndPolymorphism;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		// Display the properties of the object - Circle or Rectangle
		displayObject(new Circle(1, "red", false));
		displayObject(new Rectangle(1, 1, "black", true));

	}
	
	// Polymorphism means that a variable of supertype can refer to subtype object
	public static void displayObject(GeometricObject object) {
		System.out.println(" Created on "  + object.getDateCreated() + 
				". Color is: " + object.getColor());
	}

}
