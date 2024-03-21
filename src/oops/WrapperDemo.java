package oops;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer integer1 = 450000; // Backend : new Integer(450000)
		Integer integer2 = 6700000; // Constructor : Integer(value:int)
		
		// final static constants
		System.out.println(Integer.MAX_VALUE); // maximum integer value (2^31 - 1)
		System.out.println(Integer.MIN_VALUE); // minimum integer value (-2^31)
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		// Returning a value for the wrapper object
		System.out.println(integer1.byteValue()); // (byte)(450000) : -128 to 127
		System.out.println(integer1.shortValue());
		System.out.println(integer1.longValue());
		System.out.println(integer1.floatValue());
		System.out.println(integer1.doubleValue());
		
		// Comparison ( == ), 1, 0, -1 
		System.out.println(integer1.compareTo(integer2));
		
		// static valueOf method: string -> Object
		Integer integer3 = Integer.valueOf("124455"); // string -> Integer object
		
		// static two overloaded Parsing methods - normal, radix version
		
		System.out.println(Integer.parseInt("123456")); // string -> int primitive type
		
		System.out.println();
		System.out.println(Integer.parseInt("11", 2)); // convert 11 in binary to decimal value
		System.out.println(Integer.parseInt("12", 8)); // convert 12 in octal to decimal
		System.out.println(Integer.parseInt("13", 10)); // convert 13 in decimal to decimal
		System.out.println(Integer.parseInt("1A", 16)); // convert 1A in hexadecimal to decimal
	}

}
