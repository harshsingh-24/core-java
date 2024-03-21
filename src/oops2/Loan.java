package oops2;

import java.util.Date;

public class Loan {

	// Data fields - loanAmount, numberOfYears, Date, interestRate
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
	
	// Constructors
	/**
	 * Default Constructor
	 */
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	
	/**
	 * Constructing a loan object with specified interest rate, 
	 * number of years and loan amount
	 */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		this.loanDate = new Date();
	}

	// Getters and Setters 
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public int getNumberOfYears() {
		return numberOfYears;
	}


	public Date getLoanDate() {
		return loanDate;
	}

	// Methods
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
