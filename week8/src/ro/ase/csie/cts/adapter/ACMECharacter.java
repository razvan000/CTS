package ro.ase.csie.cts.adapter;


public abstract class ACMECharacter {
	String name; 
	int lifePoints;
	
	
	public ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}


	public String getName() {
		return name;
	}


	public int getLifePoints() {
		return lifePoints;
	}

	public abstract void move(); 
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
}