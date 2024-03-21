package mathCharStrings;

import java.util.Scanner;

public class OrderTwoCities {
	
	public static void main(String[] args) {
		
		// Write a program that prompts user to enter two cities and displays them
		// in sorted order
		
		Scanner input = new Scanner(System.in);
		// 1. Take input from user (two cities)
		System.out.println("Enter first city: ");
		String city1 = input.nextLine();
		
		// 2. compare the cities and print on console
		String city2 = input.nextLine();
		
		if(city1.compareTo(city2) < 0) {
			System.out.println(city1 + " " + city2);
		} else {
			System.out.println(city2 + " " + city1);
		}
	}
	
}
