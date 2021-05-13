package ro.ase.csie.dp.chain;

public abstract class GenericMessageHandler {

	GenericMessageHandler next=null;
	
	public abstract void processMessage(Message message);

	public GenericMessageHandler getNext() {
		return next;
	}

	public void setNext(GenericMessageHandler next) {
		this.next = next;
	}
	
	
}
