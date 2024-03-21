package selections;

import java.util.Scanner;
public class SwitchExample {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int num = input.nextInt(); // 1
		
		switch(num) { // int, char, byte, short, String
			
			case 0:  System.out.println("0"); // num == 0
				
			case 1: System.out.println("1"); // num == 1
				
			case 2: System.out.println("2"); break; // break
				
			case 3: System.out.println("3");  break;
				 
			default: System.out.println("None of the 0, 1, 2, 3");
		
		}
		
	}
	
}
