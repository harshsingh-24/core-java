package elementaryProgramming;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double randomDouble = 129.2633453454; // double : 8 bytes
		
		byte randomByte = 126;    // Byte: 1 byte
		
		int randomInt = randomByte ; // 4 bytes (Widening a data type) -> Casting
		
		byte randomInt2 = (byte)randomDouble; // 1 byte: Narrowing of data type (Explictly)
		
		System.out.println(randomInt2); // [-128 , 127] (Overflow of integers)
		
		// -128, -127, ...0 , 1,2 ... 127 -> -128 -> -127 -> -126
		
//		double randomDouble = 6.2356778788;
//		
//		byte randomByte = 126;
//		
//		int randomInt2 = randomByte;
//		
//		int randomInt = (int)randomDouble;
		
//		System.out.println(randomInt);
//		
//		System.out.println(randomDouble);
//		
//		System.out.println(randomInt2);
		
		
//		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); // 0.5
//		
//		System.out.println(1.0 - 0.9); // 0.1
		

	}

}
