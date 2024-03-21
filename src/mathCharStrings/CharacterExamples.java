package mathCharStrings;

public class CharacterExamples {

	public static void main(String[] args) {
		
		// Character class (Math class) -> static Methods -> java.lang -> No object are needed
		
		// 1. isDigit : digit or not
		System.out.println(Character.isDigit('a')); // false
		System.out.println(Character.isDigit('0')); // true
		
		
		// 2. isLetter: letter or not
		System.out.println(Character.isLetter('a')); // true
		
		// 3. isLetterOrDigit : letter or digit or not
		System.out.println(Character.isLetterOrDigit('a'));
		System.out.println(Character.isLetterOrDigit('%'));
		
		// 4. isLowerCase: 'a' <= ch <= 'z'
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));
		
		//5.  isUpperCase: 'A' <= ch <= 'Z'
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('A'));
		
		// 6. toLowerCase: convert any letter into lowercase
		System.out.println(Character.toLowerCase('A'));

		
		// 7. toUpperCase: convert to Uppercase
		System.out.println(Character.toUpperCase('a'));

		
	}
	
}
