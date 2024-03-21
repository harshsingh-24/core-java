package elementaryProgramming;

import java.util.Scanner;
public class TestArrayArguments {
	public static void main(String[] args) {	
		
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				count++;
//				System.out.println(i * j);
			}
		}
		System.out.println(count);

	}

	public static void m(int number, int[] numbers) {
		number = 1001; // Assign a new value to number 
		numbers[0] = 5555; // Assign a new value to numbers[0]
	}
}


