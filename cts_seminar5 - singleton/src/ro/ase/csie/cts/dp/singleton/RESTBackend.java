package ro.ase.csie.cts.dp.singleton;


public class RESTBackend {
	String url;
	String data;
	
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
	
	public static synchronized RESTBackend getBackendInstance() {
		if(backendInstance==null) {
			String urlString="www.acs.ase.ro/game";
			String dataString="get backend connection";
			backendInstance=new RESTBackend(urlString,dataString);
		}
		return backendInstance;
	}
	
}
