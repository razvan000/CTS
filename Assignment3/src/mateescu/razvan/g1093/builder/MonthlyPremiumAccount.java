package mateescu.razvan.g1093.builder;

public class MonthlyPremiumAccount implements PremiumAccountInterface{

	@Override
	public void removeAds() {
		System.out.println("Ads removed");
		
	}

	@Override
	public void getHackingNews() {
		System.out.println("Yearly premium is needed");
		
	}

}
