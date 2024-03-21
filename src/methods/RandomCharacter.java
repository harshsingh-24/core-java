package methods;

public class RandomCharacter {

	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z'); 
	}
	
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z'); 
	}
	
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9'); 
	}
	
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF'); 
	}
	
	// generalised code
	public static char getRandomCharacter(char ch1, char ch2) {
		// [0, 1) * 26 -> [0, 26) + 'a'(97) -> (char)[97, 123) -> 100.99999 -> 100 -> d
		
		// a -> 97, b -> 98, c -> 99, d -> 100
		
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1)); 
	}
}
