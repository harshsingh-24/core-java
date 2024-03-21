package selections;

import java.util.Scanner;

// (Integer)5

public class AdditionQuiz {
	
	public static void main(String[] args) {
		
		// Generate two random numbers - number1 and number2 (single-digit) [0 - 9] (% 10)
		// System.currentTimeMillis() -> (long - 10^12-10^13)
		
		int number1 = (int)(System.currentTimeMillis() % 10);  // long - 8 bytes , int - 4 bytes
		
		int number2 = (int)((System.currentTimeMillis() + 15) % 10);
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What is " + number1 + " + " + number2 + " ? ");
		
		int answer = input.nextInt();
		
		// Is number1 + number2 = answer? 
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " 
				+ (number1 + number2 == answer));
		
		// 12343546543646 -> int 
	}
	
}
