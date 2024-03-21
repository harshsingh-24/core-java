package mathCharStrings;

import java.util.Scanner;

public class HexDigit2Dec {

	public static void main(String[] args) {
		/**
		 * The hexadecimal number system has 16 digits: 0–9, A–F. 
		 * The letters A, B, C, D, E, and F correspond to the decimal numbers 
		 * 10, 11, 12, 13, 14, and 15. 
		 * We now write a program that prompts the user to enter a hex digit 
		 * and display its corresponding decimal value.
		 */
		
		// 1. take input from user -> character
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a hex digit: ");
		String hexString = input.nextLine();
		
		// 2. Check if the hex string has exactly one character
		if(hexString.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		
		// 3. Display of decimal value corresponding to hex value
		char hexChar = hexString.charAt(0); // a, b, A, B
		
		// 3a. (smallcase, uppercase) -> uppercase letter
		char ch = Character.toUpperCase(hexChar);
		
		// 3b. Check the character range
		if(ch >= 'A' && ch <= 'F') {
			int value = ch - 'A' + 10; // B -> 66, A - 65, 1 + 10 -> 11
			System.out.println("the decimal value is : " + value);
		} else if(Character.isDigit(ch))  {
			// 0 and 9
//			int value = ch - '0'; //1 -> 48, 0 -> 47 ; (1)
			System.out.println("the decimal value is : " + ch);
		} else {
			System.out.println(ch + " is an invalid character or hex digit");
		}
		
		
	}

}
