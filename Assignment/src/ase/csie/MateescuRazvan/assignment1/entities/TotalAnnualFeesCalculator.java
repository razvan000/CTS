package ase.csie.MateescuRazvan.assignment1.entities;

public class TotalAnnualFeesCalculator {
	private static final double brokerFee = 0.125;
	private static final int oneYearPeriod = 365;

	public double calculateActivityPercentage(int activeDays) {
		return activeDays / oneYearPeriod;
	}

	public double calculateTotalInterestPercentage(double interestPercentRate, int activeDays) {
		double annualActivityPercentage = calculateActivityPercentage(activeDays);
		return Math.pow(interestPercentRate, annualActivityPercentage);
	}

	public double calculateTotalInterestPayable(double principal, double totalInterest) {
		return principal * (totalInterest - 1);
	}

	public double calculateTotalFees(Account[] accounts) {
		double totalFee=0.0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountType() == AccountType.PREMIUM.getAccountTypeNumber()
					|| accounts[i].getAccountType() == AccountType.SUPER_PREMIUM.getAccountTypeNumber()) {
				double totalInterestPercent = calculateTotalInterestPercentage(accounts[i].getInterestPercentRate(),
						accounts[i].getDaysActive());
				double totalInterestPayableValue = calculateTotalInterestPayable(accounts[i].getLoanValue(),
						totalInterestPercent);
				totalFee += brokerFee * totalInterestPayableValue;
			}
		}
		return totalFee;
	}
}
