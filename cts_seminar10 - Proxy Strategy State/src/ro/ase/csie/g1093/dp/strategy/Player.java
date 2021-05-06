package ro.ase.csie.g1093.dp.strategy;

public class Player {

	String username;
	int playtime;
	int experiencePoints;
	
	BonusStrategyInterface bonusCampaign = null;
	
	public void setStrategy(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign=bonusCampaign;
	}
	
	public Player(String username, int playtime, int experiencePoints) {
		super();
		this.username = username;
		this.playtime = playtime;
		this.experiencePoints = experiencePoints;
	}
	
	public void getExperiencePoints(int pointsReceived) {
		if(this.bonusCampaign!=null) {
			this.bonusCampaign.getBonusPoints(pointsReceived, this);
		}
	}
}
