package loops;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		
		// Sentinel controlled loop
		Scanner input = new Scanner(System.in);
		int data = 0; 
		
		int sum = 0;
		do {
			System.out.println("Enter an integer (0 if you want to terminate): ");
			data = input.nextInt(); 
			
			sum += data;
		} while(data != 0);
		
		System.out.println("The sum is: " + sum);

	}

}
