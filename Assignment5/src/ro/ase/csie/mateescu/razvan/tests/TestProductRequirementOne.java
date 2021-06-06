package ro.ase.csie.mateescu.razvan.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.mateescu.razvan.exceptions.WrongNameException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongPriceException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongSoldItemsException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongWeekException;
import ro.ase.csie.mateescu.razvan.models.Product;
import ro.ase.csie.mateescu.razvan.tests.category.InterestingTest;

public class TestProductRequirementOne {
	static Product testProduct;
	static ArrayList<Integer> sales;
	static float initialPrice = 3.5f;
	static String initialName = "Coca Cola";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sales = new ArrayList<>();
		sales.add(20);
		sales.add(24);
		sales.add(18);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testProduct= new Product(initialName,initialPrice);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFirstConstructorConformanceForRightInput() throws WrongPriceException, WrongNameException {
		Product product = new Product(initialName,initialPrice);
		assertEquals("Asserting name",initialName,product.getName());
		assertEquals("Asserting price", initialPrice,product.getPrice(),0);
	}
	
	@Test
	public void testSecondConstructorConformanceForRightInput() throws WrongPriceException, WrongNameException, WrongSoldItemsException, WrongWeekException {
		Product product = new Product(initialName,initialPrice,sales);
		assertEquals("Asserting name",initialName,product.getName());
		assertEquals("Asserting price", initialPrice,product.getPrice(),0);
		for(int i=0;i<sales.size();i++) {
			assertEquals("Asserting sales", (int)sales.get(i),(int)product.getSoldItems(i));
		}
	}
	
	@Test(expected = WrongPriceException.class)
	public void testFirstConstructorErrorConditionOnPriceNegativeValue() throws WrongPriceException, WrongNameException {
		float errorPrice = Product.MIN_PRICE-1;
		Product product = new Product(initialName,errorPrice);
	}
	
	@Test(expected = WrongNameException.class)
	public void testFirstConstructorErrorConditionNameSmallLength() throws WrongPriceException, WrongNameException {
		String errorName = "Gum";
		Product product = new Product(errorName, initialPrice);
	}
	
	@Test(expected = WrongPriceException.class)
	public void testSecondConstructorErrorConditionOnPriceBigValue() throws WrongPriceException, WrongNameException, WrongSoldItemsException {
		float errorPrice = Product.MAX_PRICE+1;
		Product product = new Product(initialName,errorPrice, sales);
	}
	
	@Test(expected = WrongSoldItemsException.class)
	public void testSecondConstructorErrorConditionOnSoldItemsNull() throws WrongPriceException, WrongNameException, WrongSoldItemsException {
		Product product = new Product(initialName,initialPrice, null);
	}
	
	@Category({InterestingTest.class})
	@Test
	public void testSecondConstructorReference() throws WrongPriceException, WrongNameException, WrongSoldItemsException, WrongWeekException {
		Product product = new Product(initialName,initialPrice,sales);
		sales.set(0,1);
		if(sales.get(0)==product.getSoldItems(0)) {
			fail("Shallow copy");
		}else {
			assertTrue(true);
		}
	}
	
	@Test(expected = WrongSoldItemsException.class)
	public void testSecondConstructorExistenceNullReference() throws WrongPriceException, WrongNameException, WrongSoldItemsException {
		ArrayList<Integer> newSales;
		Product newProduct = new Product(initialName, initialPrice, null);
	}
	
	@Test
	public void testSetSalesReference() throws WrongWeekException, WrongSoldItemsException {
		testProduct.setSales(sales);
		sales.set(0,sales.get(0)+1);
		assertNotEquals("Testing shallow copy",(int)sales.get(0),(int)testProduct.getSoldItems(0));
		
	}
	
	@Test(expected = WrongSoldItemsException.class)
	public void testSetSalesExistence() throws WrongSoldItemsException {
		testProduct.setSales(null);
	}
}

















