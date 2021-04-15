package ro.ase.csie.cts.decorator;

import ro.ase.csie.cts.adapter.ACMECharacter;
import ro.ase.csie.cts.adapter.FantasyCharacter;

public class DecoratorTest {

	public static void main(String[] args) {
	ACMECharacter dragon = new FantasyCharacter("Blue dragon", 1000);
	dragon.move();
	dragon.takeAHit(200);
	dragon.heal(100);
	
	dragon  = new ArmorDecorator(dragon, 300);
	dragon.takeAHit(350);
	
	dragon = new WoundedDecorator(dragon);
	dragon.takeAHit(300);
	dragon.move();
	}
}
