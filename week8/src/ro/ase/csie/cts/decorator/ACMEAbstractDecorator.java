package ro.ase.csie.cts.decorator;

import ro.ase.csie.cts.adapter.ACMECharacter;

public abstract class ACMEAbstractDecorator extends ACMECharacter{

	ACMECharacter charcater = null;
	 public ACMEAbstractDecorator(ACMECharacter hero) {
		 super(hero.getName(), hero.getLifePoints());
		 this.charcater=hero;
	 }
	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.charcater.move();
		
	}
	
	
	@Override
	public int getLifePoints() {
		// TODO Auto-generated method stub
		return this.charcater.getLifePoints();
	}
	@Override
	public void takeAHit(int points) {
		// TODO Auto-generated method stub
		this.charcater.takeAHit(points);
		
	}
	@Override
	public void heal(int points) {
		// TODO Auto-generated method stub
		this.charcater.heal(points);
		
	}
	 
	 
}
