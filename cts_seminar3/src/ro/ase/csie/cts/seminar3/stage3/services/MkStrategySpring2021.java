package ro.ase.csie.cts.seminar3.stage3.services;

public class MkStrategySpring2021 implements MarketingInterface{

	@Override
	public float getFidelityDiscount(int accountAgeInYears) {
		// TODO Auto-generated method stub
		return (accountAgeInYears>MAX_ACCOUNT_AGE)?MAX_FIDELITY_DISCOUNT:(float)accountAgeInYears/100;
	}
	
}
