package ro.ase.csie.cts.seminar3.stage3.services;

import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.seminar3.exceptions.InvalideAccountAgeException;

public class ValidatorService implements ValidatorInterface{

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if(price<=0) {
			throw new InvalidPriceException();
		}
			
	}

	@Override
	public void validateAccountAge(int accountAgeInYears) throws InvalideAccountAgeException {
		if(accountAgeInYears<0) {
			throw new InvalideAccountAgeException();
		}
	}

}
