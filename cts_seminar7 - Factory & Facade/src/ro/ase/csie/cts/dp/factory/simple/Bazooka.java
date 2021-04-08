package ro.ase.csie.cts.dp.factory.simple;

public class Bazooka extends AbstractWeapon {
	int distance;
	
	public Bazooka(String color, int power, int distance) {
		super(color, power);
		this.distance=distance;
	}

	@Override
	public void pwePew() {
		System.out.println("brbrbrbrbrbr");
		
	}

	
}
