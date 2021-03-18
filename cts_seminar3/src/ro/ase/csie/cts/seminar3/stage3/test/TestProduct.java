package ro.ase.csie.cts.seminar3.stage3.test;

import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.seminar3.exceptions.InvalideAccountAgeException;
import ro.ase.csie.cts.seminar3.stage3.Product;
import ro.ase.csie.cts.seminar3.stage3.ProductType;
import ro.ase.csie.cts.seminar3.stage3.services.MarketingInterface;
import ro.ase.csie.cts.seminar3.stage3.services.MkStrategySpring2021;
import ro.ase.csie.cts.seminar3.stage3.services.ValidatorService;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(new MkStrategySpring2021(), new ValidatorService());
		float finalPrice=0;
		try {
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT,100, 12);
			System.out.println("The final price is "+ finalPrice);
			
			product.setMarketingStrategy(new MarketingInterface() {
				
				@Override
				public float getFidelityDiscount(int accountAgeInYears) {
					// TODO Auto-generated method stub
					return 0.5f;
				}
			});
			
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT,100, 12);
			System.out.println("The final price is "+ finalPrice);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalideAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
