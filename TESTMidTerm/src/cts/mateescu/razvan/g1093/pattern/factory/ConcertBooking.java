package cts.mateescu.razvan.g1093.pattern.factory;

public class ConcertBooking extends OnlineBooking{

	BookingType type;
	
	public ConcertBooking(String eventName, int price) {
		super(eventName, price);
		this.type=BookingType.CONCERT;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return this.type.toString();
	}

}
