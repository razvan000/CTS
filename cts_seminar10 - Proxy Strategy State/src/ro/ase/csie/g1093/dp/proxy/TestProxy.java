package ro.ase.csie.g1093.dp.proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		LoginInterface loginModule = new LoginModule("10.0.0.1","users");
		
		if(loginModule.login("admin", "admin1234")) {
			System.out.println("Hello admin");
		}else {
			System.out.println("Wrong credentials");
		}
		
		loginModule = new LoginWith2FactorAuth(loginModule);
		
		String[] passwords = new String[] {"1234", "123456", "admin",
				"1234admin"};
	
		for(String password : passwords) {
			if(loginModule.login("admin",password)) {
				System.out.println("Found it: "+ password);
				break;
			}
		}
	}

}
