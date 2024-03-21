package mathCharStrings;

import introduction.Welcome;

public class SubstringsMethods {

	public static void main(String[] args) {
		
		String message = "Welcome to Java";
		// 1. substring(beginIndex) [beginIndex, end]
		System.out.println(message.substring(3));

		// 2. substring(beginIndex, endIndex) [beginIndex, endIndex - 1] 
		System.out.println(message.substring(3, 6));
		
		// 3. indexOf(ch) [First occurence] , else return -1
		System.out.println(message.indexOf('J'));

		// 4. indexOf(ch, fromIndex) [>=fromIndex]
		System.out.println(message.indexOf('e', 2));
		
		// 5. indexOf(string)
		System.out.println(message.indexOf("come"));
		
		// 6. indexOf(string, fromIndex) 
		System.out.println(message.indexOf("Java", 12));

		
		// 7. lastIndexOf(ch) -> the last occurance of character ch
		
		// 8. lastIndexOf(ch, fromIndex)
		
		// 9. lastIndexOf(string)
		
		// 10. lastIndexOf(string, fromIndex)
		
	}
	
}
