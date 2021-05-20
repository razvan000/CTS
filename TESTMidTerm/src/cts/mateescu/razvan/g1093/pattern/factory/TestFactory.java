package cts.mateescu.razvan.g1093.pattern.factory;

public class TestFactory {
	public static void main(String agrs[]) {

		OnlineBooking booking = BookingFactory.getBooking(BookingType.CONCERT, "Sala Palatului Stefan Banica", 200);
		booking.displayDescription();
		booking = BookingFactory.getBooking(BookingType.MUSEUM, "Expozitie dinozauri Muzeul de Geologie", 90);
		booking.displayDescription();
		booking = BookingFactory.getBooking(BookingType.EVENTS, "Circul Globus in Bucuresti", 70);
		booking.displayDescription();
	}
}
