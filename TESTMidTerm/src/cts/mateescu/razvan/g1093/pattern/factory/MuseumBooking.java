package cts.mateescu.razvan.g1093.pattern.factory;

public class MuseumBooking extends OnlineBooking{
	BookingType type;
	
	public MuseumBooking(String eventName, int price) {
		super(eventName, price);
		this.type=BookingType.MUSEUM;

	}


	@Override
	public String getType() {
		return this.type.toString();
	}
	
}
