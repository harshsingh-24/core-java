package oops;

public class StringDemo {

	public static void main(String[] args) {
		// java treats a string literal as string object too
		String message = "Welcome to Java"; // new String("Welcome to Java")
		System.out.println(message);
		
		// array of characters
		char[] charArray = {'G', 'o', 'l', 'd'};
		String message2 = new String(charArray);
		System.out.println(message2);

		// Interned strings (s1, s3)
		String s1 = "Welcome to Java";
		String s2 = new String("Welcome to Java");
		String s3 = "Welcome to Java";
		
		System.out.println((s1 == s2));
		System.out.println(s1 == s3);
		
		
		// Replacing methods
		System.out.println("Welcome".replace('e', 'A'));
		System.out.println("Welcome".replaceFirst("e", "ABCDFF"));
		System.out.println("Welcome".replace("e", "ABC"));
		System.out.println("Welcome".replace("el", "AB"));
		
		// Splitting Strings
		String[] tokens = "Java#HTML#Perl#CSS".split("#");
		for(int i=0; i<tokens.length; i++) {
			System.out.print(tokens[i] + " ");
		}
		
		System.out.println();
		// Matching Strings using Regex  (Regular expressions)
		System.out.println("Java".matches("Java"));
		
		// All the strings that begin with Java followed by zero or more characters
		System.out.println("Java is fun".matches("Java.*"));
		System.out.println("Java is cool".matches("Java.*"));
		System.out.println("Java is powerful".matches("Java.*"));
		System.out.println("HTML is fun".matches("Java.*"));
		
		// Convert strings and arrays
		char[] chars = "Java".toCharArray();
		
		char[] dst = {'J', 'a', 'v', 'a', '1', '3', '0', '1'};
		"CS3720".getChars(2, 6, dst, 4);
		System.out.println(dst);
		
		
		
	}

}
