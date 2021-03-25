package ro.ase.csie.cts.dp.singleton.registry;

public class TestSingletonRegistry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RESTBackend backend1= RESTBackend.getRESTBackend("10.0.0.253", "profile");
		RESTBackend backend2= RESTBackend.getRESTBackend("10.0.0.253", "profile");
		
		if(backend1==backend2) {
			System.out.println("They point to the same object");
		}else {
			System.out.println("They re different");
		}
		
		backend2= RESTBackend.getRESTBackend("192.168.100.1", "profile");
		if(backend1==backend2) {
			System.out.println("They point to the same object");
		}else {
			System.out.println("They re different");
		}
	}

}
