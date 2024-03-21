package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		// 2. The index of first and last character of string
		int low = 0;
		int high = s.length() - 1;
		boolean isPalindrome = true;
		
		// 3. Loop condition
		while(low < high) {
			if(s.charAt(low) != s.charAt(high)) {
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}
		
		
		// 4. Boolean check
		if(isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
	}

}
