package oops;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		System.out.println(n + "! is \n" + factorial(n));
		
	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		
		// logic -> n! = (n) * (n - 1) * (n - 2) * (n - 3) ... 2 * 1
		for(int i=1; i<=n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		
		return result;
	}

}
