package elementaryProgramming;

import java.util.Scanner;

/* 
 *  converts a Fahrenheit degree to Celsius using the formula 
 *  	
 *  Celsius = (5/9)*(Fahrenheit - 32).
 *  
 *  100 degree F = 37.777778 C
 */


public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Fahrenheit: ");
		
		double fahrenheit = input.nextDouble();
		
		double celsius = (5D / 9) * (fahrenheit - 32);  // 0.9888888 -> 0
		
		System.out.println("Celsius is: " + celsius);

	}

}
