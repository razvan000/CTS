package ro.ase.csie.cts.dp.factory.simple;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AbstractWeapon pistol = new Pistol("black", 100);
//		AbstractWeapon machineGun = new MachineGun("red");
//		AbstractWeapon bazooka = new Bazooka("black", 1000, 500);
		
		AbstractWeapon weapon =
				WeaponFactory.getWeapon(WeaponType.PISTOL, "black");
		
		weapon = WeaponFactory.getWeapon(WeaponType.MACHINE_GUN,"red");
		weapon = WeaponFactory.getWeapon(WeaponType.BAZOOKA, "green");
		
	}

}
