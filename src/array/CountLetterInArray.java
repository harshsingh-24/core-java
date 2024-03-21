package array;

import methods.RandomCharacter;

public class CountLetterInArray {

	public static void main(String[] args) {
		
		// Declare and create an array
		char[] chars = createArray(); // 100 size
		
		// Display the array
		System.out.println("The lowercase letters are: ");
		displayArray(chars);
		
		// Count the occurences of each letter
		int[] counts = countLetters(chars);
		
		// Display Counts
		System.out.println("The occurences of each letter are: ");
		displayCounts(counts);

	}
	
	/** Create and array of characters */
	public static char[] createArray() {
		// Declare an array of characters and create it 
		char[] chars = new char[100];
		
		// Create lowercase letters randomly and assign them to the array
		for(int i=0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowerCaseLetter();
		}
		
		return chars;
	}
	
	public static void displayArray(char[] chars) {
		// Display the characters in the array - 10 per line
		
		for(int i=0; i<chars.length; i++) {
			if((i + 1) % 10 == 0) {
				System.out.println(chars[i]);
			} else {
				System.out.print(chars[i] + " ");
			}
		}
	}
	
	public static int[] countLetters(char[] chars) {
		// Declare and create an array of 26 integers
		int[] counts = new int[26];
		
		for(int i=0; i<chars.length; i++) {
			counts[chars[i] - 'a']++; // a -> 0, b -> 1, c -> 2... z->25
		}
		
		return counts;
	}
	
	public static void displayCounts(int[] counts) {
		for(int i=0; i<counts.length; i++) {
			if((i + 1) % 10 == 0) {
				System.out.println(counts[i] + " " + (char)(i + 'a'));
			} else {
				System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
			}
		}
	}

}
