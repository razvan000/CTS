package ro.ase.csie.cts.dp.singleton;


public class RESTBackend {
	String url;
	String data;
	
	//eager instantiation
	// -> the object is created before anyone asks for it
	// exp:
	/*
	private static RESTBackend backendInstanceEager = new RESTBackend();
	*/
	
	private static RESTBackend backendInstance = null;
	
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	private RESTBackend() {
		
	}
	
	public void sendGET() {
		System.out.println("Send GET command to "+ this.url);
	}
	
	//lazy instantiation implementation
	// -> the object is created only when someone needs it
	public static synchronized RESTBackend getBackendInstance() {
		if(backendInstance==null) {
			String urlString="www.acs.ase.ro/game";
			String dataString="get backend connection";
			backendInstance=new RESTBackend(urlString,dataString);
		}
		return backendInstance;
	}
	
}
