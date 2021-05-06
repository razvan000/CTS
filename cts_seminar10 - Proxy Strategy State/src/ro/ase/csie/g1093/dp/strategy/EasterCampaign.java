package ro.ase.csie.g1093.dp.strategy;

public class EasterCampaign implements BonusStrategyInterface {

	@Override
	public void getBonusPoints(int points, Player player) {
		if(player.playtime > 5) {
			player.experiencePoints += (2*points);
		}
	}
	
}
