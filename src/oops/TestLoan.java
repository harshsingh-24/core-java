package oops;

import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Enter the annual Interest Rate
		System.out.println("Enter annual interest rate (in percentage): ");
		double annualInterestRate = input.nextDouble();
		
		System.out.println("Enter number of years (integer): ");
		int numberOfYears = input.nextInt();
		
		// Enter a loan amount
		System.out.println("Enter loan amount or principal: ");
		double loanAmount = input.nextDouble();
		
		// Created a loan object here
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		// Display the loan date, monthly payment and total payment
		System.out.printf("The loan created on %s\n" + 
				"The monthly payment is %.2f\nThe total payment is %.2f\n", 
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), 
				loan.getTotalPayment());
	}

}
