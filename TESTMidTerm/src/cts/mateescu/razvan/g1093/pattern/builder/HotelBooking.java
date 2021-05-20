package cts.mateescu.razvan.g1093.pattern.builder;

import cts.mateescu.razvan.g1093.pattern.factory.OnlineBooking;

public class HotelBooking {

	private String hotelName;
	private String location;
	
	private boolean isBreakfastIncluded;
	private boolean hasSeaView;
	private boolean isSmoker;
	
	private int floorNumber;
	private int numberOfGuests;
	private String bedsType;
	
	private HotelBooking() {}
	
	public static class HotelBookingBuilder{
		HotelBooking hotelBooking;
		
		public HotelBookingBuilder(String hotelName, String location) {
			this.hotelBooking=new HotelBooking();
			this.hotelBooking.hotelName=hotelName;
			this.hotelBooking.location=location;
		}
		
		public HotelBookingBuilder isBreakfastIncluded() {
			this.hotelBooking.isBreakfastIncluded=true;
			return this;
		}
		
		public HotelBookingBuilder hasSeaView() {
			this.hotelBooking.hasSeaView=true;
			return this;
		}
		
		public HotelBookingBuilder isSmoker() {
			this.hotelBooking.isSmoker=true;
			return this;
		}
		
		public HotelBookingBuilder setFloorNumber(int floor) {
			this.hotelBooking.floorNumber=floor;
			return this;
		}
		
		public HotelBookingBuilder setNumberOfGuests(int numberOfGuests) {
			this.hotelBooking.numberOfGuests=numberOfGuests;
			return this;
		}
		
		public HotelBookingBuilder setTypeOfBeds(String typeOfBeds) {
			this.hotelBooking.bedsType=typeOfBeds;
			return this;
		}
		
		public HotelBooking build() {
			return this.hotelBooking;
		}
	}
	
	public void displayDetails() {
		System.out.println(
				String.format("Reservation for %s in %s", this.hotelName, this.location));
		if(this.isSmoker) {
			System.out.println("\t - with smoking privileges");
		}
		if(this.hasSeaView) {
			System.out.println("\t - with view to the seaside");
		}
		if(this.isBreakfastIncluded) {
			System.out.println("\t - with included breakfast");
		}
	}
	
}
