package mateescu.razvan.g1093.singleton;

public class ForegroundScript {
	public ForegroundScript() {
		DatabaseConnection connection= DatabaseConnection.connectToDB("root","root");
	}
}