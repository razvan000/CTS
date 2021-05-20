package cts.mateescu.razvan.g1093.pattern.factory;

public class EventsBooking extends OnlineBooking{

	BookingType type;
	
	public EventsBooking(String eventName, int price) {
		super(eventName, price);
		this.type=BookingType.EVENTS;
	}

	@Override
	public String getType() {
		return this.type.toString();
	}

}
