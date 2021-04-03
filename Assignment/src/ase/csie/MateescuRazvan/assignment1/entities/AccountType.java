package ase.csie.MateescuRazvan.assignment1.entities;

public enum AccountType {
	STANDARD(0), BUDGET(1), PREMIUM(2), SUPER_PREMIUM(3);

	private final int accountTypeNumber;

	private AccountType(int accountTypeNumber) {
		this.accountTypeNumber = accountTypeNumber;
	}

	public int getAccountTypeNumber() {
		return this.accountTypeNumber;
	}
}
