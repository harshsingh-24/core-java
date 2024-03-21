package array;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		
		int list[] = {45, 50, 69, 70, 79, 2, 4, 7, 10, 11};
		
		Arrays.sort(list);
		
		System.out.println(Arrays.toString(list));
		
		System.out.println(Arrays.binarySearch(list, 11));
		System.out.println(Arrays.binarySearch(list, 12));
		
		// Equals
		int[] list2 = {2, 3, 4, 5};
		int[] list3 = {2, 3, 4, 5};
		int[] list4 = {2, 3, 4, 6};
		
		System.out.println(Arrays.equals(list2, list3));
		System.out.println(Arrays.equals(list2, list4));
	}

}
