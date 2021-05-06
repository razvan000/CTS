package mateescu.razvan.g1093.decorator;

public abstract class ScriptAbstractDecorator extends Script{

	Script script=null;
	public ScriptAbstractDecorator(Script script) {
		super(script.getCurrentWebsite());
		this.script=script;
	}

	@Override
	public String getCurrentWebsite() {
		
		return this.script.getCurrentWebsite();
	}

	@Override
	public void removeAds() {
		this.script.removeAds();
		
	}

	@Override
	public String generateRandomPassword() {
		
		return this.script.generateRandomPassword();
	}

	@Override
	public void searchAccount(String website) {
		
		this.script.searchAccount(website);
	}
	
	

	
}
