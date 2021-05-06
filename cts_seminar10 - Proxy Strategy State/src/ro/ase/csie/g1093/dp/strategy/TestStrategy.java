package ro.ase.csie.g1093.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		Player player = new Player("knm", 10, 100);
		player.setStrategy(new NoCampaign());
		
		player.getExperiencePoints(150);
		System.out.println("points: "+ player.experiencePoints);
		
		player.setStrategy(new EasterCampaign());
		player.getExperiencePoints(150);
		System.out.println("points: "+ player.experiencePoints);
		
		player.setStrategy(new SummerCampaign());
		player.getExperiencePoints(150);
		System.out.println("points: "+ player.experiencePoints);
	}

}
