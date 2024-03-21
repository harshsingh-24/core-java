package oops;


public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3 constructors in string builder class
		
		// construct an empty string builder with capacity of 16
		StringBuilder stringBuilder = new StringBuilder();
		
		// construct an empty string builder with capacity of specific capacity
//		StringBuilder stringBuilder2 = new StringBuilder(50);
		
		// construct a string builder with given string with length 15
//		StringBuilder stringBuilder3 = new StringBuilder("Welcome to Java");
		
		
		// Modifying Strings in the StringBuilder
		
		// append
		stringBuilder.append("Welcome");
		stringBuilder.append(' ');
		stringBuilder.append("to");
		stringBuilder.append(' ');
		stringBuilder.append("Java");
		
		// overloaded insertion methods - int, charArray, char, double, float, long, String
//		stringBuilder.insert(11, "HTML and ");
		
		// toString
		System.out.println(stringBuilder.toString());
		
		// delete characters from string
//		stringBuilder.delete(8, 11); // to delete from pos 8, to pos 10
//		System.out.println(stringBuilder.toString());
		
//		stringBuilder.deleteCharAt(8); // to delete from pos 8, to pos 10
//		System.out.println(stringBuilder.toString());
		
//		stringBuilder.reverse(); // to delete from pos 8, to pos 10
//		System.out.println(stringBuilder.toString());
		
//		stringBuilder.replace(11, 15, "HTML"); // to delete from pos 8, to pos 10
//		System.out.println(stringBuilder.toString());
		
//		stringBuilder.setCharAt(0, 'w'); // to delete from pos 8, to pos 10
//		System.out.println(stringBuilder.toString());
		
		// capacity of stringBuilder
		System.out.println(stringBuilder.capacity());
		
		// length of string
		System.out.println(stringBuilder.length());
		
		// set a new length for builder
//		stringBuilder.setLength(50);
//		System.out.println(stringBuilder.length());
		
		// substring from String
		System.out.println(stringBuilder.substring(5));
		System.out.println(stringBuilder.substring(5, 12)); // 5 to 11 index
		
		// trim to Size is used for reducing storage space
		System.out.println(stringBuilder.capacity());
		stringBuilder.trimToSize();
		System.out.println(stringBuilder.capacity());
	
		
		
	}

}
