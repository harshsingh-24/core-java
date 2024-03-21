package mathCharStrings;

import java.util.Scanner;

public class LotteryUsingStrings {

	public static void main(String[] args) {
		
		/** User: 23 , Lottery : 32 
		 * 
		 * Problem Statement: 
		Suppose you want to develop a program to play Lottery. The program generates a random two-digit number, 
		prompts the user to enter a two-digit number, and determines whether the user wins according 
		to the following rule:
	1. If the user input matches the lottery number in the exact order, the award is $10,000.
	2. If all the digits in the user input match all the digits in the lottery number, the award is $3,000.
	3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
		 * 
		 */
		
		// 1. Generate a lottery as two digit string -> random (TWO DIGITS)
			int randomDigit1 = (int)(Math.random() * 10); // [0,0, 1.0) -> [0.0, 10.0)
			int randomDigit2 = (int)(Math.random() * 10); 
			String lottery = "" + randomDigit1 + randomDigit2; 
		
		
		// 2. Prompt the user to enter a guess
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your guess (two digits): ");
			String guess = input.nextLine(); //23:
	
		// 3. Get digits from guess
			char guessDigit1 = guess.charAt(0);
			char guessDigit2 = guess.charAt(1); // guess[1]
	
		// 3 b. Get digits from lottery
			char lotteryDigit1 = lottery.charAt(0);
			char lotteryDigit2 = lottery.charAt(1);
		
			System.out.println("Lottery is: " + lottery);
		// 4. Check the guess
			if(guess.equals(lottery)) {
				System.out.println("Exact Match: prize $10,000");
			} else if(guessDigit1 == randomDigit2 && guessDigit2 == randomDigit1) {
				System.out.println("Match all the digits: $3,000");
			} else if(guessDigit1 == lotteryDigit1 
					|| guessDigit1 == lotteryDigit2
					|| guessDigit2 == lotteryDigit1
					|| guessDigit2 == lotteryDigit2) {
				System.out.println("Match of one digit: $1,000");
			} else {
				System.out.println("No match: $0");
			}
		
	}

}
