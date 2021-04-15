package ro.ase.csie.cts.decorator;

import ro.ase.csie.cts.adapter.ACMECharacter;

public class WoundedDecorator extends ACMEAbstractDecorator{

	public final static int MIN_POINTS = 200;
	
	public WoundedDecorator(ACMECharacter hero) {
		super(hero);
	}

	@Override
	public void move() {
		if(this.charcater.getLifePoints() < MIN_POINTS) {
			System.out.println("You can't move. Critically wounded");
		}else {
			this.charcater.move();
		}
	}

	
	
}
