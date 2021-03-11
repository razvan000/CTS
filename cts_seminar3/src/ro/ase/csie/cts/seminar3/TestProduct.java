package ro.ase.csie.cts.seminar3;

import ro.ase.csie.cts.seminar3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.seminar3.exceptions.InvalideAccountAgeException;
import ro.ase.csie.cts.seminar3.stage1.Product;
import ro.ase.csie.cts.seminar3.stage1.ProductType;

public class TestProduct {

	public static void main(String[] args) throws InvalidPriceException, InvalideAccountAgeException {
		// TODO Auto-generated method stub
		Product product= new Product();
		
		product.getFinalPrice(ProductType.DISCOUNT,1, 0);
	}

}
