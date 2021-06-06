package ro.ase.csie.mateescu.razvan.models;

import java.util.ArrayList;

import ro.ase.csie.mateescu.razvan.exceptions.WrongLimitException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongNameException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongPriceException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongSoldItemsException;
import ro.ase.csie.mateescu.razvan.exceptions.WrongWeekException;

/*
 * 
 * DISCLAIMER
 * Most of the given methods are implemented with bugs
 * Cele mai multe dintre metodele date au bug-uri 
 * 
 * 
 * SPECS
 * 
 * name - between 5 and 200 alpha-numeric chars (no special chars)
 * price - between [0.01, 100000)
 * soldItems - between [0, 1000]
 * 
 * 
 */

public class Product {
	public final static int MIN_NAME_LENGTH = 4;
	public final static int MAX_NAME_LENGTH = 199;
	public final static float MIN_PRICE = 0.01f;
	public final static float MAX_PRICE = 100000f;
	public final static int MIN_SOLD_ITEMS = 0;
	public final static int MAX_SOLD_ITEMS = 1000;
	
	private String name;
	private float price;
	private ArrayList<Integer> weeklySoldItems;		//number of items sold each week
	
	public Product(String name, float price) throws WrongPriceException, WrongNameException {
		if(price < 0.01f || price >= 100000) {
			throw new WrongPriceException();
		}
		if(name.length() <= 5 || name.length() >= 200) {
			throw new WrongNameException();
		}
		this.name = name;
		this.price = price;
		weeklySoldItems = new ArrayList<Integer>();
	}

	public Product(String name, float price, ArrayList<Integer> soldItems) throws WrongPriceException, WrongNameException, WrongSoldItemsException {
		if(price < 0.01f || price >= 100000) {
			throw new WrongPriceException();
		}
		if(name.length() <= 5 || name.length() >= 200) {
			throw new WrongNameException();
		}
		if(soldItems == null) {
			throw new WrongSoldItemsException();
		}
		this.name = name;
		this.price = price;
		this.weeklySoldItems = new ArrayList<Integer>();
		for(Integer n: soldItems)
			this.weeklySoldItems.add(n);
	}
	
	public void setSales(ArrayList<Integer> soldItems) throws WrongSoldItemsException {
		if(soldItems==null) {
			throw new WrongSoldItemsException();
		}
		if(this.weeklySoldItems.size()!=0) {
			this.weeklySoldItems.removeAll(weeklySoldItems);
		}
		for(int sale : soldItems) {
			this.weeklySoldItems.add(sale);
		}
	}

	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void addWeek(int soldItems) throws WrongSoldItemsException{
		if(soldItems< MIN_SOLD_ITEMS || soldItems > MAX_SOLD_ITEMS) {
			throw new WrongSoldItemsException();
		}
		weeklySoldItems.add(soldItems);
	}
	
	public int getSoldItems(int i) throws WrongWeekException{
		if(this.weeklySoldItems == null) {
			return 0;
		}
		if(i < 0 || i >= this.weeklySoldItems.size()) {
			throw new WrongWeekException();
		}
		return weeklySoldItems.get(i);
	}
	
	/*
	 * 
	 * determines the number of weeks with sales above the given limit
	 * determina numarul de saptamani in care au fost vandute un numar de produse peste limita data
	 * 
	 */
	public int getNoWeeksAboveLimit(int minLimit) throws WrongLimitException{
		if(this.weeklySoldItems==null||this.weeklySoldItems.size()==0) {
			return 0;
		}
		if(minLimit < MIN_SOLD_ITEMS || minLimit > MAX_SOLD_ITEMS) {
			throw new WrongLimitException();
		}
		int noWeeks = 0;
		for(int n: weeklySoldItems)
			if(n >= minLimit)
				noWeeks++;
		return noWeeks;
	}
	
	/*
	 * 
	 * determines the percentage (%) of weeks with sales under the given limit from total number of weeks
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari sub limita data
	 * 
	 */
	public int getPercentOfBadWeeks(int minLimit){
		float m = 0;
		for(Integer n: weeklySoldItems)
			if(n < minLimit)
				m += 1;
		
		return (int) (100 * m / this.weeklySoldItems.size());
	}
	
	/*
	 * 
	 * 
	 * determines the index of the weeks with maximum sales (multiple weeks can have maximum sales)
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot avea vanzari la nivel maxim)
	 * 
	 * 
	 */
	
	public ArrayList<Integer> getWeeksIndexWithMaxSales(){
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		int max = this.weeklySoldItems.get(0);
		
		for(int i = 0; i < this.weeklySoldItems.size(); i++)
			if(this.weeklySoldItems.get(i) > max)
				max = this.weeklySoldItems.get(i);
		for(int i = 0; i < this.weeklySoldItems.size(); i++)
			if(this.weeklySoldItems.get(i) == max)
				maxWeeks.add(this.weeklySoldItems.get(i));
		return maxWeeks;
	}
	
	@Override
	public String toString() {
		String output = this.name + " weekly sales: ";
		for(Integer n: weeklySoldItems)
			output += n + " ";
		return output;
	}	
}