package array;

import java.util.Scanner;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		
		// 1. Take array size as input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = input.nextInt();
		double[] numbers = new double[n]; // defining and creating the array
		double sum = 0;
		
		// 2. Intialisation of array

		System.out.println("Enter the numbers: ");
		for(int i=0; i<n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		// 3. Calculate average
		double average = sum / n;

		// 4. Find the number of elements greater than average
		int count = 0;
		for(int i=0; i<n; i++) {
			if(numbers[i] > average) {
				count++;
			}
		}
		
		System.out.println("Average is: " + average);
		System.out.println("Count is " + count);

	}

}
