package ro.ase.csie.mateescu.razvan.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.mateescu.razvan.models.Product;
import ro.ase.csie.mateescu.razvan.tests.category.InterestingTest;

public class TestProductRequirementThree {

	static Product testProduct;
	static ArrayList<Integer> sales;
	static float initialPrice = 3.5f;
	static String initialName = "Coca Cola";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sales = new ArrayList<>();
		sales.add(20);
		sales.add(19);
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
	public void testGetPercentOfBadWeeksRightInput() {
		int limit = 20;
		int expectedValue = 0;
		for(int i=0; i<sales.size(); i++) {
			if (sales.get(i)<limit) {
				expectedValue++;
			}
		}
		expectedValue = 100*expectedValue / sales.size();
		assertEquals("Testing right input", expectedValue, testProduct.getPercentOfBadWeeks(limit));
	}
	
	@Test
	public void testGetWeeksIndexWithMaxSalesRightInput() {
		ArrayList<Integer> expectedWeeks = new ArrayList<>();
		int max = sales.get(0);
		for(int sale : sales) {
			if (sale > max) {
				max = sale;
			}
		}
		for(int sale : sales) {
			if (sale == max) {
				expectedWeeks.add(sale);
			}
		}
		
		ArrayList<Integer> computedArray = testProduct.getWeeksIndexWithMaxSales();
		for(int i=0; i< expectedWeeks.size(); i++) {
			if(expectedWeeks.get(i)!=computedArray.get(i)) {
				fail("Are not the same");
			}
		}
		assertTrue(true);
	}

	@Category({InterestingTest.class})
	@Test
	public void testGetPercentOfBadWeeksInverse() {
		int limit = 20;
		int expectedValue = 0;
		for(int i=0; i<sales.size(); i++) {
			if (sales.get(i)>=limit) {
				expectedValue++;
			}
		}
		expectedValue = 100*expectedValue / sales.size();
		int inverseValue = 100 - testProduct.getPercentOfBadWeeks(limit);
		assertEquals(expectedValue,inverseValue);
	}
	
	@Test
	public void testGetWeeksIndexWithMaxSalesInverse() {
		ArrayList<Integer> maxWeeks = testProduct.getWeeksIndexWithMaxSales();
		for(int sale : sales) {
			for(int week : maxWeeks) {
				if(sale > week) {
					fail("It is not a maximum week");
				}
			}
		}
		assertTrue(true);
	}
	
	@Category({InterestingTest.class})
	@Test
	public void testGetWeeksIndexWithMaxSalesCrossCheck() {
		int maxWeek = Collections.max(sales);
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		for(int sale : sales) {
			if(sale == maxWeek) {
				maxWeeks.add(sale);
			}
		}
		assertArrayEquals(maxWeeks.toArray(),testProduct.getWeeksIndexWithMaxSales().toArray());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
