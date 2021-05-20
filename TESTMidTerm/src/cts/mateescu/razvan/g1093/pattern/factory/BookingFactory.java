package cts.mateescu.razvan.g1093.pattern.factory;


public class BookingFactory {

	public static OnlineBooking getBooking(BookingType type, String eventName, int price) {
		OnlineBooking booking = null;
		switch (type) {
		case CONCERT:
			booking = new ConcertBooking(eventName, price);
			break;
		case MUSEUM:
			booking = new MuseumBooking(eventName,price);
			break;
		case EVENTS:
			booking = new EventsBooking(eventName, price);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return booking;
	}
}
