package mateescu.razvan.g1093.factory;

public abstract class AbstractCryptoMethod {
	String type;
	String password;
	String key;
	
	public  AbstractCryptoMethod(String type, String password, String key) {
		this.type=type;
		this.password=password;
		this.key=key;
	}
	
	public abstract void accountAction();
}
