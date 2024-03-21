package oops;

import java.util.Date;

public class Loan {
	
	// Data fields (properties), actions
	// annualInterestRate, numberOfYears, loanAmount, loanDate
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	/** Default Constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	/**
	 * Construct a loan object with specified annual interest rate,
	 * number of years and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}
	
	// Behaviour of class is defined by methods
	
	// Getters and setters for annualInterestRate, numberOfYears, loanAmount
	// Getters for loanDate

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}
	
	// Methods and Behaviours
	/** Find monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 
				- (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		
		return monthlyPayment;
	}
	
	
	/** 
	 * Find total payment
	 */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * 12 * numberOfYears;
		return totalPayment;
	}
	
}
