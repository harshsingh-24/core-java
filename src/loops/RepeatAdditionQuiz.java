package loops;

import java.util.Scanner;

public class RepeatAdditionQuiz {
	
	public static void main(String[] args) {
		// 2, 3
		int number1 = (int)(Math.random() * 10);
		
		int number2 = (int)(Math.random() * 10);
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + "?");
		int answer = inputScanner.nextInt();
		
		// while loop // 5, 5
		while(number1 + number2 != answer) {
			System.out.println("Wrong answer. Try again.");
			System.out.println("What is " + number1 + " + " + number2 + "?");
			answer = inputScanner.nextInt(); // changing - condition
		}
		
		System.out.println("You got it!!");
		
	}
	
}
