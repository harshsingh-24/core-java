package mathCharStrings;

import java.util.Scanner;

public class StringMethodsExample {

	public static void main(String[] args) {
		
		// All the methods in string class are instance methods.
		// message -> reference variable 
		String message = "Welcome to Java"; // new String("Welcome to Java") -> 0-indexed strings
		
		// 1. Length of the string
		
		System.out.println(message.length()); // 15

		// 2. charAt(index)
		
		System.out.println(message.charAt(3)); // c
//		System.out.println(message.charAt(16)); // 
		
		
		// 3.  Concatenating String, Strings are of immutable data type 
		String s2 = " Harsh Singh";
		String fullString = message.concat(s2);
		System.out.println(fullString);
		System.out.println(message);

		// 4. Converting strings
		System.out.println(message.toLowerCase());
		
		// 5. Uppercase
		System.out.println(message.toUpperCase());

		
		// 6. Input of a string

		// Token-based input (nextInt(), nextLong(), next()) [2 3 4124244435 ]
		// Line-based input (nextLine()) -> [Enter] Harsh Singh Jadon
		
		// Caution: Do not use a line based input after a token based input
		
		/* int a = input.nextInt(); // 213456 (Enter) < - whitespace chars
		 * String b = input.nextLine(); // (Enter) -> "" 
		 * 
		 * 
		 */

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter one word: ");
		String s1 = input.next();    // Harsh (Enter)
		System.out.println("Enter a line: ");
		String s4 = input.nextLine(); // (Enter)
//		String s4 = input.next();
//		String s3 = input.next();
		
		System.out.println(s1.length());
		System.out.println(s4.length());
		
		System.out.println("End of program");
		
		
	}

}
