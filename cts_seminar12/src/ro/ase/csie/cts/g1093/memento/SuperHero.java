package ro.ase.csie.cts.g1093.memento;

public class SuperHero {

	String name;
	int lifepoints;
	String magic;
	
	public SuperHero(String name, int lifepoints, String magic) {
		super();
		this.name = name;
		this.lifepoints = lifepoints;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println("is attacking");
	}
	
	public void heal(int points) {
		this.lifepoints+=points;
	}
	
	public void takesAHit(int points) {
		this.lifepoints-=points;
	}
	
	public HeroMemento createRestorePoint() {
		return new HeroMemento(this.name, this.lifepoints, this.magic);
	}
	
	public void restore(HeroMemento memento) {
		this.name = memento.name;
		this.lifepoints=memento.lifepoints;
		this.magic=memento.magic;
	}
}
