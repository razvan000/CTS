package ro.ase.csie.cts.seminar3.stage3;

import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.seminar3.exceptions.InvalideAccountAgeException;
import ro.ase.csie.cts.seminar3.stage3.services.MarketingInterface;
import ro.ase.csie.cts.seminar3.stage3.services.MkStrategySpring2021;
import ro.ase.csie.cts.seminar3.stage3.services.ValidatorInterface;
import ro.ase.csie.cts.seminar3.stage3.services.ValidatorService;

public class Product {
	
	MarketingInterface mkService = null;
	ValidatorInterface validatorService=null;
	
	public Product(MarketingInterface mkService, ValidatorInterface validatorService) {
		if(mkService==null) {
			throw new  NullPointerException();
		}
		if(validatorService==null) {
			throw new NullPointerException();
		}
		this.mkService=mkService;
		this.validatorService=validatorService;
	}
	
	public void setMarketingStrategy(MarketingInterface mkInterface) {
		if(mkService==null) {
			throw new  NullPointerException();
		}

		this.mkService=mkInterface;
	}

	public static float getPriceWithDiscount(float initialPrice, float discountValue) {
		return initialPrice - (discountValue * initialPrice);
	}
			
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalideAccountAgeException {
		validatorService.validatePrice(initialPrice);
		validatorService.validateAccountAge(accountAgeInYears);
		float fidelityDiscount =
				(productType==ProductType.NEW)? 0 : mkService.getFidelityDiscount(accountAgeInYears);
		
		float discountValue = productType.getDiscount();
		float priceWithDiscount=getPriceWithDiscount(initialPrice, discountValue);
		float finalPrice = priceWithDiscount*(1-fidelityDiscount);
		
		return finalPrice;
	}
}