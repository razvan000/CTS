package ro.ase.csie.dp.chain;

public class PrivateMessageModule extends GenericMessageHandler{

	@Override
	public void processMessage(Message message) {
		if(!message.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Private message for "+message.destination);
	
		}else {
			if(this.next != null) {
				this.next.processMessage(message);
			}
		}
	}

	
}
