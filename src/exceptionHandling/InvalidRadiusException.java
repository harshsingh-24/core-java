package exceptionHandling;

public class InvalidRadiusException extends Exception {

	private double radius;
	
	public InvalidRadiusException(double radius) {
		super("Invalid Radius: " + radius);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
		
}
