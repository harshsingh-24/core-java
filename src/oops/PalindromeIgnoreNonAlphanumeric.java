package oops;
import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a string
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		// Display result
		System.out.println("Ignoring nonalphanumeric characters, \n is " 
				+ s + " a palindrome? " + isPalindrome(s));
	}
	
	/**
	 * Return a true if a string is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		// Create a new string by eliminating non-alphanumeric characters
		String s1 = filter(s);
		
		// Create a new string that is the reversal of s1
		String s2 = reverse(s1);
		
		// Check if the reveral is the same as the original string or not
		return s2.equals(s1);
	}
	
	/** 
	 * Create a new String by eliminating non alphanumeric characters
	 * */
	public static String filter(String s) {
		// Create a string builder
		StringBuilder stringBuilder = new StringBuilder();
		
		// Examine each character in string to skip alphanumeric character
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				stringBuilder.append(s.charAt(i));
			}
		}
		return stringBuilder.toString();
	}
	
	/**
	 * Create a new String by reversing a specified string
	 */
	public static String reverse(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
	
}
