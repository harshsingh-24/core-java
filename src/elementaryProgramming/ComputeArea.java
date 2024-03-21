package elementaryProgramming;

import java.util.Scanner;
//import java.xyz.Mouse;
//import java.util.Keyboard;
//import java.util.Mouse;
//import java.util.Harsh;

public class ComputeArea {
	
	public static void main(String[] args) {
        
		final double PI = 3.14159; // named constant
		
		// Step 1: Read in radius (radius, area)
		double radius; 
		double area;
		
		
		System.out.println("Enter Radius: ");
		Scanner input = new Scanner(System.in);
		
		radius = input.nextDouble();
		
		area = PI * radius * radius;
		
		// Step 3: Display the Result
		System.out.println("The area is " + area);
	}
	
}
