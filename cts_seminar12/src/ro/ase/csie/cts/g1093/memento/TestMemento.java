package ro.ase.csie.cts.g1093.memento;

public class TestMemento {

	public static void main(String[] args) {
		SuperHero superman = new SuperHero("Superman", 200, "Fly");
		
		HeroMemento initialSave = superman.createRestorePoint();
		
		superman.takesAHit(120);
		
		System.out.println("Lifepoints: "+superman.lifepoints);
		
		superman.restore(initialSave);
		System.out.println("Lifepoints: "+superman.lifepoints);

	}
}
