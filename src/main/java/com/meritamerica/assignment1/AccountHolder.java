package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount = null;
	private SavingsAccount savingsAccount = null;
	
	public AccountHolder(){
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
					double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance,0);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance,0);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.##");
		return "Name: " + firstName + " " + middleName + " " + lastName +
				"\n SSN: " + ssn +
				"\n Checking Account Balance: $" + df.format(checkingAccount.getBalance()) +
				"\n Checking Account Interest Rate: " + checkingAccount.getInterestRate() +
				"\n Checking Account Balance in 3 years: $" + df.format(checkingAccount.futureValue(3)) +
				"\n Savings Account Balance : $" + df.format(savingsAccount.getBalance()) +
				"\n Savings Account Interest Rate: " + savingsAccount.getInterestRate() +
				"\n Savings Account Balance in 3 years: $" + df.format(savingsAccount.futureValue(3));
		
	}
}