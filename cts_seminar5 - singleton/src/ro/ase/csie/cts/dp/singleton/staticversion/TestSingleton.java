package ro.ase.csie.cts.dp.singleton.staticversion;

public class TestSingleton {

	public static void main(String[] args) {
		
		RESTBackend backend= RESTBackend.theBackend;
		
		//you have to remove this possibility by creating a private vonstructor
		//RESTBackend backend2 = new RESTBackend();

	}

}
