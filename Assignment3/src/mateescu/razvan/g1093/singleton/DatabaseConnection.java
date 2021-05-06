package mateescu.razvan.g1093.singleton;

public class DatabaseConnection {
	String username;
	String password;
	
	private static DatabaseConnection dbInstance = null;
	
	private DatabaseConnection(String username, String password) {
		this.username=username;
		this.password=password;
		System.out.println("connecting to DB with credentials: "+username +" "+password);
	}
	
	public static synchronized DatabaseConnection connectToDB(String username, String password) {
		if(dbInstance==null) {
			dbInstance=new DatabaseConnection(username,password);
		}
		return dbInstance;
	}
}
