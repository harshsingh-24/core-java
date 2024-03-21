package selections;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		
		// A number is odd or even
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int number = input.nextInt();
		
		// number - 7 (Single-If)
		
		if(number % 2 == 0) {
			System.out.println("Even");
		}
		
		if(number % 2 != 0) {
			System.out.println("Odd");
		}
	}
	
}
