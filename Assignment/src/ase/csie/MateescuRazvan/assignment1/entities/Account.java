package ase.csie.MateescuRazvan.assignment1.entities;

import ase.csie.MateescuRazvan.assignment1.exceptions.InvalidInterestRateException;
import ase.csie.MateescuRazvan.assignment1.exceptions.InvalidLoanValueException;
import ase.csie.MateescuRazvan.assignment1.interfaces.InterestRatePayable;

public class Account implements InterestRatePayable {
	private double loanValue;
	private double interestPercentRate;
	private int daysActive;
	private int accountType;

	public Account(double loanValuevalue, double interestRate, AccountType accountType)
			throws InvalidLoanValueException, InvalidInterestRateException {
		if (loanValuevalue < 0) {
			throw new InvalidLoanValueException();
		}
		if (interestRate < 0) {
			throw new InvalidInterestRateException();
		}
		this.interestPercentRate = interestRate;
		this.accountType = accountType.getAccountTypeNumber();
	}

	public double getLoanValue() {
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}

	public void setLoanValue(double loanValue) throws InvalidLoanValueException {
		if (loanValue < 0)
			throw new InvalidLoanValueException();
		else {
			this.loanValue = loanValue;
		}
	}

	public double getInterestRate() {
		System.out.println("The rate is " + interestPercentRate);
		return this.interestPercentRate;
	}

	@Override
	public double getMonthlyInterestRateValue() {
		return loanValue * interestPercentRate;
	}

	public double getInterestPercentRate() {
		return this.interestPercentRate;
	}

	public int getDaysActive() {
		return this.daysActive;
	}

	public int getAccountType() {
		return this.accountType;
	}

}
