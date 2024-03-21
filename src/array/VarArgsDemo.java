package array;

public class VarArgsDemo {

	public static void main(String[] args) {
		
		printMax(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
		printMax(34, 3, 3, 2, 56.5);
		printMax(new double[] {1, 2, 3, 4, 6, 7});
		
	}
	
	// Variable length argument list to the function or method
	public static void printMax(double... numbers) {
		
		if(numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		
		double result = numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(numbers[i] > result) 
				result = numbers[i];
		}
		
		System.out.println("Max is: " + result);
	}

}
