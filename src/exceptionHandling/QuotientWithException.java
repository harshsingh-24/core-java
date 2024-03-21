package exceptionHandling;

import java.util.Scanner;

public class QuotientWithException {

	public static int quotient(int number1, int number2) {
		if(number2 == 0) 
			throw new ArithmeticException("Divisor cannot be zero");
		
		return (number1 / number2);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		try { // normal circumstances
			int result = quotient(number1, number2);
			System.out.println("Result is: " + result);
		}
		catch (ArithmeticException ex) {// exceptional circumstances
			System.out.println("Exception: an integer cannot be divided by zero");
		}
		
		System.out.println("Some important task that needs to be executed...");
 	}
	
}
