package mathCharStrings;

public class FormattingDemo {

	public static void main(String[] args) {
		
		double amount = 12618.98;
		double interestRate = 0.0013;
		double interest = amount * interestRate;
		System.out.printf("Interest is: $%4.2f", interest);
		
		// 4 -> field width              _ _ 1_ 6_ ._ 4_ 0_  
		// 2 -> precision after decimal  : 16.78423 (.2f)-> 16.78 (.3f) -> .16784 
		// f - floating point number

	}

}
