package selections;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		// To check whether a year is a leap year or not
		
		/*
		 * 1. Year should be divisible by 4
		 * 2. Year should not be divisible by 100
		 * 3. OR Year should be divisible by 400
		 */
		
		
		// 1. Define Scanner Class for input
		Scanner inputScanner = new Scanner(System.in);
		
		
		// 2. Take input year from user
		int year = inputScanner.nextInt();
		
		// 3. Evaluate conditions
		
		boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
		
		System.out.print(isLeapYear);
		
	}
	
}
