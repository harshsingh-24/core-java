package array;
import java.util.Arrays;

public class MultiDimDemo {
	
	public static void main(String[] args) {
		
		// 1. Random array
		int[][] matrix = new int[10][10];
		
		for(int row=0; row < matrix.length; row++) {
			for(int col=0; col < matrix.length; col++) {
				matrix[row][col] = (int)(Math.random() * 100);
			}
		}
		
		// 2. Display array
		for(int row = 0; row < matrix.length; row++) {
			System.out.println(Arrays.toString(matrix[row]));
		}
		
	}
	
}
