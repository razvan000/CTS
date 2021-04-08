package ro.ase.csie.cts.dp.factory.method;

import ro.ase.csie.cts.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.dp.factory.simple.Pistol;
import ro.ase.csie.cts.dp.factory.simple.WeaponType;

public class TestFactoryMethod {

	public static void main(String[] args ) {
		
		boolean isWaterModeSet = false;
		
		if(isWaterModeSet) {
			AbstractWeapon pistol = new WaterPistol("Grey", 200);
		}else {
			AbstractWeapon pistol = new Pistol("Grey", 200);
			pistol.pwePew();
		}
		
		AbstractWeaponFactory theFactory = null;
		theFactory = (isWaterModeSet) ? new KidsModeFactory() : new RealModeFactory();
		
		AbstractWeapon pistol = theFactory.getWeapon(WeaponType.PISTOL, "red");
	}
}
