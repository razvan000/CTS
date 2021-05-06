package mateescu.razvan.g1093.decorator;

public class ForegroundScript extends Script{
	String accounType;
	
	public ForegroundScript(String accountType, String currentWebsite) {
		super(currentWebsite);
		this.accounType=accountType;
	}

	@Override
	public void removeAds() {
		if(accounType=="PREMIUM") {
			System.out.println("Ads are now being removed. Thank you for supporting us.");
		}else {
			System.out.println("You must pay to use this feature");
		}
	}

	@Override
	public String generateRandomPassword() {
		// TODO Auto-generated method stub
		System.out.println("functionality not implemented");
		return "";
	}

	@Override
	public void searchAccount(String website) {
		System.out.println("No database access");
		
	}

	
}
