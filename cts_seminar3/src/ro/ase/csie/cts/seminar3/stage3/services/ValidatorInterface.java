package ro.ase.csie.cts.seminar3.stage3.services;

import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.seminar3.exceptions.InvalideAccountAgeException;

public interface ValidatorInterface {

	public  void validatePrice(float price) throws InvalidPriceException;
	public  void validateAccountAge(int accountAgeInYears) throws InvalideAccountAgeException;

}
