package ro.ase.csie.g1093.dp.proxy;

public class LoginModule implements LoginInterface{

	String serverIP;
	String dbConnection;
	
	public LoginModule(String serverIP, String dbConnection) {
		super();
		this.serverIP = serverIP;
		this.dbConnection = dbConnection;
	}

	@Override
	public boolean login(String username, String password) {
		System.out.println("Connecting to the database: "+dbConnection);
		if(username.toLowerCase().equals("admin")&& password.equals("1234admin")) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public boolean checkServerStatus() {
		return true;
	}
	
	
}
