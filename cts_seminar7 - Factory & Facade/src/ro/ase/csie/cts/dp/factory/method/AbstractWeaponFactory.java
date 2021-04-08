package ro.ase.csie.cts.dp.factory.method;

import ro.ase.csie.cts.dp.factory.simple.AbstractWeapon;
import ro.ase.csie.cts.dp.factory.simple.WeaponType;

public abstract class AbstractWeaponFactory {

	public abstract AbstractWeapon getWeapon(WeaponType type, String color);
	
}
