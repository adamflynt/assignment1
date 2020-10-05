package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	private double FV;
	private int years;

	
	public CheckingAccount (double checkingAccountOpeningBalance, int years) {
		this.balance = checkingAccountOpeningBalance;
		this.interestRate = 0.00001;
		this.years = 3;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public boolean withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("You have withdrawn $" + amount + "and your current Checking balance is now $" + balance);
			return true;
		} else {
			System.out.println("You cannot withdraw $" + amount +" which is more than your balance of $" + balance);
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("You have deposited $" + amount + " and your current Checking balance is now $" + balance);
			return true;
		} else {
			System.out.println("You cannot deposit a negative amount of " + amount + " dollars.");
			return false;
		}
	}
	
	public double futureValue(int years) {
		double value = 0.00;
		this.years = years;
		double powered = Math.pow((1 + interestRate), years);
		value = balance * powered;
		FV = value;
		return FV;
	}
	
	public String toString() {
		double FV = futureValue(years);
		DecimalFormat df = new DecimalFormat("0.##");
		return "Checking Account Balance: " + df.format(balance) + 
				"\n Checking Account Interest Rate: " + interestRate +
				"\n Checking Account Balance in " + years + " years: " + df.format(FV);
	}
	
}