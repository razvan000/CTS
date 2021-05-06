package mateescu.razvan.g1093.decorator;

public abstract class  Script{
	String currentWebsite;
	
	public Script(String currentWebsite) {
		super();
		this.currentWebsite=currentWebsite;
	}
	
	public String getCurrentWebsite() {
		
		return currentWebsite;
	}
		
	public abstract void removeAds();
	
	public abstract String generateRandomPassword();
	
	public abstract void searchAccount(String website);
}
