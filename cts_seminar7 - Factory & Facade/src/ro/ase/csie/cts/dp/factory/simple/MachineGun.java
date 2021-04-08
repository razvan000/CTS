package ro.ase.csie.cts.dp.factory.simple;

public class MachineGun extends AbstractWeapon{

	public MachineGun(String color) {
		super(color, 500);
	}

	@Override
	public void pwePew() {
		System.out.println("-> -> -> ->");
	}
	
	

}
