package ro.ase.csie.cts.dp.singleton;

public class TestGame {

	public static void main(String[] args) {
		
		RESTBackend backend = RESTBackend.getBackendInstance();
		
		UIModule uiModule=new UIModule();
		PlayerModule playerModule = new PlayerModule();

		
		
	}
}
