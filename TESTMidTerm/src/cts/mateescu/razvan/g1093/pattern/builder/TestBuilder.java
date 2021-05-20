package cts.mateescu.razvan.g1093.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {

		HotelBooking mamaiaBooking = new HotelBooking.HotelBookingBuilder("Rex", "Constanta")
				.isSmoker()
				.setNumberOfGuests(3)
				.hasSeaView()
				.build();
		mamaiaBooking.displayDetails();
		
		HotelBooking mountainsBooking = new HotelBooking.HotelBookingBuilder("Pensiunea Safir", "Ranca")
				.setFloorNumber(5)
				.setTypeOfBeds("King Size")
				.isBreakfastIncluded()
				.build();
		mountainsBooking.displayDetails();
		
		HotelBooking greeceBooking = new HotelBooking.HotelBookingBuilder("Zeus Hotel", "Athena")
				.hasSeaView()
				.setNumberOfGuests(2)
				.isSmoker()
				.isBreakfastIncluded()
				.build();
		greeceBooking.displayDetails();
	}
}
