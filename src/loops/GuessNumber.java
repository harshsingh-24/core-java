package loops;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		// 1. Generate a random number to be guessed [0 - 100]
		int number = (int)(Math.random() * 101); // [0.0, 101)
		
		// 2. Prompt the user to enter number
		Scanner input = new Scanner(System.in);
		
		int guess = -1;
		// 3. one-iteration (incremental)
		while (guess != number) {
			System.out.println("Enter a guess between 0 and 100: ");
			guess = input.nextInt();
			
			// checking 
			if (guess == number) {
				System.out.println("Yes. Correct.");
			} else if (guess < number) {
				System.out.println("Your guess is too low.");
			} else {
				System.out.println("Your guess is too high.");
			}
		}
 		
		// End of loop

	}
}
