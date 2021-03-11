package ro.ase.csie.cts.seminar3.stage1;

public enum ProductType {
//	enums are used to define constant references
	NEW(0), DISCOUNT(0.1f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float discount;
	
	private ProductType(float discount) {
		this.discount = discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
}
