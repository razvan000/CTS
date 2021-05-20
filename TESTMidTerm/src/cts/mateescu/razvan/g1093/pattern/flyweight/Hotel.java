package cts.mateescu.razvan.g1093.pattern.flyweight;

public class Hotel implements GalleryDisplayInterface {
	
	String region;
	
	@Override
	public void display(GalleryImage image) {
		System.out.println("Displaying "+image.bitmapName);
		
	}
	
	public Hotel(String region) {
		super();
		this.region = region;
	}



}
