package ro.ase.csie.cts.dp.singleton.staticversion;

public class RESTBackend {

	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	//static class initialiser
	static {
		System.out.println("Is executed when the class is loaded by the JVM");
		theBackend=new RESTBackend();
		theBackend.url="www.acs.ase.ro/cts";
	}
	
	{
		System.out.println("Is executed before any constructor call");
	}
	
	private RESTBackend() {
		
	}
	
}
