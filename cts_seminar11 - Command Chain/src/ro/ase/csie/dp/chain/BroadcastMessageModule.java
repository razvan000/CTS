package ro.ase.csie.dp.chain;

public class BroadcastMessageModule extends GenericMessageHandler{

	@Override
	public void processMessage(Message message) {
		if(message.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Group message, msg:"+message.text);
	
		}
		if(this.next !=null) {
			this.next.processMessage(message);
		}
	}
	
}
