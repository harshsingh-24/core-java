package loops;

public class TestSum {

	public static void main(String[] args) {
		
		double sum = 0;
		// 0.01 -> 1 ; 1 -> 1.01
		// Add 0.01, 0.02, .... 0.99, 1 to sum [50.5]
//		for (double i=0.01; i<=1.0; i = i+0.01) {
//			System.out.println(i);
//			sum += i;
//		}
		
		
		// Small to big in decimal -> More accurate
		// Big to small -> Less accurate
		// Finite precision arithmetic
		double currentValue = 0.01;
		for(int count=0; count < 100; count++) {
			sum += currentValue;
			currentValue += 0.01;
		}
		
		System.out.println("the sum is: " + sum);

	}

}
