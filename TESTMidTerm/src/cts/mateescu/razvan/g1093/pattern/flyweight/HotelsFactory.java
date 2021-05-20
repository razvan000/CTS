package cts.mateescu.razvan.g1093.pattern.flyweight;

import java.util.HashMap;

public class HotelsFactory {

	static HashMap<String, Hotel> models = new HashMap<>();
	
	static {
		models.put(YearPeriods.SUMMER.toString(), new Hotel("Dobrogea"));
		models.put(YearPeriods.WINTER.toString(),new Hotel("Banat"));
		models.put(YearPeriods.AUTUMN.toString(),new Hotel("Apuseni"));
	}
	
	public static Hotel getModel(YearPeriods yearPeriod) {
		return models.get(yearPeriod.toString());
	}
}
