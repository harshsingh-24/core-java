package exceptionHandling;

public class TestCircleWithCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new CircleWithCustomException(-5);
		}
		catch(InvalidRadiusException ex) {
			System.out.println(ex);
		}
		System.out.println("Ends here");
	}
	
}

class CircleWithCustomException {
	private double radius;
	
	private static int numberOfObjects = 0;
	
	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);
	}
	
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public void setRadius(double newRadius) throws InvalidRadiusException {
		if(newRadius >= 0) {
			radius = newRadius;
		} else 
			throw new InvalidRadiusException(newRadius);
	}
}
