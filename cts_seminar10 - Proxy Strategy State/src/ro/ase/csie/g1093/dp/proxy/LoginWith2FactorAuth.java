package ro.ase.csie.g1093.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface {

	LoginInterface loginModule = null;
	
	public LoginWith2FactorAuth(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkGeneratedCode(int code) {
		if(code == 12345) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean login(String username, String password) {
		if(this.loginModule.login(username, password)) {
			System.out.println("Please input the generated code that "
					+ "you have received over email");
			if(checkGeneratedCode(1245)) {
				System.out.println("Hello "+ username);
				return true;
			}
		}
		System.out.println("Not accepted");
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		return this.loginModule.checkServerStatus();
	}

	
}
