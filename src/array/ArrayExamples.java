package array;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class ArrayExamples {

	public static void main(String[] args) {
		
		// 1. Declare and created the array
		double[] myList = new double[10];
		
		// 2. Initialising arrays with random values
		for(int i=0; i<myList.length; i++) {
			myList[i] = Math.random() * 100; // [0, 100)
		}
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		
		// 3. Initialize the array with input values [0 - 9]
//		Scanner inputScanner = new Scanner(System.in);
//		for(int i=0; i<myList.length; i++) {
//			myList[i] = inputScanner.nextDouble();
//		}
//		
//		// 4. Displaying arrays
//		for(int i=0; i<myList.length; i++) {
//			System.out.print(myList[i] + " ");
//		}
		
		
		// 5. Summing all elements
		double total = 0;
		for(int i=0; i<myList.length; i++) { // >= length(10)
			total += myList[i];
		}
		
		System.out.println("Total is: " + total);
		
		// 6. Finding the max element
		double max = myList[0];
		for(int i=1; i<myList.length; i++) {
			if(myList[i] > max) {
				max = myList[i];
			}
		}
		
		System.out.println("Max is:" + max);
		
		// 7. Random shuffling of the array
	
		for(int i=0; i<myList.length; i++) {
			
			int j = (int)(Math.random() * myList.length); // [0, 1) -> [0, 10)
			
			double temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
			
		}
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i] + " ");
		}
		
		// 8. Shift elements to left by one
		double temp = myList[0];
		
		// Shift elements left by one
		for(int i=1; i<myList.length; i++) {
			myList[i-1] = myList[i]; // 0 <- 1, 1 <- 2, ...9 <- 0
		}
		myList[myList.length - 1] = temp;
		
		// 9. String
		String[] stringArray = {"January", "Feb", "Decemeber"};

	}

}
