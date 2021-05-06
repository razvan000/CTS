package mateescu.razvan.g1093.singleton;

public class BackgroundScript {
	public BackgroundScript(){
		DatabaseConnection connection= DatabaseConnection.connectToDB("root","root");
	}
}
