package mathCharStrings;

public class MathFunctionExample {

	public static void main(String[] args) {
		
		// All the methods in the math class are static. You don't need 
		// an object to invoke methods. Directly use className.
		// 1. Trignometric Functions 
		
		// 1a. Radians to Degrees Conversion (We don't create an object for Math class)
		
		System.out.println(Math.toDegrees(Math.PI/ 2 )); // 90 degrees
		
		// 1b. Degrees to Radians Conversion
		
		System.out.println(Math.toRadians(30)); // Math.PI / 6
		
		// 1c. Sine (expects input in radian format)
		 
		System.out.println(Math.sin(Math.PI / 6)); // 0.5
		System.out.println(Math.sin(Math.toRadians(30)));
		
		// 1d. Inverse sine (asin)
		
		System.out.println(Math.asin(0.5));
		
		// 1e. tan function
		
		System.out.println(Math.tan(Math.PI / 2));
		
		
		// 2. Exponent Functions
		
		// 2a. exp(x) : e ^ x
		
		System.out.println(Math.E);
		System.out.println(Math.exp(3.5));
		
		// 2b. Natural Logarithm
		
		System.out.println(Math.log(3.5));
		
		// 2c. Logarith with base 10
		
		System.out.println(Math.log10(3.5));
		
		// 2d. pow(a, b) -> a ^ b
		
		System.out.println(Math.pow(2, 3));
		
		// 2e. Square Root -> sqrt(x)
		System.out.println(Math.sqrt(9));
		
		
		// 3. Rounding function
		
		// 3a. Round up to the nearest integer  2 < (2.5, 2.6) < 3
		
		System.out.println(Math.ceil(2.5)); // go towards right hand side integer
		
		// 3b. Round down to the nearest integer
		
		System.out.println(Math.floor(2.9));
		
		// 3c. Rounding to the closest integer. 2.1 -> 2, 2.9 -> 3, 2.5 -> (even integer), 3.5 (4)
		
		System.out.println(Math.rint(2.5)); // 2 [2, 3]
		System.out.println(Math.rint(3.5)); // 4 [3, 4]
		
		// 3d. Round function : (int)(Math.floor(x + 0.5)) -> x is float
		// (long)(Math.floor(x + 0.5) -> double
		
		System.out.println(Math.round(-2.0f)); // -2.0 + 0.5 -> -1.5 -> -2.0 -> -2
		System.out.println(Math.round(-2.6)); // -2.6 + 0.5 -> -2.1 [-3, -2] -> -3.0 -> -3L
		
		// 4. Service functions
		
		// 4a. Maximum function
		
		System.out.println(Math.max(2, 3));
		
		// 4b. Minimum Function
		System.out.println(Math.min(2, 3));
		
		// 4c. absolute function -> | x | 
		System.out.println(Math.abs(-2));
		System.out.println(Math.abs(-2.6));
		
		// 4d. Random function : [0.0 , 1.0) [0.0 -> 0.9999999999...]
		
		System.out.println(Math.random());
		
		
		
	}
	
}
