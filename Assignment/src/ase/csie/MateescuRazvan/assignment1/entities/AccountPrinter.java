package ase.csie.MateescuRazvan.assignment1.entities;

public class AccountPrinter {
	
	public String makeAccountReport(Account account) {
		return "Loan: " + account.getLoanValue() + "; rate: " + account.getInterestPercentRate() + "; days active:" + account.getDaysActive() + "; Type: "
				+ account.getAccountType() + ";";
	}

	public void printAccount() {
		System.out.println("This is an account");
	}
}
