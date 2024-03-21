package selections;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
	
	public static void main(String[] args) {
		
		// 1. Initialise Scanner library for input from console
		Scanner input = new Scanner(System.in);
		
		// 2. User will input weight in pounds and height in inches
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = input.nextDouble();
		
		// 3. 1 pound = 0.45359237 kgs and 1 inch = 0.0254 metres
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METRES_PER_INCH = 0.0254;
		
		// 4. Convert pounds into kgs and inches into metres
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMetres = height * METRES_PER_INCH;
		
		// 5. BMI = weight / (height * height)
		double bmi = weightInKilograms / (heightInMetres * heightInMetres);
	
		// 6. Console Output
		System.out.println("BMI is " + bmi);
		if(bmi < 18.5) {
			System.out.println("Underweight");
		} else if(bmi < 25) {   
			System.out.println("Normal");
		} else if(bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
		
	}
	
}
