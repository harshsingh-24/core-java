package oops;

public class WrapperAndPrimitiveConversionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer intObject = 2; // is equivalent to new Integer(2) : autoboxing
		
		int i = 1; // is equivalent to i = 1; : autounboxing
		
		Integer[] intArray = {1, 2, 3}; // automatically boxed into object
		// new Integer(1), new Integer(2), new Integer(3)
		System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2]);
		
		// Automatically unboxed into primitive integer values
 		
	}

}
