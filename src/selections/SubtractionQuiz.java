package selections;

import java.util.Scanner;

public class SubtractionQuiz {
	
	public static void main(String[] args) {
		
		// Generate two numbers number1 and number2 (randomly) with number1 >= number2 
		
		// 1. Math.random() -> [0.0, 1.0) * 10 -> [0.0, 10.0); 0.1 -> 0, 9.999 -> 9 
		
		int number1 = (int)(Math.random() * 10); // [0 - 9]
		int number2 = (int)(Math.random() * 10); // [0 - 9]
		
		// 2. If number1 < number2, swap number1 and number2
		if(number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// 3. Prompt the student to answer the Question
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is  " + number1 + " - " + number2 + " ?");
		int answer = input.nextInt();
		
		if(number1 - number2 == answer) {
			System.out.println("You are correct!!");
		} else {
			System.out.println("Wrong Answer");
			System.out.println("The correct answer is: " + (number1 - number2));
		}
		
	}
	
}
