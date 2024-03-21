package arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] numbers = {6, 4, 1, 2, 3, 3.5};
		Arrays.sort(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		System.out.println(Arrays.binarySearch(numbers, 4.5));
		
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		
		System.out.println(Arrays.equals(list1, list2));
		System.out.println(Arrays.equals(list1, list3));
		
	}

}
