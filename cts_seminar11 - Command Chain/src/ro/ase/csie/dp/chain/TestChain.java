package ro.ase.csie.dp.chain;

public class TestChain {

	public static void main(String[] args) {
		GenericMessageHandler filterModule = new FilterModule("English");
		GenericMessageHandler privateMessageModule = new PrivateMessageModule();
		GenericMessageHandler groupMessageModule = new BroadcastMessageModule();
		
//		filterModule.next = privateMessageModule;
//		privateMessageModule.next = groupMessageModule;
//		GenericMessageHandler chatServer = filterModule;
//		chatServer.processMessage(new Message("Hello John","@john",9));
//		chatServer.processMessage(new Message("this chat is violent","@everyone",100));
//		chatServer.processMessage(new Message("join my server","@everyone",1));

		filterModule.setNext(privateMessageModule);
		privateMessageModule.setNext(groupMessageModule);
		GenericMessageHandler chatServer = filterModule;
		chatServer.processMessage(new Message("Hello John","@john",9));
		chatServer.processMessage(new Message("this chat is violent","@everyone",100));
		chatServer.processMessage(new Message("join my server","@everyone",1));
		
		
	}

}
