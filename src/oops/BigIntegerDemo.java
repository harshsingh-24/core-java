package oops;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

	public static void main(String[] args) {
		
		// long, int , double
		BigInteger a = new BigInteger("9223372036854775807"); // LONG.MAX
		BigInteger b = new BigInteger("2");
		BigInteger c = a.multiply(b); // add, multiply, subtract, divide, remainder
		
		System.out.println(c);
		
		// Divide a ArithmeticException if result cannot be terminated
		// terminate the results properly - special divide
		
		BigDecimal d = new BigDecimal(1.0);
		BigDecimal e = new BigDecimal(3);
		BigDecimal f = d.divide(e, 20, BigDecimal.ROUND_UP);
		
		System.out.println(f);
	}
	


}
