package oops2;

public class BMI {
	
	// Data fields
	private String name;
	private int age;
	private double weight; // in pounds
	private double height; // in inches
	
	// Constants -> final, static, private
	private static final double KILOGRAMS_PER_POUND = 0.45359;
	private static final double METERS_PER_INCH = 0.0254;

	// Constructors
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// Getters and Setters

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}
	
	// Methods
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / 
				((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return bmi;
	}
	
	public String getStatus() {
		double bmi = getBMI();
		if(bmi < 18.5) 
			return "Underweight";
		else if(bmi < 25) 
			return "Normal";
		else if(bmi < 30) 
			return "Overweight";
		else
			return "Obese";
	}
	
}
