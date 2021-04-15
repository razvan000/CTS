package ro.ase.csie.cts.decorator;

import ro.ase.csie.cts.adapter.ACMECharacter;

public class ArmorDecorator extends ACMEAbstractDecorator {
	
	int armorLevel;

	public ArmorDecorator(ACMECharacter hero, int armorLevel) {
		super(hero);
		this.armorLevel=armorLevel;
	}

	@Override
	public void takeAHit(int points) {
		int lostPoints = points - armorLevel;
		if(lostPoints > 0) {
			this.charcater.takeAHit(lostPoints);
		}
		super.takeAHit(points);
	}
	
	
	
}
