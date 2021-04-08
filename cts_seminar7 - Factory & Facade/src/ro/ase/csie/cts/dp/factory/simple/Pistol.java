package ro.ase.csie.cts.dp.factory.simple;

public class Pistol extends AbstractWeapon{
	
	public Pistol(String color, int power) {
		super(color, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pwePew() {
		System.out.println("--- --- -->");
	}
	
}
