package ro.ase.csie.mateescu.razvan.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.mateescu.razvan.exceptions.WrongLimitException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongNameException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongPriceException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongSoldItemsException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongWeekException;
import ro.ase.csie.mateescu.razvan.models.Product;
import ro.ase.csie.mateescu.razvan.tests.category.InterestingTest;

public class TestProductRequirementTwo {

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
		testProduct = new Product(initialName,initialPrice,sales);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddWeekRightValue() throws WrongSoldItemsException, WrongWeekException {
		int expectedValue = testProduct.getSoldItems(sales.size()-1)-1;
		testProduct.addWeek(expectedValue);
		assertEquals("Testing for same value on the last element",
				(int)expectedValue,(int) testProduct.getSoldItems(sales.size()));
	}

	@Test
	public void getSoldItemsRightValue() throws WrongWeekException {
		int expectedValue = sales.get(0);
		assertEquals("Testing for same value on first element of sales",
				(int)expectedValue,(int)testProduct.getSoldItems(0));
	}
	
	@Test
	public void testGetNoWeeksAboveLimitRightValue() throws WrongLimitException {
		int minLimit = 0;
		int expectedValue =0;
		for(int sale : sales) {
			if (sale>0) {
				expectedValue+=1;
			}
		}
		assertEquals("Testing with right value", expectedValue, testProduct.getNoWeeksAboveLimit(minLimit));
	}

	@Test(expected = WrongSoldItemsException.class)
	public void testAddWeekRangeValueAboveHigherLimit() throws WrongSoldItemsException {
		testProduct.addWeek(Product.MAX_SOLD_ITEMS+1);
	}
	
	@Test(expected = WrongWeekException.class)
	public void testGetSoldItemsRangeBigValue() throws WrongWeekException {
		testProduct.getSoldItems(sales.size());
	}

	@Test(expected = WrongLimitException.class)
	public void testGetNoWeeksAboveLimitRangeBigValue() throws WrongLimitException {
		testProduct.getNoWeeksAboveLimit(Product.MAX_SOLD_ITEMS+1);
	}
	
	@Test
	public void testAddWeekBoundaryLowerLimit() throws WrongSoldItemsException, WrongWeekException {
		int expectedValue = Product.MIN_SOLD_ITEMS;
		testProduct.addWeek(expectedValue);
		assertEquals("Testing for lower limit",expectedValue,
				testProduct.getSoldItems(sales.size()));
	}
	
	@Test
	public void testAddWeekBoundaryUpperLimit() throws WrongSoldItemsException, WrongWeekException {
		int expectedValue = Product.MAX_SOLD_ITEMS;
		testProduct.addWeek(expectedValue);
		assertEquals("Testing for upper limit",expectedValue,
				testProduct.getSoldItems(sales.size()));
	}
	
	@Test 
	public void testGetSoldItemsLowerLimit() throws WrongWeekException {
		int expectedValue = sales.get(0);
		assertEquals("Testing for lower limit", expectedValue,
				testProduct.getSoldItems(0));
	}

	@Test 
	public void testGetSoldItemsUpperLimit() throws WrongWeekException {
		int expectedValue = sales.get(sales.size()-1);
		assertEquals("Testing for upper limit", expectedValue,
				testProduct.getSoldItems(sales.size()-1));
	}
	
	@Test
	public void testGetNoWeeksAboveLimitLowerLimit() throws WrongLimitException {
		int minValue = Product.MIN_SOLD_ITEMS;
		int expectedValue=0;
		for(int sale : sales) {
			if (sale > minValue) {
				expectedValue+=1;
			}
		}
		assertEquals("Testing for lower limit", expectedValue,
				testProduct.getNoWeeksAboveLimit(minValue));
	}
	
	@Test
	public void testGetNoWeeksAboveLimitUpperLimit() throws WrongLimitException {
		int minValue = Product.MAX_SOLD_ITEMS;
		int expectedValue=0;
		for(int sale : sales) {
			if (sale > minValue) {
				expectedValue+=1;
			}
		}
		assertEquals("Testing for upper limit", expectedValue,
				testProduct.getNoWeeksAboveLimit(minValue));
	}
	
	@Category({InterestingTest.class})
	@Test
	public void testGetNoWeeksAboveLimitCardinalityZero() throws WrongLimitException, WrongSoldItemsException {
		ArrayList<Integer> salesCardinalityZero = new ArrayList<>();
		testProduct.setSales(salesCardinalityZero);
		int expectedValue = 0;
		assertEquals("Testing cardinality 0", expectedValue,testProduct.getNoWeeksAboveLimit(20));
	}

	@Test
	public void testGetNoWeeksAboveLimitCardinalityOne() throws WrongLimitException, WrongSoldItemsException {
		ArrayList<Integer> salesCardinalityOne = new ArrayList<>();
		salesCardinalityOne.add(Product.MAX_SOLD_ITEMS);
		testProduct.setSales(salesCardinalityOne);
		int expectedValue = 1;
		assertEquals("Testing cardinality 0", expectedValue,testProduct.getNoWeeksAboveLimit(20));
	}

	@Test
	public void testGetNoWeeksAboveLimitOrderingAscendinglySorted() throws WrongLimitException, WrongSoldItemsException {
		ArrayList<Integer> sortedSales = new ArrayList<>();
		for(int i=30; i<40;i+=2) {
			sortedSales.add(i);
		}
		int expectedValue = 0;
		int limit = 35;
		for(int i=0;i<sortedSales.size();i++) {
			if ( sortedSales.get(i) > 35 ) {
				expectedValue+=1;
			}
		}
		testProduct.setSales(sortedSales);
		assertEquals("Testing ordering with ascending array",expectedValue,
				testProduct.getNoWeeksAboveLimit(limit));
	}
	
	@Test
	public void testGetNoWeeksAboveLimitOrderingDescendinglySorted() throws WrongLimitException, WrongSoldItemsException {
		ArrayList<Integer> sortedSales = new ArrayList<>();
		for(int i=60; i>40;i-=2) {
			sortedSales.add(i);
		}
		int expectedValue = 0;
		int limit = 35;
		for(int i=0;i<sortedSales.size();i++) {
			if ( sortedSales.get(i) > 35 ) {
				expectedValue+=1;
			}
		}
		testProduct.setSales(sortedSales);
		assertEquals("Testing ordering with descending array",expectedValue,
				testProduct.getNoWeeksAboveLimit(limit));
	}

	@Category({InterestingTest.class})
	@Test
	public void testGetNoWeeksAboveLimitPerformance() throws WrongLimitException, WrongSoldItemsException {
		int noWeeks = 1000;
		ArrayList<Integer> weeksArrayList = new ArrayList<>();
		Random random = new Random();
		for(int i=0 ; i<noWeeks; i++) {
			weeksArrayList.add(random.nextInt((testProduct.MAX_SOLD_ITEMS)+1));
		}
		int limit = random.nextInt((testProduct.MAX_SOLD_ITEMS)+1);
		testProduct.setSales(weeksArrayList);
		long tStart = System.currentTimeMillis();
		testProduct.getNoWeeksAboveLimit(limit);
		long tFinal = System.currentTimeMillis();
		long delta = tFinal-tStart;
		int performanceLimit = 3000;
		if(delta <= performanceLimit) {
			assertTrue(true);
		}else {
			fail("Performance test fails");
		}
	}
	
	@Test
	public void testGetSoldItemsExistence() throws WrongLimitException, WrongSoldItemsException, WrongPriceException, WrongNameException {
		ArrayList<Integer> newSoldItems = new ArrayList<>();
		Product newProducct = new Product(initialName,initialPrice,newSoldItems);
		int expectedValue = 0;
		assertEquals("Testing existence with null value", expectedValue,
				newProducct.getNoWeeksAboveLimit(0));
	}

	@Category({InterestingTest.class})
	@Test
	public void testGetNoWeeksAboveLimitInverse() throws WrongLimitException {
		int limit = 20;
		int noWeeksBelowLimit = 0;
		for(int sale : sales) {
			if (sale < limit ) {
				noWeeksBelowLimit += 1;
			}
		}
		int weeksAboveLimit = testProduct.getNoWeeksAboveLimit(limit);
		int sumOfAllWeeks = noWeeksBelowLimit + weeksAboveLimit;
		if(sumOfAllWeeks != sales.size()) {
			fail("The weeks do not add up");
		}
		assertTrue(true);
	}


}






















