package ro.ase.csie.cts.seminar6.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
//		SuperHero superHero = new SuperHero();
//		// initialise all attributes . ... .....
//		
//		SuperHero superHero2 = new SuperHero("Superman",
//								100, false, false, new Weapon(),
//								null, new Flying(), null);
		
		SuperHero superman =
				new SuperHero.SuperHeroBuilder("Superman", 2000).build();
		
		SuperHero joker = 
				new SuperHero.SuperHeroBuilder("Joker", 1900)
				.isVillain()
				.isWounded()
				.setSuperPower(new SuperPowerInterface() {})
				.build();
	}

}
