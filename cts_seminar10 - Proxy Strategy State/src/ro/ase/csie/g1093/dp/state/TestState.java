package ro.ase.csie.g1093.dp.state;

public class TestState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperHero superman = new SuperHero("Superman", 500);
		superman.move();
		superman.takeAHit(350);
		superman.move();
		superman.takeAHit(120);
		superman.move();
		superman.heal(390);
		superman.move();
	}

}
