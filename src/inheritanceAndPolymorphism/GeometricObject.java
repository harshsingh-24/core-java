package inheritanceAndPolymorphism;

import java.util.Date;

// Object(toString) <- Geometric Object(toString) <- Circle (toString)

public class GeometricObject {

	// Data Fields
	private String color = "white"; // by default 
	private boolean filled; // by default - false
	private Date dateCreated;
	
	// Constructors
	public GeometricObject() {
		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		this.dateCreated = new Date();
	}
	
	// Getters and Setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	// Any additional methods
	// Return a string representation of this object
	
	
	// Object: public String toString()
	
	public String toString1() {
		return "created on " + dateCreated + "\ncolor: " + color + 
				" and filled: " + filled;
	}
}
